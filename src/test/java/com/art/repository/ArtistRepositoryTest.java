package com.art.repository;

import com.art.entity.Artist;
import com.art.entity.Sex;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;


@DataJpaTest
class ArtistRepositoryTest {

    @Autowired
    private ArtistRepository artistRepository;

    @PersistenceContext
    private EntityManager em;


    @Test
    void save() {

        Artist artist = Artist.builder().firstName("seonho").lastName("shin").sex(Sex.Man).build();

        artistRepository.save(artist);

        em.flush();
        em.clear();

        Artist savedArtist = artistRepository.findById(artist.getId()).orElseThrow();

        assertThat(savedArtist.getFirstName()).isEqualTo("seonho");
    }

}
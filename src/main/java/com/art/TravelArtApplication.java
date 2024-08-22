package com.art;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


//@EnableJpaAuditing
@SpringBootApplication
public class TravelArtApplication {

    public static void main(String[] args) {
        SpringApplication.run(TravelArtApplication.class, args);
    }


//    @Bean
//    public AuditorAware<String> auditorAware() {
//        // 원래는 쿠키나 세션 같이 개인정보 id 가져와서 하는 부분
//        return () -> Optional.of(UUID.randomUUID().toString());
//    }
}

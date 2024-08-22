package com.art.entity;

import java.time.LocalDate;
import jakarta.persistence.MappedSuperclass;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;


//@EntityListeners(AuditingEntityListener.class)
@MappedSuperclass
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public abstract class BaseEntity {

    @CreationTimestamp
    private LocalDate createDate;

    @UpdateTimestamp
    @LastModifiedDate
    private LocalDate updateDate;

    @CreatedBy
    private String createBy;

    @LastModifiedBy
    private String updateBy;
}

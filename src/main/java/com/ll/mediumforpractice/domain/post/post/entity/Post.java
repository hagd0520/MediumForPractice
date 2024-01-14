package com.ll.mediumforpractice.domain.post.post.entity;

import com.ll.mediumforpractice.domain.member.member.entity.Member;
import com.ll.mediumforpractice.global.jpa.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.*;

import static jakarta.persistence.FetchType.LAZY;
import static lombok.AccessLevel.PROTECTED;

@Entity
@Builder
@AllArgsConstructor(access = PROTECTED)
@NoArgsConstructor(access = PROTECTED)
@Getter
@Setter
public class Post extends BaseEntity {
    @ManyToOne(fetch = LAZY)
    private Member author;
    private String title;
    private String body;
    private boolean isPublished;
    @Setter(PROTECTED)
    private long hit;

    public void increaseHit() {
        hit++;
    }

}

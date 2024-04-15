package com.example.unicupidbackend.domain;

import com.example.unicupidbackend.domain.enums.Religion;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.DynamicUpdate;

import java.util.Date;

@Entity
@Getter
@Builder
@DynamicUpdate
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "ideal_type")
public class IdealType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "member_id")
    private Member member;//멤버와 1대1 매핑

    private String email;
    private Date birth;
    private int height;
    private int weight;
    private String univ_name;
    private String major;
    private String address;
    private String profile_img;

    @Column(columnDefinition = "TINYINT(1)")
    private boolean smoke; // 0: 비흡연자, 1: 흡연자
    //enum 타입 -> 추가 선언 예정
    @Enumerated(EnumType.STRING)
    private Religion religion;

        /*
    drink enum [not null]
    smoke boolean [not null]
    mbti enum [not null]
    body_shape enum [not null]
    love_values enum [not null]
     */


}

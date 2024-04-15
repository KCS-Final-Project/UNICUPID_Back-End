package com.example.unicupidbackend.domain;

import com.example.unicupidbackend.domain.enums.Religion;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.DynamicUpdate;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Builder
@DynamicUpdate
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "member_id")
    private Long id;

    @OneToOne(mappedBy = "member", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private IdealType idealType;

    @OneToOne(mappedBy = "member", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Membership membership;

    @OneToMany(mappedBy = "blocker")
    private List<BlackList> blockingList = new ArrayList<>();

    @OneToMany(mappedBy = "blocked")
    private List<BlackList> blockedList = new ArrayList<>();

    @OneToMany(mappedBy = "sender")
    private List<Favor> sentLikes = new ArrayList<>();

    @OneToMany(mappedBy = "receiver")
    private List<Favor> receivedLikes = new ArrayList<>();

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
    //enum 타입
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

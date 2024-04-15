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
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "memeber_id")
    private Long id;

    private String email;
    private Date birth;
    private int height;
    private int weight;
    private String univ_name;
    private String major;
    private String address;
    private String profile_img;
    private boolean smoke;
    //enum 타입
    private Religion religion;

}

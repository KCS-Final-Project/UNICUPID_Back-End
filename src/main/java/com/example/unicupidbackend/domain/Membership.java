package com.example.unicupidbackend.domain;

import com.example.unicupidbackend.domain.enums.MembershipStatus;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.DynamicUpdate;

@Entity
@Getter
@Builder
@DynamicUpdate
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Membership {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "membership_id")
    private Long id;

    @OneToOne
    @JoinColumn(name = "student_id")
    private Member member;//멤버와 1대1 매핑//student

    private String univ_mail;

    @Enumerated(EnumType.STRING)
    private MembershipStatus membershipStatus;


}

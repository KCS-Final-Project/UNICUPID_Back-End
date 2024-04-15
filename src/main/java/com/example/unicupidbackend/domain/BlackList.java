package com.example.unicupidbackend.domain;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.DynamicUpdate;

@Entity
@Getter
@Builder
@DynamicUpdate
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "black_list")
public class BlackList {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "blocker_id")
    private Member blocker;

    @ManyToOne
    @JoinColumn(name = "blocked_id")
    private Member blocked;

    @Column(columnDefinition = "TINYINT(1)")
    private boolean black_status;//0: 비활성화 1: 활성화
}
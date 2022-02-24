package com.Model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;


@Entity
@Table(name="usertable")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class User {

    @Id
    @GeneratedValue()
    private int userId;

    @Column(name = "username", length = 16, nullable = false)
    private String username;

    @Column(name = "nickname", length = 16, nullable = false)
    private  String nickname;

    @Column(name = "email", length = 24, nullable = false)
    private String email;

    @ManyToOne(fetch = FetchType.EAGER)
    private Ranking ranking;

    @Column(name = "victories", columnDefinition = "integer default 0", nullable = false)
    private Integer victories;

    @Column(name = "totalmatches", columnDefinition = "integer default 0", nullable = false)
    private Integer totalmatches;


}

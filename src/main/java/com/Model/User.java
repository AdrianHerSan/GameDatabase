package com.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

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

    @Column(name = "username", length = 16)
    private String username;

    @Column(name = "nickname", length = 16)
    private  String nickname;

    @Column(name = "email", length = 24)
    private String email;

    @ManyToOne(fetch = FetchType.EAGER)
    private Ranking ranking;

    @JsonIgnoreProperties("users")
    @ManyToMany(mappedBy = "users")
    private Set<Match> matches;

    @JsonIgnoreProperties("users")
    @ManyToMany(mappedBy = "users")
    private List<Character> characters;






}

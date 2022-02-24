package com.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "GameParticipation")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
//Entity for matching users, matches and characters
public class GameParticipation {

    @Id
    @GeneratedValue
    private Integer gameId;

    @ManyToOne
    private User user;

    @ManyToOne
    private Match match;

    @ManyToOne
    private Character character;

    @Column(name = "victory")
    private boolean victory;

    @Column(name = "team")
    private int team;
}

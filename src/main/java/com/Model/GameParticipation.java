package com.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

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
    private int GameId;

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

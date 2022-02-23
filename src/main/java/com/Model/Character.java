package com.Model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;


@Entity
@Table(name = "charactertable")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Character {

    @Id
    @GeneratedValue
    private int characterId;

    @Column(name = "charactername", length = 16)
    private String characterName;

}

package com.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

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

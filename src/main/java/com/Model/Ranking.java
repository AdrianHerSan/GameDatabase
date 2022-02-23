package com.Model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "RankingTable")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Ranking {

    @Id
    private int id;

    @Column()
    private String name;

}

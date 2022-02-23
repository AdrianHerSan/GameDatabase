package com.Model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;
import java.util.Set;

@Entity
@Table(name="matchtable")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Match {

    @Id
    @GeneratedValue
    private int matchId;

    @Column
    private Timestamp start;

    @Column
    private Timestamp end;

    @Column
    private boolean finished;

}

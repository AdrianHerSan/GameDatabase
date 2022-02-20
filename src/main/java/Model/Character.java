package Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "charactertable")
@AllArgsConstructor
@Getter
@Setter
public class Character {

    @Id
    @GeneratedValue
    private int characterId;

    @Column(name = "charactername", length = 16)
    private String characterName;

}

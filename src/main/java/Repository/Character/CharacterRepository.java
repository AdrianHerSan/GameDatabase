package Repository.Character;

import DemoGameDataBase.java.Model.Character;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CharacterRepository extends JpaRepository<Character, Integer> {
}

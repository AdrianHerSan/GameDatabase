package com.Repository.GameParticipation;

import com.Model.GameParticipation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GameParticipationRepository extends JpaRepository<GameParticipation, Integer> {

    Integer CountByIdAndVictoryTrue(Integer id);
}

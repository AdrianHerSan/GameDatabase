package com.Response;

import com.Model.GameParticipation;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Getter
@Setter
public class GameParticipationResponse {


    private List<Optional<GameParticipation>> games;

    private HttpStatus status;

    private String description;
}

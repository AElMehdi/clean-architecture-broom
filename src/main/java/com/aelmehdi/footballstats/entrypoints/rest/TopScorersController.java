package com.aelmehdi.footballstats.entrypoints.rest;

import com.aelmehdi.footballstats.core.entities.Player;
import com.aelmehdi.footballstats.core.use_cases.TopScorers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static java.util.stream.Collectors.toList;
import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
public class TopScorersController {

    private TopScorers topScorers;

    @Autowired
    public TopScorersController(TopScorers topScorers) {
        this.topScorers = topScorers;
    }

    @GetMapping(path = "top-scorers", produces = APPLICATION_JSON_VALUE)
    List<PlayerDto> topScorers() {
        return topScorers.execute()
                .stream()
                .map(this::toPlayerDto)
                .collect(toList());
    }

    private PlayerDto toPlayerDto(Player player) {
        PlayerDto playerDto = new PlayerDto();
        playerDto.setFirstName(player.firstName());
        playerDto.setLastName(player.lastName());
        playerDto.setAge(player.age());
        playerDto.setNationality(player.nationality());
        playerDto.setGoals(player.goals());
        playerDto.setAssists(player.assists());
        return playerDto;
    }
}

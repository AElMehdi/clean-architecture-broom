package com.aelmehdi.footballstats.core.use_cases;

import com.aelmehdi.footballstats.core.entities.Player;

import java.util.Comparator;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class TopScorers {
    private PlayerProvider playerProvider;

    public TopScorers(PlayerProvider playerProvider) {
        this.playerProvider = playerProvider;
    }

    public List<Player> execute() {
        Comparator<Player> byBestScorers = Comparator
                .comparing(Player::goals, Integer::compareTo)
                .reversed()
                .thenComparing(Player::lastName)
                .thenComparing(Player::firstName);

        return playerProvider
                .getTopScorers()
                .stream()
                .sorted(byBestScorers)
                .collect(toList());

    }
}

package com.aelmehdi.footballstats.core.use_cases;

import com.aelmehdi.footballstats.core.entities.Player;

public class TopScorers {
    private PlayerProvider playerProvider;

    public TopScorers(PlayerProvider playerProvider) {
        this.playerProvider = playerProvider;
    }

    public Iterable<Player> execute() {
        return playerProvider.getTopScorers();
    }
}

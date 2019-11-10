package com.aelmehdi.footballstats.core.use_cases;

import com.aelmehdi.footballstats.core.entities.Player;

import java.util.List;

interface PlayerProvider {

    List<Player> getTopScorers();
}

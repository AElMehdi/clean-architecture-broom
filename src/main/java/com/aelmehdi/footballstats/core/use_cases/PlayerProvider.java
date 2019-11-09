package com.aelmehdi.footballstats.core.use_cases;

import com.aelmehdi.footballstats.core.entities.Player;

interface PlayerProvider {

    Iterable<Player> getTopScorers();
}

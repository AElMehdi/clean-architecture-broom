package com.aelmehdi.footballstats.core.use_cases;

import com.aelmehdi.footballstats.core.entities.Player;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.util.Lists.newArrayList;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class TopScorersTest {

    @Mock
    private PlayerProvider playerProvider;

    @InjectMocks
    private TopScorers topScorers;

    @Test
    void should_return_la_liga_top_scorers_ordered() {
        when(playerProvider.getTopScorers()).thenReturn(unorderedTopScorers());

        assertThat(topScorers.execute()).containsExactly(
                player("Karim", "Benzema", 9),
                player("Lionel", "Messi", 8),
                player("Gerard", "Moreno", 8));
    }

    private Iterable<Player> unorderedTopScorers() {
        return newArrayList(
                player("Gerard", "Moreno", 8),
                player("Karim", "Benzema", 9),
                player("Lionel", "Messi", 8));
    }

    private Player player(String firstName, String lastName, int goals) {
        return Player
                .builder()
                .firstName(firstName)
                .lastName(lastName)
                .goals(goals)
                .build();
    }
}
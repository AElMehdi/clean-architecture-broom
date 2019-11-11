package com.aelmehdi.footballstats.entrypoints.rest;

import com.aelmehdi.footballstats.core.entities.Player;
import com.aelmehdi.footballstats.core.use_cases.TopScorers;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import static org.assertj.core.util.Lists.newArrayList;
import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@ExtendWith(SpringExtension.class)
@WebMvcTest
@AutoConfigureMockMvc
class TopScorersControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private TopScorers topScorers;

    @Test
    void should_return_a_list_of_top_scorers() throws Exception {
        Mockito.when(topScorers.execute()).thenReturn(
                newArrayList(
                        player("Karim", "Benzema", 9),
                        player("Lionel", "Messi", 8),
                        player("Gerard", "Moreno", 8)
                )
        );

        mockMvc.perform(get("/top-scorers")
                .contentType(APPLICATION_JSON_VALUE))
                .andExpect(status().isOk())
                .andExpect(content().json(
                        "[\n" +
                                "  {\"firstName\": \"Karim\", \"lastName\": \"Benzema\", \"goals\": 9},\n" +
                                "  {\"firstName\": \"Lionel\", \"lastName\": \"Messi\", \"goals\": 8},\n" +
                                "  {\"firstName\": \"Gerard\", \"lastName\": \"Moreno\", \"goals\": 8}\n" +
                                "]\n"));
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
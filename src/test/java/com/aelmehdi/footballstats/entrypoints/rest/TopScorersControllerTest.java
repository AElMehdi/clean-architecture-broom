package com.aelmehdi.footballstats.entrypoints.rest;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@ExtendWith(SpringExtension.class)
@WebMvcTest
@AutoConfigureMockMvc
class TopScorersControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void should_return_a_list_of_top_scorers() throws Exception {
        mockMvc.perform(get("/top-scorers"))
                .andExpect(status().isOk())
                    .andExpect(content().string("Top scorers"));
    }
}
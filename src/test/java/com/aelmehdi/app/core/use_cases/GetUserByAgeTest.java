package com.aelmehdi.app.core.use_cases;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class GetUserByAgeTest {

    @Mock
    private UserProvider userProvider;
    @InjectMocks
    private GetUserByAge getUserByAge;

    @Test
    void should_return_user_by_name() {
        when(userProvider.getUser(25)).thenReturn("Mehdi");

        assertThat(getUserByAge.getUser(25)).isEqualTo("Mehdi");
    }

}

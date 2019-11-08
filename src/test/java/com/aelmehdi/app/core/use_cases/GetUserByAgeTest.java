package com.aelmehdi.app.core.use_cases;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import com.aelmehdi.app.core.entities.User;

@ExtendWith(MockitoExtension.class)
class GetUserByAgeTest {

    @Mock
    private UserProvider userProvider;

    @InjectMocks
    private GetUserByAge getUserByAge;

    @Test
    void should_return_user_by_name() {
        User expectedUser = new User("Mehdi", 25);
        when(userProvider.getUserByAge(25)).thenReturn(expectedUser);

        User user = getUserByAge.execute(25);

        assertThat(user).isEqualTo(expectedUser);
    }

}

package com.aelmehdi.app.database;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import com.aelmehdi.app.core.entities.User;
import com.aelmehdi.dataproviders.database.UserDatabaseProvider;
import com.aelmehdi.dataproviders.database.UserJpa;
import com.aelmehdi.dataproviders.database.UserRepository;

@ExtendWith(MockitoExtension.class)
class UserDatabaseProviderTest {

   @Mock
   private UserRepository userRepository;

   @InjectMocks
   UserDatabaseProvider userDatabaseProvider;

   @Test
   void should_return_user_by_age() {
      User expectedUser = new User("Mehdi", 25);
      when(userRepository.findUserByAge(25))
            .thenReturn(new UserJpa("Mehdi", 25));

      assertThat(userDatabaseProvider.getUserByAge(25))
            .isEqualTo(expectedUser);
   }
}

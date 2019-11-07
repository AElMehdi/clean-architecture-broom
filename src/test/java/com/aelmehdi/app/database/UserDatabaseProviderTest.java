package com.aelmehdi.app.database;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class UserDatabaseProviderTest {

   @Mock
   private UserRepository userRepository;

   @InjectMocks
   UserDatabaseProvider userDatabaseProvider;

   @Test
   void should_return_user_by_age() {
      when(userRepository.findUserByAge(25))
            .thenReturn(new UserJpa("Mehdi", 25));

      assertThat(userDatabaseProvider.getUserByAge(25))
            .isEqualTo("Mehdi");
   }
}

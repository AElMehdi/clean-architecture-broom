package com.aelmehdi.footballstats.entrypoints.console;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import com.aelmehdi.footballstats.core.entities.User;
import com.aelmehdi.footballstats.core.use_cases.GetUserByAge;

// TODO: Need to do better to test the 'console' not just the provider's method
@ExtendWith(MockitoExtension.class)
class DisplayUserTest {

   @Mock
   private GetUserByAge getUserByAge;

   @InjectMocks
   private DisplayUser displayUser;

   @Test
   void should_display_user() {
      DisplayableUser expectedDisplayableUser = new DisplayableUser("Mehdi", 25, "Software Engineer");

      Mockito.when(getUserByAge.execute(25)).thenReturn(new User("Mehdi", 25));

      DisplayableUser displayableUser = displayUser.getDisplayableUser();

      assertThat(displayableUser).isEqualToComparingFieldByField(expectedDisplayableUser);
   }
}

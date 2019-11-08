package com.aelmehdi.app.entrypoints.console;

import static java.lang.System.*;

import com.aelmehdi.app.core.entities.User;
import com.aelmehdi.app.core.use_cases.GetUserByAge;

public class DisplayUser {

   private GetUserByAge getUserByAge;

   private DisplayUser(GetUserByAge getUserByAge) {
      this.getUserByAge = getUserByAge;
   }


   // Used just for the sake of example
   public void display() {
      DisplayUser displayUser = new DisplayUser(getUserByAge);

      out.println(displayUser.getDisplayableUser());
   }

   DisplayableUser getDisplayableUser() {
      // 25 corresponds to a value coming from a Driver as an input
      // Keep it hard coded for now
      User user = getUserByAge.execute(25);
      return toDisplayableUser(user);
   }

   private DisplayableUser toDisplayableUser(User user) {
      // Displayable user is slightly different from the entity 'user' to demonstrate that we can have different models
      return new DisplayableUser(user.getName(), user.getAge(), "Software Engineer");
   }
}

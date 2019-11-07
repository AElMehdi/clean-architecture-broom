package com.aelmehdi.app.database;

import com.aelmehdi.app.core.use_cases.UserProvider;

public class UserDatabaseProvider implements UserProvider {

   private UserRepository userRepository;

   public UserDatabaseProvider(UserRepository userRepository) {
      this.userRepository = userRepository;
   }


   @Override
   public UserJpa getUserByAge(int age) {
      return userRepository.findUserByAge(age);
   }
}

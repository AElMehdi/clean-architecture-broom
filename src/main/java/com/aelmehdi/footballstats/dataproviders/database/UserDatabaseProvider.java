package com.aelmehdi.footballstats.dataproviders.database;

import com.aelmehdi.footballstats.core.entities.User;
import com.aelmehdi.footballstats.core.use_cases.UserProvider;

public class UserDatabaseProvider implements UserProvider {

   private UserRepository userRepository;

   public UserDatabaseProvider(UserRepository userRepository) {
      this.userRepository = userRepository;
   }


   @Override
   public User getUserByAge(int age) {
      UserJpa userByAge = userRepository.findUserByAge(age);

      return new User(userByAge.getName(), userByAge.getAge());
   }
}

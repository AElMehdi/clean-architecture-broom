package com.aelmehdi.app.dataproviders.database;

// Should be used for db mapping
public class UserJpa {
   private String name;
   private int age;

   public UserJpa(String name, int age) {
      this.name = name;
      this.age = age;
   }

   String getName() {
      return name;
   }

   int getAge() {
      return age;
   }
}

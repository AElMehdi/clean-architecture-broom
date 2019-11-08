package com.aelmehdi.app.core.entities;

import java.util.Objects;

public class User {
    private String name;
    private int age;

   public User(String name, int age) {
      this.name = name;
      this.age = age;
   }


   public String getName() {
      return name;
   }

   public int getAge() {
      return age;
   }

   @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (age != user.age) return false;
        return Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        return result;
    }
}

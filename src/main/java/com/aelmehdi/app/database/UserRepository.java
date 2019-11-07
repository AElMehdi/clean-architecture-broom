package com.aelmehdi.app.database;

public interface UserRepository {
   UserJpa findUserByAge(int age);
}

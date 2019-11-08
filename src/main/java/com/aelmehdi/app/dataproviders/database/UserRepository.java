package com.aelmehdi.app.dataproviders.database;

public interface UserRepository {
   UserJpa findUserByAge(int age);
}

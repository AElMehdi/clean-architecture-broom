package com.aelmehdi.dataproviders.database;

public interface UserRepository {
   UserJpa findUserByAge(int age);
}

package com.aelmehdi.footballstats.dataproviders.database;

public interface UserRepository {
   UserJpa findUserByAge(int age);
}

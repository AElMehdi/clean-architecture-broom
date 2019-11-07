package com.aelmehdi.app.core.use_cases;

import com.aelmehdi.app.database.UserJpa;

public interface UserProvider {
    UserJpa getUserByAge(int age);
}

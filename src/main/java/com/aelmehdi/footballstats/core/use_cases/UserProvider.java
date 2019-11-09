package com.aelmehdi.footballstats.core.use_cases;

import com.aelmehdi.footballstats.core.entities.User;

public interface UserProvider {
    User getUserByAge(int age);
}
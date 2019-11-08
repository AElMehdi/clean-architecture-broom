package com.aelmehdi.app.core.use_cases;

import com.aelmehdi.app.core.entities.User;

public interface UserProvider {
    User getUserByAge(int age);
}

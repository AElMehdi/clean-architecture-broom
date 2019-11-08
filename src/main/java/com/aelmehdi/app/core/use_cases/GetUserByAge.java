package com.aelmehdi.app.core.use_cases;

import com.aelmehdi.app.core.entities.User;

public class GetUserByAge {

    private UserProvider userProvider;

    public GetUserByAge(UserProvider userProvider) {
        this.userProvider = userProvider;
    }

    public User execute(int age) {
        return userProvider.getUserByAge(age);
    }
}

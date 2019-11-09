package com.aelmehdi.footballstats.core.use_cases;

import com.aelmehdi.footballstats.core.entities.User;

public class GetUserByAge {

    private UserProvider userProvider;

    public GetUserByAge(UserProvider userProvider) {
        this.userProvider = userProvider;
    }

    public User execute(int age) {
        return userProvider.getUserByAge(age);
    }
}

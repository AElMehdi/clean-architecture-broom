package com.aelmehdi.app.core.use_cases;

public class GetUserByAge {

    private UserProvider userProvider;

    public GetUserByAge(UserProvider userProvider) {
        this.userProvider = userProvider;
    }

    public String getUser(int age) {
        return userProvider.getUser(age);
    }
}

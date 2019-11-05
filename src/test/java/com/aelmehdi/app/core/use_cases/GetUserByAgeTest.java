package com.aelmehdi.app.core.use_cases;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class GetUserByAgeTest {

    private UserProvider userProvider;

    @Test
    void should_return_user_by_name() {
        GetUserByAge getUserByAge = new GetUserByAge(userProvider);
        Assertions.assertEquals("Mehdi", getUserByAge.getUser(25));
    }

}

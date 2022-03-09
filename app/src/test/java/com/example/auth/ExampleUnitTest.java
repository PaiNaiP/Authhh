package com.example.auth;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ExampleUnitTest {



    @Test
    public void validateEmail_False() {
        Checkers t = new Checkers();
        Assert.assertEquals(true,t.checkEmail("notTrueEmail@lol"));
    }

    @Test
    public void validateEmail_True() {
        Checkers t = new Checkers();
        Assert.assertEquals(true,t.checkEmail("email@mail.ru"));
    }

    @Test
    public void validatePassword_False() {
        Checkers t = new Checkers();
        Assert.assertEquals(true,t.checkPassword("password"));
    }

    @Test
    public void validatePassword_True() {
        Checkers t = new Checkers();
        Assert.assertEquals(true,t.checkPassword("P@$$W0rd"));
    }

    @Test
    public void chekAPI_true() {
        ApiClass t = new ApiClass();
        Assert.assertEquals(true,t.postData("https://cakeapi.trinitytuts.com/api/add", "login","email@mail.ru","P@$$W0rd"));
    }

    @Test
    public void chekAPI_false() {
        ApiClass t = new ApiClass();
        Assert.assertEquals(true,t.postData("https://check.ru", "login","email@mail.ru","P@$$W0rd"));
    }
}
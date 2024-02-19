package com.example.northwind.business.concretes;

import com.example.northwind.entities.User;

public class TestUserManager {
    public static void main(String[] args) {
        UserManager userManager = new UserManager();

        userManager.addUser(new User("name", "psw"));
        userManager.addUser(new User("name1", "psw1"));

        System.out.println(userManager.getUsers());

        try {
            userManager.addUser(new User("name1", "psw1"));
            userManager.addUser(new User("name1", "psw2"));
                userManager.addUser(new User("name2", "psw1"));


        }
        catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
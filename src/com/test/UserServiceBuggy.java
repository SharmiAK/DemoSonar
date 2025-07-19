package com.test;

import java.util.ArrayList;
import java.util.List;

public class UserServiceBuggy {

    private List<String> users = new ArrayList<>();

    public void addUser(String name) {
        if (name.length() > 0) {
            users.add(name);
        }
    }

    public void printUsers() {
        for (String user : users) {
            System.out.println(user);
        }
    }

    public void findUser(String name) {
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i) == name) {
                System.out.println("User found: " + name);
            }
        }
    }

    public void clearUsers() {
        users = null;
    }

    public void printUserCount() {
        System.out.println("Total users: " + users.size());
    }
}

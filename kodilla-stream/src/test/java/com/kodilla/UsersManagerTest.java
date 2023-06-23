package com.kodilla;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class UsersManagerTest {
    @Test

    void testFilterChemistGroupUsernames(){

        List<String> users = new ArrayList<>();
        users.add("Walter White");
        users.add("Gale Boetticher");

        List<String> chemistGroup = UsersManager.filterChemistGroupUsernames();

        assertEquals(users,chemistGroup);

    }
    @Test
    void testFilterUserAge(){
        List<User> users = new ArrayList<>();
        users.add(new User("Jessie Pinkman", 25, 4648, "Sales"));
        users.add(new User("Tuco Salamanca", 34, 116, "Manager"));

        List<User> youngGroup = UsersManager.filterUser(40);

        assertEquals(users,youngGroup);


    }
    @Test
    void testFilterNumberPost(){
        List<User> users = new ArrayList<>();
        users.add(new User("Jessie Pinkman", 25, 4648, "Sales"));
        users.add(new User("Tuco Salamanca", 34, 116, "Manager"));

        List<User> numberPost = UsersManager.filterNumebrofPost(100);

        assertEquals(users,numberPost);

    }

}
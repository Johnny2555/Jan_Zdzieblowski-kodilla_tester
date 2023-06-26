package com.kodilla.optional.homework;

import com.kodilla.User;
import org.junit.jupiter.api.Test;


import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ForumStatsTest {
    @Test
    void testCalculateAverageAboveAge(){
        List<User> users = new ArrayList<>();
        users.add(new User("John",36,3,"Chemist"));
        users.add(new User("Bob",45,6,"Menager"));
        users.add(new User("Alice",50,7,"Sales"));

        double averagePostsAbove40 = ForumStats.calculateAveragePosts(40);

        assertEquals(2.25,averagePostsAbove40);
    }
    @Test
    void testCalculateAverageBelowAge(){
        List<User> users = new ArrayList<>();
        users.add(new User("John",36,3,"Chemist"));
        users.add(new User("Bob",45,6,"Menager"));
        users.add(new User("Alice",50,7,"Sales"));

        double averagePostBelow40 = ForumStats.calculateAveragePostsAge(40);

        assertEquals(2382.0,averagePostBelow40);

    }


}
package com.kodilla.optional.homework;

import com.kodilla.User;
import com.kodilla.UsersRepository;

import java.util.List;

public class ForumStats {
    public static double calculateAveragePosts(int age){
        List<User> users = UsersRepository.getUserList();
        return users.stream()
                .filter(user-> user.getAge()>=age)
                .mapToInt(User::getNumberOfPost)
                .average()
                .orElse(0.0);
    }
    public static double calculateAveragePostsAge(int age){
        List<User> users = UsersRepository.getUserList();
        return users.stream()
                .filter(user-> user.getAge()<age)
                .mapToInt(User::getNumberOfPost)
                .average()
                .orElse(0.0);
    }

    public static void main(String[] args) {
        double averagePostsAbove40 = calculateAveragePosts(40);
        double averagePostsBelow40 = calculateAveragePostsAge(40);
        System.out.println("Average posts for users above age 40: " + averagePostsAbove40);
        System.out.println("Average posts for users below age 40: " + averagePostsBelow40);
    }

}

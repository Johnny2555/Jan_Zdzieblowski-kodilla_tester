package com.kodilla;

import java.util.List;
import java.util.stream.Collectors;


    public class UsersManager {
        public static void main(String[] args) {
            List<String> chemistGroupUsernames = filterChemistGroupUsernames();
            System.out.println(chemistGroupUsernames);
        }

        public static List<String> filterChemistGroupUsernames() {
            List<String> usernames = UsersRepository.getUserList()   // [1]
                    .stream()
                    .filter(user -> user.getGroup().equals("Chemists"))
                    .map(UsersManager::getUserName)
                    .collect(Collectors.toList());                      // [2]

            return usernames;
        }

        public static List<User> filterUser(int age){
            List<User> userage = UsersRepository.getUserList()
                    .stream()
                    .filter(user ->user.getAge()<age)
                    .collect(Collectors.toList());

            return userage;
        }
        public static List<User> filterNumebrofPost(int numberofpost){
            List<User> userpost = UsersRepository.getUserList()
                    .stream()
                    .filter(user -> user.getNumberOfPost()>numberofpost)
                    .collect(Collectors.toList());

            return userpost;
        }

        public static String getUserName(User user) {
            return user.getUsername();
        }

    }


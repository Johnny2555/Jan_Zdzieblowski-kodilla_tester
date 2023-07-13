package com.kodilla.mockito.homework;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class NotificationService {
    private final NotificationSender notificationSender;
    private final Map<String, Set<Person>> subscriptions;

    public NotificationService(NotificationSender notificationSender) {
        this.notificationSender = notificationSender;
        this.subscriptions = new HashMap<>();
    }

    public void subscribe(Person person, String location) {
        Set<Person> subscribers = subscriptions.getOrDefault(location, new HashSet<>());
        subscribers.add(person);
        subscriptions.put(location, subscribers);
    }

    public void unsubscribe(Person person, String location) {
        Set<Person> subscribers = subscriptions.getOrDefault(location, new HashSet<>());
        subscribers.remove(person);
        subscriptions.put(location, subscribers);
    }

    public void unsubscribeFromAllLocations(Person person) {
        for (Set<Person> subscribers : subscriptions.values()) {
            subscribers.remove(person);
        }
    }

    public void sendNotificationToLocation(String location, String message) {
        Set<Person> subscribers = subscriptions.getOrDefault(location, new HashSet<>());
        for (Person person : subscribers) {
            notificationSender.sendNotification(person, message);
        }
    }

    public void sendNotificationToAll(Iterable<Person> persons, String message) {
        for (Person person : persons) {
            notificationSender.sendNotification(person, message);
        }
    }

    public void deleteLocation(String location) {
        subscriptions.remove(location);
    }

}

package datingapp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.IntStream;

public class DatingApp {
    public static void main(String[] args) {
        String[] names = {"민준", "서연", "지호", "하은", "준서", "지민", "우진", "예린", "도현", "수빈"};
        ArrayList<User> users = new java.util.ArrayList<>(IntStream.range(0, 10)
                                        .mapToObj(i -> new User(names[i], i % 2 == 0)).toList());
        Collections.shuffle(users);
        System.out.println("=== Users ===");
        users.forEach(System.out::println);

        System.out.println("=== Dating Recommendations ===");
        for (int i = 0; i < users.size(); i++) {
            User first = users.get(i);
            for (int j = i + 1; j < users.size(); j++) {
                User second = users.get(j);
                if (first.isMale ^ second.isMale && Math.abs(first.point - second.point) < 0.8)
                    System.out.printf("%s ♥ %s\n", first, second);
            }
        }
    }
}

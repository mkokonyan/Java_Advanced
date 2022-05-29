package L03_SetsAndMapsAdvanced.b_exercise;

import java.util.*;

public class P10_LogsAggregator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lines = Integer.parseInt(scanner.nextLine());

        Map<String, Integer> userDurationMap = new TreeMap<>();
        Map<String, Set<String>> userIPMap = new TreeMap<>();
        for (int i = 0; i < lines; i++) {
            String[] inputData = scanner.nextLine().split("\\s+");
            String ip = inputData[0];
            String user = inputData[1];
            int duration = Integer.parseInt(inputData[2]);

            userDurationMap.putIfAbsent(user, 0);
            userDurationMap.put(user, userDurationMap.get(user) + duration);

            userIPMap.putIfAbsent(user, new TreeSet<>());
            Set<String> userIPs = userIPMap.get(user);
            userIPs.add(ip);
        }
        for (String user : userIPMap.keySet()) {
            System.out.printf("%s: %d [%s]%n", user, userDurationMap.get(user), String.join(", ", userIPMap.get(user)));
        }
    }
}


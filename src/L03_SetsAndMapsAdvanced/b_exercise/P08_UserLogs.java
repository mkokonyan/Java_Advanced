package L03_SetsAndMapsAdvanced.b_exercise;

import java.util.*;

public class P08_UserLogs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();

        Map<String, Map<String, Integer>> userLogsMap = new TreeMap<>();
        while (!command.equals("end")) {
            String[] currentData = command.split("\\s+");
            String ipAddress = currentData[0].split("=")[1];
            String message = currentData[1].split("=")[1];
            String user = currentData[2].split("=")[1];

            userLogsMap.putIfAbsent(user, new LinkedHashMap<>());
            Map<String, Integer> userData = userLogsMap.get(user);
            userData.putIfAbsent(ipAddress, 0);
            userData.put(ipAddress, userData.get(ipAddress) + 1);


            command = scanner.nextLine();

        }
        userLogsMap.forEach((key, value) -> {
            String result = "";
            for (Map.Entry<String, Integer> entry : value.entrySet()) {
                result += String.format("%s => %s, ", entry.getKey(), entry.getValue());
            }
            result = result.substring(0, result.length()-2) + String.format(".%n");
            System.out.printf("%s: %n%s", key, result);

        });
    }
}



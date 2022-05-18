package L01_StacksAndQueues.b_excercise;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class P07_SimpleTextEditor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOfOperations = Integer.parseInt(scanner.nextLine());

        String text = "";
        ArrayDeque<String[]> commandStack = new ArrayDeque<>();

        for (int i = 0; i < numOfOperations; i++) {
            String command = scanner.nextLine();

            String commandNum = command.split(" ")[0];
            switch (commandNum) {
                case "1":
                    String textToAdd = command.split(" ")[1];
                    commandStack.push(new String[]{commandNum, textToAdd});
                    text += textToAdd;
                    break;
                case "2":
                    int eraseCount = Integer.parseInt(command.split(" ")[1]);
                    String erasedText = text.substring(text.length()-eraseCount, text.length());
                    commandStack.push(new String[]{commandNum, erasedText});
                    text = text.substring(0, text.length()-eraseCount);

                    break;
                case "3":
                    int index = Integer.parseInt(command.split(" ")[1])-1;
                    System.out.println(text.charAt(index));
                    break;
                case "4":
                    String[] undoCommand = commandStack.pop();
                    if (undoCommand[0].equals("1")) {
                        text = text.replace(undoCommand[1],"");
                    } else {
                        text += undoCommand[1];
                    }
                    break;
            }
        }

    }
}


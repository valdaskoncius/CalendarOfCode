package CalendarTasks;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import static SupportingFunctions.FileManipulations.readFile;

public class Task1 {
    public static String contents;

    public static int solveProblem() throws IOException {
        int counter = 0;
        String tempStr;
        String firstNum;
        String lastNum;

        System.out.println("Solving problem 1!");

        contents = readFile("resources/1.txt", StandardCharsets.UTF_8);

        String[] lines = contents.split(System.getProperty("line.separator"));
        for(String tmpLine : lines){
            tempStr = tmpLine.replaceAll("[^\\d.]", "");
            lastNum = tempStr.substring(tempStr.length() - 1);
            firstNum = String.valueOf(tempStr.charAt(0));

            counter = counter + Integer.valueOf(firstNum + lastNum);
        }

        return counter;
    }
}

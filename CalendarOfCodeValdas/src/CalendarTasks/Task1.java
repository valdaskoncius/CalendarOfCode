package CalendarTasks;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import static SupportingFunctions.FileManipulations.readFile;

public class Task1 {
    public static String contents;

    public static int solveProblem1() throws IOException {
        int counter = 0;
        String tempStr;
        String firstNum;
        String lastNum;

        System.out.println("Solving problem 1 part 1!");

        contents = readFile("CalendarOfCodeValdas/resources/1.txt", StandardCharsets.UTF_8);

        String[] lines = contents.split(System.getProperty("line.separator"));
        for(String tmpLine : lines){
            tempStr = tmpLine.replaceAll("[^\\d.]", "");
            lastNum = tempStr.substring(tempStr.length() - 1);
            firstNum = String.valueOf(tempStr.charAt(0));

            counter = counter + Integer.valueOf(firstNum + lastNum);
        }

        return counter;
    }

    public static int solveProblem2() throws IOException{
        int counter = 0;
        String tempStr;
        String firstNum;
        String lastNum;
        String numbersInText = "one,two,three,four,five,six,seven,eight,nine";

        System.out.println("Solving problem 1 part 2!");

        String[] numbersInTextArray = numbersInText.split(",");
        System.out.println(numbersInTextArray[0]);

        contents = readFile("CalendarOfCodeValdas/resources/1.txt", StandardCharsets.UTF_8);

        for(int i = 1; i < numbersInTextArray.length + 1; i++)
        {
            contents = contents.replace(numbersInTextArray[i-1], String.valueOf(i));
        }
        System.out.println(contents);

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

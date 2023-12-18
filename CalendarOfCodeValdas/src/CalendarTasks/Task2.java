package CalendarTasks;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

import static SupportingFunctions.FileManipulations.readFile;

public class Task2 {
    public static String contents;

    public static int solveProblem() throws IOException {
        int counter = 0;
        int redCubesTotal = 12;
        int greenCubesTotal = 13;
        int blueCubesTotal = 14;

        int gameId = 0;
        int countedRedCubes = 0;
        int countedGreenCubes = 0;
        int countedBlueCubes = 0;

        System.out.println("Solving problem 2!");

        contents = readFile("resources/2.txt", StandardCharsets.UTF_8);

        String[] lines = contents.split(System.getProperty("line.separator"));
        for(String tmpLine : lines){
            tmpLine = Arrays.toString(tmpLine.split("\\:"));
            System.out.println(tmpLine);
        }

        return counter;
    }
}

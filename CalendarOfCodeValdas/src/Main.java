import CalendarTasks.Task1;
import CalendarTasks.Task2;

import java.io.IOException;

public class Main {
    public static <e> void main(String[] args) throws IOException {

        System.out.printf("Hello and welcome to Valdas advent calendar task solver! ");
        System.out.println("The answer to task 1 is: " + Task1.solveProblem());
        System.out.println("The answer to task 2 is: " + Task2.solveProblem());
    }
}
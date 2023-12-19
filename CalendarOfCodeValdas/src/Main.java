import CalendarTasks.Task1;
import CalendarTasks.Task2;

import java.io.IOException;

public class Main {
    public static <e> void main(String[] args) throws IOException {

        System.out.printf("Hello and welcome to Valdas advent calendar task solver! ");

        System.out.println("The answer to task 1 part 1 is: " + Task1.solveProblem1());
        System.out.println("The answer to task 1 part 2 is: " + Task1.solveProblem2());

        //System.out.println("The answer to task 2 is: " + Task2.solveProblem());
    }
}
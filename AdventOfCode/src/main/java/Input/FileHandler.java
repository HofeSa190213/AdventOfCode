package Input;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileHandler {

    int counter = 0;
    int rows = 0;
    public String[] readFile() {
        String[] input = new String[0];
        try {
            File myObj = new File("C:/Users/samue/eclipse-workspace/AdventOfCode/src/main/java/Input/input.txt");
            Scanner myReader = new Scanner(myObj);

            rows = getRows();

            input = new String[rows];

            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                input[counter] = data;
                counter++;
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        return input;
    }

    public int getRows() throws FileNotFoundException {

        int counter = 0;

        File myObj = new File("C:/Users/samue/eclipse-workspace/AdventOfCode/src/main/java/Input/input.txt");
        Scanner myReader = new Scanner(myObj);

        while (myReader.hasNextLine()) {
            String data = myReader.nextLine();
            counter++;
        }
        myReader.close();

        return counter;
    }
}

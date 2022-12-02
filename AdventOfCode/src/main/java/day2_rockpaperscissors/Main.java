package day2_rockpaperscissors;

import Input.FileHandler;
import day2_rockpaperscissors.rps.RockPaperScissorsPlayer;

import java.io.IOException;

import static java.sql.Types.NULL;

public class Main {
    public static void main(String[] args) throws IOException {
        int rowcounter = 0;
        int i = 0;

        FileHandler fh = new FileHandler();
        String[] input = new String[fh.getRows()];

        String[] elvesInp = new String[fh.getRows()];
        String[] myInp = new String[fh.getRows()];

        String row;

        input = fh.readFile();

        while(i != fh.getRows() ){
        row = input[i].trim();
            //System.out.println(row);
            for(char c : row.toCharArray() ){

                if(c != ' ' && rowcounter != 1){
                    //System.out.println(rowcounter);
                    elvesInp[i] = String.valueOf(c);
                    rowcounter++;
                    //System.out.println(c);
                }
                else if(c != ' '){
                    myInp[i] = String.valueOf(c);
                    rowcounter++;
                }
            }

            rowcounter = 0;
            //System.out.println(myInp[i]);
            i++;
        }

        RockPaperScissorsPlayer rps = new RockPaperScissorsPlayer();
        rps.fight(elvesInp, myInp);
    }
}

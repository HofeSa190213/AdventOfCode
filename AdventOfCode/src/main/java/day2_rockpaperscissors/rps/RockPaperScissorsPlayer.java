package day2_rockpaperscissors.rps;

import Input.FileHandler;

import java.io.FileNotFoundException;

public class RockPaperScissorsPlayer {

    FileHandler fh = new FileHandler();
    int i = 0;
    int win = 6;
    int draw = 3;
    int loss = 0;

    int losscounter = 0;
    int wincounter = 0;
    int drawcounter = 0;
    int pointCounter = 0;

    int goforlosecounter = 0;

    public void fight(String[] elvesInp, String[] myInp) throws FileNotFoundException {

        for(;i < fh.getRows(); i++){

            //System.out.println(elvesInp[i]);
            //System.out.println(myInp[i]);
            //System.out.println(elvesInp[i]);

            if(elvesInp[i].equals("A") && myInp[i].equals("X")){
                System.out.println("Draw");
                pointCounter+= (1 + draw);
                drawcounter++;
            }
            else if(elvesInp[i].equals("B") && myInp[i].equals("Y")){
                System.out.println("Draw");
                pointCounter+= (2 + draw);
                drawcounter++;
            }
            else if(elvesInp[i].equals("C") && myInp[i].equals("Z")){
                System.out.println("Draw");
                pointCounter+= (3 + draw);
                drawcounter++;
            }
            else if(elvesInp[i].equals("C") && myInp[i].equals("X")){
                System.out.println("win");
                pointCounter += (1 + win);
                wincounter++;
            }
            else if(elvesInp[i].equals("A") && myInp[i].equals("Y")){
                System.out.println("win");
                pointCounter += (2 + win);
                wincounter++;
            }
            else if(elvesInp[i].equals("B") && myInp[i].equals("Z")){
                System.out.println("win");
                pointCounter += (3 + win);
                wincounter++;
            }
            else if(elvesInp[i].equals("A") && myInp[i].equals("Z")){
                pointCounter += 3;
                losscounter++;
                System.out.println("loss");
            }
            else if(elvesInp[i].equals("B") && myInp[i].equals("X")){
                pointCounter += 1;
                losscounter++;
                System.out.println("loss");
            }
            else if(elvesInp[i].equals("C") && myInp[i].equals("Y")){
                pointCounter += 2;
                losscounter++;
                System.out.println("loss");
            }
        }

        System.out.println("Total: " + pointCounter);
        System.out.println("wins: " + wincounter);
        System.out.println("loses: " + losscounter);
        System.out.println("draw: " + drawcounter);

        i = 0;

        for(;i < fh.getRows(); i++){
            if(myInp[i].equals("X")){
                switch (elvesInp[i]){
                    case "A": goforlosecounter+=3; break;
                    case "B": goforlosecounter+=1; break;
                    case "C": goforlosecounter+=2; break;
                }

            }
            else if(myInp[i].equals("Y")){
                switch (elvesInp[i]){
                    case "A": goforlosecounter+=(1 + draw); break;
                    case "B": goforlosecounter+=(2 + draw); break;
                    case "C": goforlosecounter+=(3 + draw); break;
                }
            }
            else if(myInp[i].equals("Z")){
                switch (elvesInp[i]){
                    case "A": goforlosecounter+=(2 + win); break;
                    case "B": goforlosecounter+=(3 + win); break;
                    case "C": goforlosecounter+=(1 + win); break;
                }
            }
        }

        System.out.println("Total: " + goforlosecounter);
    }
}

import java.io.*;

public class RPS {
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static int x;

    public static void main(String[] args) throws IOException {

        int ch;
        do {
            System.out.println("\n Menu\t");
            System.out.println("1. Start Game\t");
            System.out.println("2. Quit Program\n");

            ch = Integer.valueOf(in.readLine()).intValue();

            if(ch == 1) {
                System.out.println("Welcome to Rock, Paper, Scissors Game......");
                System.out.println("---------------------------------------------");
                System.out.println("Please enter Rock, Paper or Scissors to play\t");

            int wins = 0, loss = 0, ties = 0;
            String u = in.readLine();
            String pl="";
            int pl2=(int)(3*Math.random())+1;

            if (pl2==1) {
                pl="Rock";
            }
            else if (pl2==2) {
                pl="Paper";
            }
            else if (pl2==3) {
                pl="Scissors";
            }

            if (u.equals("Rock") || u.equals("rock")) {
                System.out.println("You chose : Rock\n");
                user = "Rock";
            }
            else if (u.equals("Paper") || u.equals("paper")) {
                System.out.println("You chose : Paper\n");
                user = "Paper";
            }
            else if (u.equals("Scissors")|| u.equals("scissors")) {
                System.out.println("You chose : Scissors...\n");
                u = "Scissors";
            }
            else {
                System.out.println("Error: Please type Rock, Paper or Scissors\n");
            }
            System.out.println("Player2: I chose " + pl);
            if(u.equals(pl)) {
                System.out.println("\tIt's a tie!!!!!!!!\n");
                ties++;
            }
            else if (u.equals("Rock")) {

                if (pl.equals("Scissors")){
                    System.out.println("Rock beats scissors, congrats you win!\n");
                wins++;
                }
                 if (pl.equals("Paper")){
                     System.out.println("Paper beats rock, sorry you lost!\n");
                loss++;
                 }


            }
            else if (u.equals("Paper")) {

                if (pl.equals("Rock")){
                    System.out.println("Paper beats rock, congrats you win!\n");
                    wins++;
                }
                 if (pl.equals("Scissors")){
                    System.out.println("Scissors beats paper, sorry you lost!\n");
                    loss++;   
                 }
            }
            else if (u.equals("Scissors")) {

                if (pl.equals("Paper")){
                    System.out.println("Scissors beats paper, congrats you win!\n");
                    wins++;
                }
                 if (pl.equals("Rock")){
                    System.out.println("Rock beats scissors, sorry you lost!\n");
                    loss++;     
                 }
            }
            System.out.println("Total wins :\n " +wins);
            }
            if (ch == 2) {
                System.out.println("See yaa!.....Have a good day");
                in.close();
            }
        } while (ch !=2); 
    }
}

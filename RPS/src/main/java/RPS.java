import java.util.Random;
import java.util.Scanner;

public class RPS {
    static String plyrMove;
    static String compMove;
    static int plyrWon = 0;
    static int compWon = 0;
    static int draws = 0;

    static Random rn = new Random();
    static int totalGames = 0;
    static int rock=0;
    static int paper=0;
    static int scissors=0;
    static int compRock=0;
    static int compPaper=0;
    static int compScissors=0;

    //



    public static void main(String[] args) {

        gameStart(0, 0);
    }

    public static void gameStart(int player, int computer){
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        player = sc.nextInt();
        totalGames++;

        if (player == 1 ){
            System.out.println("Player picks: Rocks");
            plyrMove = "Rock";
            rock++;
        }
        else  if (player == 2 ){
            System.out.println("Player picks: Paper");
            plyrMove = "Paper";
            paper++;
        }
        else  if (player == 3 ){
            System.out.println("Player picks: Scissors");
            plyrMove = "Scissors";
            scissors++;
        }
        if(computer ==0 ){
            System.out.println("Computer picks: Rocks");
            compMove = "Rock";
            compRock++;
        }
        else  if (computer == 1 ){
            System.out.println("Computer picks: Paper");
            compMove = "Paper";
            compPaper++;
        }
        else  if (computer == 2 ){
            System.out.println("Computer picks: Scissors");
            compMove = "Scissors";
            compScissors++;
        }

 //************

        if(player == 1 & computer == 0 | player == 2 & computer == 1 | player == 3 & computer == 2 ){
            System.out.println("Draw!");
            draws++;
        }
        else if(player == 1 & computer ==1  ){
            System.out.println("Computer Wins!");
            compWon++;
        }
        else if(player == 1 & computer == 2){
            System.out.println("Player Wins!");
            plyrWon ++;
        }
        else if(player == 2 & computer == 0){
            System.out.println("Player Wins!");
            plyrWon ++;
        }
        else if(player == 2 & computer == 2){
            System.out.println("Computer Wins! ");
            compWon++;
        }
        else if(player == 3 & computer == 0){
            System.out.println("Computer Wins!");
            compWon++;
        }
        else if(player == 3 & computer == 1){
            System.out.println("Player Wins!");
            plyrWon ++;
        }
        if (plyrWon == 5 | compWon == 5){
            if(plyrWon > compWon) {
                System.out.println("******Game Over Player won********");
            }
            else{
                System.out.println("*******Game Over Computer won*****");
            }
            System.out.println("Total Games Played: " + totalGames);
            System.out.println("Player score: " + plyrWon);
            System.out.println("Computer score: " + compWon);
            System.out.println("Draws: " + draws);
            System.out.println("Total number of rock played: " + (rock + compRock )+ "\n" + "Total number of paper played: " + (paper + compPaper) + "\n" + "Total number of scissors played: " + (scissors + compScissors));

        }else{
            gameStart(player, computer);
        }




    }















}


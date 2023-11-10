package ex04_glu_lauronajr;
import java.util.Scanner;

public class RockPaperScissors{
	public static void main(String[] args){
		Move rock = new Move("Rock");
		Move paper = new Move("Paper");
		Move scissors = new Move("Scissors");
		
		rock.setStrongAgainst(scissors);
		paper.setStrongAgainst(rock);
		scissors.setStrongAgainst(paper);
		
                int pWins = 0;
                int cWins = 0;
		int roundsToWin = 2;
		Scanner mChoice = new Scanner(System.in);
                int mainMenuChoice;
                int random = 0;
                
                System.out.println("Welcome to Rock, Paper, Scissors. Please choose an option:");
                System.out.println("1. Start game");
                System.out.println("2. Change number of rounds");
                System.out.println("3. Exit Application");
                mainMenuChoice = mChoice.nextInt();     
                int gameOngoing = 0;
                int playerMove;
                int compMove;
                Move pMove = null;
                Move cMove = null;
                while(gameOngoing == 0){
                switch(mainMenuChoice){
                    case 1:
                        
                        if((pWins != roundsToWin)&&(cWins != roundsToWin)){
                        System.out.println("Rounds to win "+ roundsToWin + " Rounds");
                        System.out.println("Pick your move:");
                        System.out.println("1.Rock");
                        System.out.println("2.Paper");
                        System.out.println("3.Scissor");
                        System.out.println("Player Wins = " + pWins + " ,Computer Wins = " + cWins);
                        Scanner pm = new Scanner(System.in);
                        playerMove = pm.nextInt();
                        switch(playerMove){
                            case 1:
                                pMove = rock;
                                break;
                            case 2:
                                pMove = paper;
                                break;
                            case 3:
                                pMove = scissors;
                        }
                        random = (int) Math.floor(Math.random()*3) + 1;
                        compMove = random;
                        switch(compMove){
                            case 1:
                                cMove = rock;
                                break;
                            case 2:
                                cMove = paper;
                                break;
                            case 3:
                                cMove = scissors;
                        }
                    switch (Move.compareMoves(pMove,cMove)) {
                        case 0:
                            pWins++;
                            break;
                        case 1:
                            cWins++;
                            break;
                        default:
                            System.out.println("Tie");
                            break;
                    }
                        System.out.println("Player chose:" + pMove.getName() + " ,Computer chose:" + cMove.getName());
                        } else if(pWins == roundsToWin){
                            System.out.println("Player Wins = " + pWins + " ,Computer Wins = " + cWins);
                            System.out.println("You Won");
                            gameOngoing = 1;
                        } else if(cWins == roundsToWin){
                            System.out.println("Player Wins = " + pWins + " ,Computer Wins = " + cWins);
                            System.out.println("You Lost");
                            gameOngoing = 1;
                        }
                            
                        break;

                    case 2:
                        System.out.println("Type number of rounds to win: ");
                        Scanner rtw = new Scanner(System.in);
                        roundsToWin = rtw.nextInt();
                        System.out.println("Setting has been saved");
                        mainMenuChoice = 1;
                        break;
                    case 3:
                        gameOngoing = 1;
                        System.out.println("Thanks for playing!");
                        break;
                }
                
                }
}
       
}

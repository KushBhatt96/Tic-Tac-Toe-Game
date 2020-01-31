package Main;


import java.io.*;

import Model.BlockingPlayer;
import Model.Board;
import Model.Constants;
import Model.HumanPlayer;
import Model.Player;
import Model.RandomPlayer;
import Model.Referee;
import Model.SmartPlayer;
import View.boardView;

/**
 * This class contains the main method, creates all necessary objects and initiates the game.
 * @author Kush Bhatt
 * @version 1.0
 * @Since 11/5/2019
 */
public class Game implements Constants {

	private Board theBoard;
	private static boardView theBoardView;
	private Referee theRef;
	
	/**
	 * creates a board for the game
	 */
    public Game( ) {
        theBoard  = new Board();
        theBoardView = new boardView();
	}
    
    /**
     * calls the referee method runTheGame
     * @param r refers to the appointed referee for the game 
     * @throws IOException
     */
    public void appointReferee(Referee r) throws IOException {
        theRef = r;
        theBoardView.setInfoAreaText("Referee started the game...");
    	theRef.runTheGame(theBoardView);
    }
    
	
	public static void main(String[] args) throws IOException {
		
		Referee theRef;
		Player xPlayer, oPlayer;
		BufferedReader stdin;
		Game theGame = new Game();
		stdin = new BufferedReader(new InputStreamReader(System.in));
		String name= theBoardView.playerName(LETTER_X);
		while (name == null) {
			theBoardView.setInfoAreaText("Please try again");
			name= theBoardView.playerName(LETTER_X);
		}

		xPlayer = create_player (name, LETTER_X, theGame.theBoard, stdin);
		
		name= theBoardView.playerName(LETTER_O);
		
		while (name == null) {
			theBoardView.setInfoAreaText("Please try again");
			name= theBoardView.playerName(LETTER_O);
		}
		
		oPlayer = create_player (name, LETTER_O, theGame.theBoard, stdin);
		
		theRef = new Referee(theBoardView);
		theRef.setBoard(theGame.theBoard);
		theRef.setToPlayer(oPlayer);
		theRef.setxPlayer(xPlayer);
        
        theGame.appointReferee(theRef);
	}
	
	/**
	 * Creates the specified type of player indicated by the user. 
	 * 
	 * @param name player's name
	 * @param mark player's mark (X or O)
	 * @param board refers to the game board
	 * @param stdin refers to an input stream
	 * @return a newly created player
	 * @throws IOException
	 */
	static public Player  create_player(String name, char mark, Board board,
			BufferedReader stdin)throws IOException {
		final int NUMBER_OF_TYPES = 4;
		int player_type = theBoardView.CreatePlayer(name, NUMBER_OF_TYPES);
		while (player_type < 1 || player_type > NUMBER_OF_TYPES) {
			theBoardView.setInfoAreaText("Please try again");
			player_type = theBoardView.CreatePlayer(name, NUMBER_OF_TYPES);
		}
		
		// Create a specific type of Player 
		Player result = null;
		switch(player_type) {
			case 1:
				result = new HumanPlayer(name, mark, theBoardView);
				break;
			case 2:
				result = new RandomPlayer(name, mark);
				break;
			case 3:
				result = new BlockingPlayer(name, mark);
				break;
			case 4:
				result = new SmartPlayer(name, mark);
				break;
			default:
				System.out.print ( "\nDefault case in switch should not be reached.\n"
				+ "  Program terminated.\n");
				System.exit(0);
		}
		result.setBoard(board);
		return result;
	}
}

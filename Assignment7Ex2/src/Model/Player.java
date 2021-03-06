package Model;

import View.boardView;

/**
 * This class represents one of the players participating in the game.
 * Each player has a name, game board, opponent, and mark (either X or O).
 * @author Kush Bhatt
 * @version 1.0
 * @Since 11/5/2019
 */
public abstract class Player {

	/**
	 * Name of the player
	 */
	protected String name;
	/**
	 * Game board the player will play on
	 */
	protected Board board;
	/**
	 * The opponent Player object
	 */
	protected Player opponent;
	/**
	 * The mark this player will be using
	 */
	protected char mark;
	
	/**
	 * Constructs the player and gives him/her a name and a mark.
	 * @param name Name of the player
	 * @param mark Mark, either X or O
	 */
	protected Player(String name, char mark) {
		this.name = name;
		this.mark = mark;
	}
	
	/**
	 * The Play method checks the board first to see if anyone has won, or if the 
	 * game has ended in a tie. If not, it will proceed to allow a player to make a move
	 * by called makeMove method.
	 */
	abstract protected void play(boardView theBoardView); 
		
	/**
	 * The makeMove method will prompt a player to choose a row and a column in 
	 * order to make a move. After each move, the board will be displayed.
	 */
	abstract protected void makeMove();
	
	protected void setOpponent(Player opponent) {
		this.opponent = opponent;
	}
	
	public void setBoard(Board theBoard) {
		board = theBoard;
	}

	public void checkGame() {
		// TODO Auto-generated method stub
	}
	
	
}

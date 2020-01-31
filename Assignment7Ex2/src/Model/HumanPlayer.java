package Model;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import View.boardView;

/**
 * HumanPlayer sets the PlayerLabel textfield with a mark and also sets the user name in 
 * the correct textfield. Additionally, it prompts the user to make a move.
 * @author Kush
 * @version 1.0
 * @Since 11/5/2019
 */
public class HumanPlayer extends Player{
	
	boardView theBoardView;

	
	public HumanPlayer(String name, char mark, boardView passedBoardView) {
		super(name, mark);
		theBoardView = passedBoardView;
	}
	
	/**
	 * Checks to see if a player has won, and if not continues to set the player mark and name.
	 */
	@Override
	protected void play(boardView theBoardView) {
		if(board.xWins() == false && board.oWins() == false && board.isFull() == false) {
		this.theBoardView = theBoardView;
		theBoardView.setLabelPlayer(mark);
		theBoardView.setUserName(name);
		makeMove();
		}
	}
	
	/**
	 * Check if a player has won the game after a move has been made.
	 */
	public void checkGame() {
		if (board.checkWinner(mark)!= 1 && board.isFull() == false) {
			opponent.play(theBoardView);
		}
		else if(board.checkWinner(mark)== 1) {
			theBoardView.setInfoAreaText("THE GAME IS OVER: " + name+ " is the winner!\n\"Game Ended ...\"");
		}
		else if(board.isFull() == true) {
			theBoardView.setInfoAreaText("Its a tie!");
		}
	}
	
	/**
	 * Prompt the user to make a move.
	 */
	@Override
	protected void makeMove() {
		theBoardView.setInfoAreaText(name + " Please place your mark on the board.");
		}
	
	}
		


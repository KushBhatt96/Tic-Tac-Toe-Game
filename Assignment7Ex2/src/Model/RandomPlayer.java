package Model;

import View.boardView;

/**
 * RandomPlayer is a type of computer player that makes moves at random.
 * @author Kush
 * @version 1.0
 * @Since 11/5/2019
 */
public class RandomPlayer extends Player{
	
	boardView theBoardView;

	public RandomPlayer(String name, char mark) {
		super(name, mark);
	}
	
	/**
	 * Checks if a player has won, and if not, continues to set the player mark and user name.
	 * Additionally calls the makeMove function to make a move for the computer player. Lastly
	 * it checks again if a player has won after the move is made. 
	 */
	@Override
	protected void play(boardView theBoardView) {
		if(board.xWins() == false && board.oWins() == false && board.isFull() == false) {
		this.theBoardView = theBoardView;
		theBoardView.setLabelPlayer(mark);
		theBoardView.setUserName(name);
		makeMove();
		}
		
		board.display();
		
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
	 * Generates random numbers for the row and column for the placement of the mark. Then adds
	 * the mark to the board.
	 */
	@Override
	protected void makeMove() {
		RandomGenerator rand = new RandomGenerator();
		while(true) {
		int randrow = rand.discrete(0, 2);
		int randcol = rand.discrete(0, 2);
		if(board.getMark(randrow, randcol)!= 'X' && board.getMark(randrow, randcol)!= 'O') {
			board.addMark(randrow, randcol, mark);
			theBoardView.setButtonMark(mark, randrow, randcol);
			break;
		}
		}
	}
	
	
}

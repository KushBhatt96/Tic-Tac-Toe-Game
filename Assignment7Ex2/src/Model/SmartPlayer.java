package Model;


/**
 * SmartPlayer inherits from the BlockingPlayer class. It is able to detect if the opponent has a chance
 * to win and stops them from winning. It also tries to win if it has an opportunity. 
 * @author Kush
 * @version 1.0
 * @Since 11/5/2019
 */
public class SmartPlayer extends BlockingPlayer{

	public SmartPlayer(String name, char mark) {
		super(name, mark);
	}
	
	/**
	 * makeMove in SmartPlayer checks if a stop OR win is possible, if not it makes a random move.
	 */
	@Override
	protected void makeMove() {
		boolean canWin = testForWinning();
		
		if (canWin == false) {
		boolean blockPossible = testForBlocking();

		if (blockPossible == false && board.isFull() == false) {
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
	}
	
	/**
	 * Checks for a win OR a stop.
	 * @return
	 */
	private boolean testForWinning() {
		int canWin = 0;
		for (int i = 0; i < 3 && canWin != 1; i++) {
			for (int j = 0; j < 3; j++) {
				if (testForWinningHelper(i,j) == true) {
					board.addMark(i, j, mark);
					theBoardView.setButtonMark(mark, i, j);
					canWin = 1;
					return true;
				}
			}
		}
		return false;
	}
	
	
	
	private boolean testForWinningHelper(int row, int col) {
		if(board.getMark(row, col)!= 'X' && board.getMark(row, col)!= 'O') {
			board.addMark(row, col, mark);
			if(board.checkWinner(mark) == 1) {
				board.addMark(row, col, ' ');
				return true;
			}
			board.addMark(row, col, ' ');
		}
		return false;
	}
	
	
	
}

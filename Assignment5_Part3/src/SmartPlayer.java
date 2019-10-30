
public class SmartPlayer extends BlockingPlayer{

	protected SmartPlayer(String name, char mark) {
		super(name, mark);
	}
	
	
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
					break;
			}
		}
		}
		}
	}
	
	
	
	private boolean testForWinning() {
		int canWin = 0;
		for (int i = 0; i < 3 && canWin != 1; i++) {
			for (int j = 0; j < 3; j++) {
				if (testForWinningHelper(i,j) == true) {
					board.addMark(i, j, mark);
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

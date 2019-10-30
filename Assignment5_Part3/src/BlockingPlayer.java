
public class BlockingPlayer extends RandomPlayer{
	
	protected BlockingPlayer(String name, char mark) {
		super(name, mark);
	}
	
	
	
	@Override
	protected void makeMove() {		
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
	
	
	
	protected boolean testForBlocking() {
		int canBlock = 0;
		for(int i = 0; i < 3 && canBlock != 1; i++) {
			for (int j = 0; j < 3; j++) {
				if (testForBlockingHelper(i,j) == true) {
					board.addMark(i, j, mark);
					canBlock = 1;
					return true;
				}
			}
		}
		return false;
	}
	
	
	
	private boolean testForBlockingHelper(int row, int col) {
		if(board.getMark(row, col)!= 'X' && board.getMark(row, col)!= 'O') {
		if(mark == 'X') {
			board.addMark(row, col, 'O');
			if(board.oWins()) {
				board.addMark(row, col, ' ');
				return true;
			}
			board.addMark(row, col, ' ');
		}
		else  {
			board.addMark(row, col, 'X');
			if(board.xWins()) {
				board.addMark(row, col, ' ');
				return true;
			}
			board.addMark(row, col, ' ');
		}
	}
		return false;	
	}

}

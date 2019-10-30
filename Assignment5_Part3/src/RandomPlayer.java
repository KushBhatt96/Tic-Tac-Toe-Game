
public class RandomPlayer extends Player{
	
	

	protected RandomPlayer(String name, char mark) {
		super(name, mark);
	}
	
	
	
	@Override
	protected void play() {
		if(board.xWins() == false && board.oWins() == false && board.isFull() == false) {
		makeMove();
		}
		
		board.display();
		
		if (board.checkWinner(mark)!= 1 && board.isFull() == false) {
		opponent.play();
		}
		else if(board.checkWinner(mark)== 1) {
			System.out.println("THE GAME IS OVER: " + name+ " is the winner!");
			System.out.println("Game Ended ...");
		}
		else if(board.isFull() == true) {
			System.out.println("Its a tie!");
		}
	}
	
	@Override
	protected void makeMove() {
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

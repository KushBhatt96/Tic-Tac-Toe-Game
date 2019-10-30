import java.util.Scanner;

public class HumanPlayer extends Player{
	
	protected HumanPlayer(String name, char mark) {
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
		int column;
		int row;
		Scanner userMove = new Scanner(System.in);
		while(true) {
		System.out.println(name + ", What row would you like to choose?");
		row = userMove.nextInt();
		System.out.println(name + ", What column would you like to choose?");
		column = userMove.nextInt();
		if(board.getMark(row, column)!= 'X' && board.getMark(row, column)!= 'O') {
		board.addMark(row, column, mark);
		break;
		}
		else {
			System.out.println("That spot is already taken!");
		}
		}
	}
		
}

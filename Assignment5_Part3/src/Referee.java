
/**
 * The referee class is responsible for assigning opponents and to initiate the game.
 * @author Kush Bhatt
 * @version 1.0
 * @since October 5, 2019
 */
public class Referee {

	/**
	 * Player that will use mark X
	 */
	private Player xPlayer;
	/**
	 * Player that will use mark O
	 */
	private Player oPlayer;
	/**
	 * Board that the game will be played on
	 */
	private Board board;
	
	/**
	 * Set the board to game board
	 * @param board Board for the game
	 */
	public void setBoard(Board board) {
		
		this.board = board;
		
	}
	
	/**
	 * Assign oPlayer
	 * @param oPlayer
	 */
	public void setToPlayer(Player oPlayer) {
		
		this.oPlayer = oPlayer;
		
	}
	
	/**
	 * Assign xPlayer
	 * @param xPlayer
	 */
	public void setxPlayer(Player xPlayer) {
		
		this.xPlayer = xPlayer;
		
	}
	
	/**
	 * This method will first set opponents for each player and then begin the game.
	 * Empty board will be displayed.
	 * Player with mark X will always have the first move.
	 */
	public void runTheGame() {
		
		oPlayer.setOpponent(xPlayer);
		xPlayer.setOpponent(oPlayer);
		System.out.println("Referee started the game...");
		board.display();
		xPlayer.play();
	}
	
	
	
}

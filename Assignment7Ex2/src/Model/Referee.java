package Model;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import View.boardView;

/**
 * The referee class is responsible for assigning opponents and to initiate the game.
 * @author Kush Bhatt
 * @version 1.0
 * @Since 11/5/2019
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
	
	public boardView theBoardView;
	
	/**
	 *Referee constructor calls functions in theBoardView that register button components to ActionListener objects.
	 * @param passedBoardView
	 */
	public Referee(boardView passedBoardView) {
		theBoardView = passedBoardView;
		theBoardView.addButton1(new BtnListener1());
		theBoardView.addButton2(new BtnListener2());
		theBoardView.addButton3(new BtnListener3());
		theBoardView.addButton4(new BtnListener4());
		theBoardView.addButton5(new BtnListener5());
		theBoardView.addButton6(new BtnListener6());
		theBoardView.addButton7(new BtnListener7());
		theBoardView.addButton8(new BtnListener8());
		theBoardView.addButton9(new BtnListener9());
		
	}
	
	/**
	 * One of the nine ActionListeners for each of the buttons on the JFrame. Record the player move on 
	 * the board and displays on the screen.
	 * @author Kush
	 *
	 */
	class BtnListener1 implements ActionListener{
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (theBoardView.getButtonMark(0, 0).charAt(0) == 'X' || theBoardView.getButtonMark(0, 0).charAt(0) == 'O' ) {
			theBoardView.spotAlreadyTaken();
		}
		else {
		theBoardView.setButtonMark(theBoardView.getLabelPlayer().charAt(0), 0, 0);
		board.addMark(0, 0, theBoardView.getLabelPlayer().charAt(0));
		board.display();
		if(theBoardView.getLabelPlayer().charAt(0) == 'X') {
			xPlayer.checkGame();
		}
		else if(theBoardView.getLabelPlayer().charAt(0) == 'O') {
			oPlayer.checkGame();
		}
		}
	};
	}
	
	class BtnListener2 implements ActionListener{
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (theBoardView.getButtonMark(0, 1).charAt(0) == 'X' || theBoardView.getButtonMark(0, 1).charAt(0) == 'O' ) {
			theBoardView.spotAlreadyTaken();
		}
		else {
		theBoardView.setButtonMark(theBoardView.getLabelPlayer().charAt(0), 0, 1);
		board.addMark(0, 1, theBoardView.getLabelPlayer().charAt(0));
		board.display();
		if(theBoardView.getLabelPlayer().charAt(0) == 'X') {
			xPlayer.checkGame();
		}
		else if(theBoardView.getLabelPlayer().charAt(0) == 'O') {
			oPlayer.checkGame();
		}
		}
	};
	}
	
	class BtnListener3 implements ActionListener{
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (theBoardView.getButtonMark(0, 2).charAt(0) == 'X' || theBoardView.getButtonMark(0, 2).charAt(0) == 'O' ) {
			theBoardView.spotAlreadyTaken();
		}
		else {
		theBoardView.setButtonMark(theBoardView.getLabelPlayer().charAt(0), 0, 2);
		board.addMark(0, 2, theBoardView.getLabelPlayer().charAt(0));
		board.display();
		if(theBoardView.getLabelPlayer().charAt(0) == 'X') {
			xPlayer.checkGame();
		}
		else if(theBoardView.getLabelPlayer().charAt(0) == 'O') {
			oPlayer.checkGame();
		}
		}
	};
	}
	
	class BtnListener4 implements ActionListener{
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (theBoardView.getButtonMark(1, 0).charAt(0) == 'X' || theBoardView.getButtonMark(1, 0).charAt(0) == 'O' ) {
			theBoardView.spotAlreadyTaken();
		}
		else {
		theBoardView.setButtonMark(theBoardView.getLabelPlayer().charAt(0), 1, 0);
		board.addMark(1, 0, theBoardView.getLabelPlayer().charAt(0));
		board.display();
		if(theBoardView.getLabelPlayer().charAt(0) == 'X') {
			xPlayer.checkGame();
		}
		else if(theBoardView.getLabelPlayer().charAt(0) == 'O') {
			oPlayer.checkGame();
		}
		}
	};
	}
	
	class BtnListener5 implements ActionListener{
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (theBoardView.getButtonMark(1, 1).charAt(0) == 'X' || theBoardView.getButtonMark(1, 1).charAt(0) == 'O' ) {
			theBoardView.spotAlreadyTaken();
		}
		else {
		theBoardView.setButtonMark(theBoardView.getLabelPlayer().charAt(0), 1, 1);
		board.addMark(1, 1, theBoardView.getLabelPlayer().charAt(0));
		board.display();
		if(theBoardView.getLabelPlayer().charAt(0) == 'X') {
			xPlayer.checkGame();
		}
		else if(theBoardView.getLabelPlayer().charAt(0) == 'O') {
			oPlayer.checkGame();
		}
		}
	};
	}
	
	class BtnListener6 implements ActionListener{
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (theBoardView.getButtonMark(1, 2).charAt(0) == 'X' || theBoardView.getButtonMark(1, 2).charAt(0) == 'O' ) {
			theBoardView.spotAlreadyTaken();
		}
		else {
		theBoardView.setButtonMark(theBoardView.getLabelPlayer().charAt(0), 1, 2);
		board.addMark(1, 2, theBoardView.getLabelPlayer().charAt(0));
		board.display();
		if(theBoardView.getLabelPlayer().charAt(0) == 'X') {
			xPlayer.checkGame();
		}
		else if(theBoardView.getLabelPlayer().charAt(0) == 'O') {
			oPlayer.checkGame();
		}
		}
	};
	}
	
	class BtnListener7 implements ActionListener{
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (theBoardView.getButtonMark(2, 0).charAt(0) == 'X' || theBoardView.getButtonMark(2, 0).charAt(0) == 'O' ) {
			theBoardView.spotAlreadyTaken();
		}
		else {
		theBoardView.setButtonMark(theBoardView.getLabelPlayer().charAt(0), 2, 0);
		board.addMark(2, 0, theBoardView.getLabelPlayer().charAt(0));
		board.display();
		if(theBoardView.getLabelPlayer().charAt(0) == 'X') {
			xPlayer.checkGame();
		}
		else if(theBoardView.getLabelPlayer().charAt(0) == 'O') {
			oPlayer.checkGame();
		}
		}
	};
	}
	
	class BtnListener8 implements ActionListener{
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (theBoardView.getButtonMark(2, 1).charAt(0) == 'X' || theBoardView.getButtonMark(2, 1).charAt(0) == 'O' ) {
			theBoardView.spotAlreadyTaken();
		}
		else {
		theBoardView.setButtonMark(theBoardView.getLabelPlayer().charAt(0), 2, 1);
		board.addMark(2, 1, theBoardView.getLabelPlayer().charAt(0));
		board.display();
		if(theBoardView.getLabelPlayer().charAt(0) == 'X') {
			xPlayer.checkGame();
		}
		else if(theBoardView.getLabelPlayer().charAt(0) == 'O') {
			oPlayer.checkGame();
		}
		}
	};
	}
	
	class BtnListener9 implements ActionListener{
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (theBoardView.getButtonMark(2, 1).charAt(0) == 'X' || theBoardView.getButtonMark(2, 1).charAt(0) == 'O' ) {
			theBoardView.spotAlreadyTaken();
		}
		else {
		theBoardView.setButtonMark(theBoardView.getLabelPlayer().charAt(0), 2, 2);
		board.addMark(2, 2, theBoardView.getLabelPlayer().charAt(0));
		board.display();
		if(theBoardView.getLabelPlayer().charAt(0) == 'X') {
			xPlayer.checkGame();
		}
		else if(theBoardView.getLabelPlayer().charAt(0) == 'O') {
			oPlayer.checkGame();
		}
		}
	};
	}
	
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
	public void runTheGame(boardView theBoardView) {
		
		oPlayer.setOpponent(xPlayer);
		xPlayer.setOpponent(oPlayer);
		theBoardView.setInfoAreaText("Referee started the game...");
		board.display();
		xPlayer.play(theBoardView);
	}
	
	
	
}

package com.xworkz.practise.runner;

import com.xworkz.practise.external.CarromBoard;
import com.xworkz.practise.internal.ChessBoard;

public class PractiseRunner {
	public static void main(String[] args)
	{
		CarromBoard carromBoard=new CarromBoard("Black",300);
		carromBoard.display();
		
		ChessBoard chessBoard=new ChessBoard("white",200);
		chessBoard.display();
		
	}
	
	

}

package com.indo.nim_game;

import java.util.Random;
import java.util.Scanner;
import static java.lang.System.out;
import static java.lang.System.in;

public class func {
	
	static Random ran = new Random();
	static int mBox = 0;
	
	
	public static int setMatches() {
		mBox = ran.nextInt(20) + 6;
		return mBox;
	}
	
	static int count = 0;
	
	public static void takeMatch(int count) {
	
		if(count<=3 && count >= 0 && count <= var.matchbox){
		var.matchbox = var.matchbox - count;
		}
		else{
			out.println("Error: Count " + count + " must be Equal or less then 3");
		}

	

	
	
	

}
}

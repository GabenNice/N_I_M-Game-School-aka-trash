package com.indo.nim_game;

import static java.lang.System.in;
import static java.lang.System.out;

import java.io.IOException;
import java.util.Scanner;

public class main extends func {

	static player player1 = new player();
	static player player2 = new player();
	static Scanner keyboard = new Scanner(in);

	public static void main(String[] args) throws IOException {
		
while(player1.coins > 0 && player2.coins > 0){
		
		var.matchbox = setMatches();
		out.println("Coins:");
		out.println("      Player1: " + player1.coins);
		out.println("      Player2: " + player2.coins);
		
		while(true){
			
					out.println("\nThere are " + var.matchbox + " in the Matchbox.\n");
					out.println("Player1 it´s your turn.");
					out.println("Type a Number between 1 and 3 to take matches");

					player1.active = true;
					player2.active = false;
			
					takeMatch(keyboard.nextInt());
			
			      		if(var.matchbox == 0){
			      			break;}
			      					 		
			
			      	out.println("\nThere are " + var.matchbox + " in the Matchbox.\n");
			      	out.println("Player2 it´s your turn.");
			      	out.println("Type a Number between 1 and 3 to take matches");
			
			      	player1.active = false;
			      	player2.active = true;
			
			      	takeMatch(keyboard.nextInt());
			
			      		if(var.matchbox == 0){
			      			break;}}
		
		
		if(player1.active = true){
				out.println("\nPlayer2 won this round\n");
				player2.coins --;
				player1.coins ++;}
								 
		
		else {
			out.println("\nPlayer1 won this round\n");
			player1.coins --;
			player2.coins ++;}}
		
	
		if(player1.coins == 0){
		   out.println("\nPlayer2 won the Game\n");}
		
		if(player2.coins == 0){
	       out.println("\nPlayer1 won the Game\n");}
		}
	}


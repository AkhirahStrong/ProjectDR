import java.util.Scanner;

public class DiceRollApp {

	public static void main(String[] args) {
		
		        // This dice game will ask for the user to enter how 
				//many sides the dice should have, and generate a random number
				
				Scanner scan = new Scanner(System.in);
				
				//Global vars
				int rollCnt = rollCnt(0);
				int diSides;
				String yesNo;
				
				
				//Ask the user to enter the number of sides for a pair of dice
				System.out.println("Welcome to the Grand Circus Casino! ");
				
				System.out.println("\n");
				
				System.out.println("How many sides should each die have?");
				diSides = scan.nextInt();		
				System.out.println("\n");
				
				
				//display the results of each, and then ask the user if
				//he/she wants to roll the dice again
				do {
					int dice1 = dice1((int) (diSides*Math.random()+1));
					int dice2 = dice2((int) (diSides*Math.random()+1));

					
					
					rollCnt++;
					
					System.out.println("Roll " + rollCnt + ":");
					System.out.println(dice1);
					System.out.println(dice2);
					
					scan.nextLine();
					System.out.println("\n");
					
					//Display special messages for craps, snake eyes, and box cars.
					if(dice1 == 1 && dice2 == 1) {
						System.out.println("You rolled Snake Eyes!");
					}
					
					if(dice1 == 6 && dice2 == 6) {
						System.out.println("Whoa! Box Car!");
					}
					
					if(dice1 == 4 && dice2 == 3 || dice1 == 3 && dice2 == 4) {
						System.out.println("I don't know what craps is, so I made this up");
					}
					
					System.out.println("\n");
				
					System.out.println("Do you want to roll again? (Y/N)");
					yesNo = scan.nextLine();
					
					if(yesNo.equalsIgnoreCase("N") ) {
						System.out.println("Shucks! Hate to see you go, but would love to see you again!");
					}
					
				}while(yesNo.equalsIgnoreCase("Y"));		
				
				scan.close(); 
	          }
	
	
				///////  Method Section \\\\\\\\\\\
	
			    //Dice one method
				public static int dice1(int results1 ) {
				  return results1;
     			}
				
				
				//Dice two method
				public static int dice2(int results2 ) {
					  return results2;
				}
				
				
				//Roll counter
				public static int rollCnt(int roller) {
					return roller;
					
				}
	
         }
			


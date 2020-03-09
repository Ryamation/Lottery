
package Lottery;
import java.util.Scanner;

public class Run1 {
    static Lottery Ticket = new Lottery();
    
    public static void main(String[] args) {
        MakeTicket();
        Ticket.DisplayBalls();
     
    }
    public static void MakeTicket(){
        Scanner scan = new Scanner(System.in);
        String Name; 
        int chosenNumber, bonus;
		boolean acceptable=false;
        
        System.out.println("Please enter your name: ");
        Name = scan.next();
        Ticket.SetName(Name);
		
		for(int i = 0; i< 6; i++){
			acceptable = false;
			while(!acceptable){
				System.out.println("please enter number for ball " + (i +1) + ">> ");
				chosenNumber = scan.nextInt();
				acceptable = Ticket.SetBalls(chosenNumber, i);
				if(!acceptable){
					System.out.println("Please enter that ball again");
				}	
			}
		}
		System.out.println("please enter number for bonus ball >> ");
		bonus = scan.nextInt();
		Ticket.SetBonus(bonus);
    }
    
}

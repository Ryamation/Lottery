
package Lottery;

import java.util.Arrays;

public class Lottery {
    
    String Name;
    int Numbers[] = new int[6];
    int BonusBall;
    
    
    public void DisplayBalls(){
        System.out.println("Welcome "+Name+", the numbers you chose were;"
                + "\n"+Arrays.toString(Numbers)
        +"\nThe bonus ball you chose was: "+BonusBall+" Thank you for your purchase!");
                
    }
    public void SetName(String pName){
        Name = pName;
    }
    public boolean SetBalls(int pNumbers, int i){
        boolean acceptable=true;
		if(pNumbers >=1 && pNumbers <=49){
			for(int j= 0;j<i;j++){
				if (pNumbers == Numbers[j]){
					acceptable = false;
				}
			}	
			if(acceptable){
				Numbers[i] = pNumbers;
			}
		}
		else{
			acceptable = false;
		}	
		return acceptable;
    }
    public void SetBonus(int pbonus){
        BonusBall = pbonus;
    }
}



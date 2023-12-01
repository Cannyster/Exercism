package application;

import entities.AnnalynsInfiltration;
import entities.AnnalynsInfiltrationV2;

public class program {
public static void main(String[] args) {
	
	boolean knightIsAwake1 = true;
	boolean knightIsAwake2 = false;
	
	System.out.println(AnnalynsInfiltration.canFastAttack(knightIsAwake1));
	System.out.println(AnnalynsInfiltrationV2.canFastAttack(knightIsAwake2));
	
	}
}

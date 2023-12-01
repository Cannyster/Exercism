package programa;

import entidade.ArmstrongNumber;
import entidade.ArmstrongNumberV2;

public class teste {
public static void main(String[] args) {
		
	
	/*
	int number = 12345;
	String[] array = isArmstrongNumber.convertToArray(number);
	int[] arrayInt = isArmstrongNumber.convertToInt(array);
	int sum = 0;
	for(int i: arrayInt) {
		sum += i;
	}
	System.out.println(sum);
	*/
	
	System.out.println(ArmstrongNumber.isArmstrongNumber(153));
	System.out.println(ArmstrongNumberV2.isArmstrongNumber(153));
	
	}

}

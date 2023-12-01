package entidade;

public class ArmstrongNumberV2 {

	public static boolean isArmstrongNumber(int numberToCheck) {
        int sum = 0;
        String[] arrayString = Integer.toString(numberToCheck).split("");
        int size = arrayString.length;
        
        for(String s: arrayString) {
        	sum += Math.pow(Integer.parseInt(s), size);
        }
        return sum == numberToCheck;
    }

	
}

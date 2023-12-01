package entidade;

public class ArmstrongNumber {

	public static boolean isArmstrongNumber(int numberToCheck) {
        int sum = 0;
        String[] arrayString = convertToArray(numberToCheck);
        int[] arrayInt = convertToInt(arrayString);
        int size = arrayString.length;
        
        for(int i: arrayInt) {
        	sum += Math.pow(i, size);
        }
        
        if (sum == numberToCheck){
           return true; 
        }
        else{
            return false;
        }
            
    }
	
	public static String[] convertToArray(int numberToCheck){
		String convertString = String.valueOf(numberToCheck);
		String[] convertedStringArray = convertString.split("");
		return convertedStringArray;
	}
	
	public static int[] convertToInt(String[] string) {
		int size = string.length;
		int[] convertedIntArray = new int[size];
		for(int i = 0; i < size; i++){
			convertedIntArray[i] = Integer.parseInt(string[i]);
		}
		return convertedIntArray;
	}
	
	
}

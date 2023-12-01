package entities;

public class AnnalynsInfiltrationV2 {

    public static boolean canFastAttack(boolean knightIsAwake) {
        return !knightIsAwake;
     }
     

     public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {
         if(knightIsAwake || archerIsAwake || prisonerIsAwake){
             return true;
         }else{
             return false;
         }
     }

     public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
         return !archerIsAwake && prisonerIsAwake;
     }

     public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake, boolean petDogIsPresent) {
         if((!archerIsAwake && petDogIsPresent) || (!knightIsAwake && !archerIsAwake && prisonerIsAwake && !petDogIsPresent)){
             return true;
         }else{
             return false;
         }  
     }
	
}

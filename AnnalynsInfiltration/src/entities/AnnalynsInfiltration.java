package entities;

public class AnnalynsInfiltration {
	
    public static boolean canFastAttack(boolean knightIsAwake) {
        if (knightIsAwake == false){
            return true;
        }else{
            return false;
        }
    }
    public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {
        if((knightIsAwake == false && archerIsAwake == false && prisonerIsAwake == true)||(knightIsAwake == false && archerIsAwake == true && prisonerIsAwake == false)||(knightIsAwake == true && archerIsAwake == false && prisonerIsAwake == false)||(knightIsAwake == false && archerIsAwake == true && prisonerIsAwake == true)||(knightIsAwake == true && archerIsAwake == true && prisonerIsAwake == true) || (knightIsAwake == true && archerIsAwake == false && prisonerIsAwake == true)||(knightIsAwake == true && archerIsAwake == true && prisonerIsAwake == false)){
            return true;
        }else{
            return false;
        }
    }
    public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
        if(archerIsAwake == false && prisonerIsAwake == true){
            return true;
        }else{
            return false;
        }
    }
    public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake, boolean petDogIsPresent) {
        if((knightIsAwake == false && archerIsAwake == false && prisonerIsAwake == true && petDogIsPresent == false)||(knightIsAwake == false && archerIsAwake == false && prisonerIsAwake == false && petDogIsPresent == true)||(knightIsAwake == true && archerIsAwake == false && prisonerIsAwake == false && petDogIsPresent == true)||(knightIsAwake == false && archerIsAwake == false && prisonerIsAwake == true && petDogIsPresent == true)||(knightIsAwake == true && archerIsAwake == false && prisonerIsAwake == true && petDogIsPresent == true)){
            return true;
        }else{
            return false;
        }  
    }
}

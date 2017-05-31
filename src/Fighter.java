

public class Fighter extends CharacterClass {

	RageResource rr = new RageResource();
	static int fgtStr = 1;
	
	public Fighter(int inputHealth, int inputStrength, int inputIntellect, int inputDex, int inputMind){
		super("Fighter", inputHealth, (inputStrength + fgtStr), inputIntellect, inputDex, inputMind );
		
		
		
	}
	
}

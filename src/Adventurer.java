
public class Adventurer extends CharacterClass {

	static int advHar = 1;
	
	public Adventurer(int inputHealth, int inputStrength, int inputIntellect, int inputDex, int inputMind){
		super("Adventurer", (inputHealth + advHar), inputStrength, inputIntellect, inputDex, inputMind );
		
		
		
	}
}

public class Warrior extends Fighter {

	RageResource rr = new RageResource();
	static int warStr = 2;
	
	public Warrior(int inputHealth, int inputStrength, int inputIntellect, int inputDex, int inputMind){
		super(inputHealth, (inputStrength + warStr), inputIntellect, inputDex, inputMind );
	}
}

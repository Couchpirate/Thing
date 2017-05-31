
public class CharacterClass{
	
	String className;
	int health;
	
	int resource;
	int strength;
	int intellect;
	int dexterity;
	int mind;
	
	public CharacterClass(String inClass, int inHealth, int inStr, int inInt, int inDex, int inMnd){	
		
		this.className = inClass;
		this.health = inHealth;
		this.strength = inStr;
		this.intellect = inInt;
		this.dexterity = inDex;
		this.mind = inMnd;
		
	}
	public String getClassName(){
		return className;
	}
	public int getResource(){
		return resource;
	}
	public int getHP(){
		return health;
	}
	public int getInt(){
		return intellect;
	}
	public int getDex(){
		return dexterity;
	}
	public int getMnd(){
		return mind;
	}
	
	
	
}

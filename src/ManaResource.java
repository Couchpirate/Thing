
public class ManaResource {
	
	int minMana = 0;
	int maxMana;
	int curMana;
	
	public void gainMana(int inMana){
		
		this.maxMana += inMana;
		
	}
	
	public void spendMana(int usedMana){
		
		this.curMana -=usedMana;
	}
}

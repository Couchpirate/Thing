
public class RageResource {

	int minRage = 0;
	int maxRage = 100;
	int curRage;
	
	public void generateRage(int inRage){
		
		this.curRage += inRage;
		
	}
	
	public void spendRage(int usedRage){
		
		this.curRage -=usedRage;
	}
	
	
	
}

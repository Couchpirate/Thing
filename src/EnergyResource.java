
public class EnergyResource {
	int minEnergy = 0;
	int maxEnergy = 100;
	int curEnergy;
	
	public void generateEnergy(int inEnergy){
		
		this.curEnergy += inEnergy;
		
	}
	
	public void spendEnergy(int usedEnergy){
		
		this.curEnergy -=usedEnergy;
	}
}

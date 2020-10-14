/**
 * 
 * @author shenlu
 * 
 */

package sec;

public class Test {
	public static void main(String[] args){
		CPU cpu = new CPU();
		HardDisk HD = new HardDisk();
	    cpu.setSpeed(2200);
		HD.setAmount(200);
		cpu.setPrice(500);
		HD.setSize(30);
		PC pc = new PC();
		pc.setCPU(cpu);
		pc.setHardDisk(HD);
		pc.show();
		
	}
	
	Test(){
		
	}
	

}

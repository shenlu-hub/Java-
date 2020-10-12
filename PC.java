package sec;

public class PC {
	CPU cpu;
	HardDisk HD;
	void setCPU(CPU cpu){
		this.cpu = cpu;
	}
	void setHardDisk(HardDisk HD){
		this.HD = HD;
	}
	void show(){
		System.out.println("cpuÀŸ∂»:"+cpu.getSpeed());
		System.out.println("”≤≈Ã»›¡ø:"+HD.getAmount());
	
}
	PC(){
		
	}
}

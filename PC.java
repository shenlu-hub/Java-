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
		System.out.println("cpu速度："+cpu.getSpeed());
		System.out.println("硬盘容量："+HD.getAmount());
		System.out.println("cpu价格:"+cpu.getPrice());
		System.out.println("硬盘大小:"+HD.getSize());
	
}
	PC(){
		
	}
}

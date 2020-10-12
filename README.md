# Java-
java第二次实验
＃阅读程序
＃#实验目的
了解Java中的类，弄清类之间的联系，掌握构造方法，实现定义属性的修饰符近似
＃#实验过程
对照书上的UML用例图理清类的关系，了解对象属性
＃#核心方法
主类
`公共类测试{
	公共静态void main（String [] args）
		CPU cpu = new CPU();
		HardDisk HD = new HardDisk();
	    cpu.setSpeed(2200);
		HD.setAmount(200);
		PC pc = new PC();
		pc.setCPU(cpu);
		pc.setHardDisk(HD);
		pc.show();
		
	}
	
	Test(){
		
	}
	

}`
CPU
`public class CPU {public class CPU {
	private int speed;
	public int price;
	int getSpeed(){
		return speed;
	}
	public void setSpeed(int speed){
		this.speed = speed;
	}
	
	int getPrice(){
		return price;
	}
	public void setPrice(int price){
		this.price = price;
	}
	CPU(){
		
	}
}
	}
	public void setSpeed(int speed){
		this.speed = speed;
	}
	CPU(){
		
	}
}
`
PC
`public class PC {
	CPU cpu;
	HardDisk HD;
	void setCPU(CPU cpu){
		this.cpu = cpu;
	}
	void setHardDisk(HardDisk HD){
		this.HD = HD;
	}
	void show(){
		System.out.println("cpu速度:"+cpu.getSpeed());
		System.out.println("硬盘容量:"+HD.getAmount());
	
}
	PC(){
		
	}
}`
HardDisk
`public class HardDisk {public class HardDisk {
	private int amout;
	public int size;
	int getAmount(){
		return amout;
	}
    public void setAmount(int amout){
		this.amout = amout;
	}
    
    
    int getSize(){
		return size;
	}
	public void setSize(int size){
		this.size = size;
	}
	
	HardDisk(){
		
	}
}
	int getAmount(){
		return amout;
	}
	public void setAmount(int amout){
		this.amout = amout;
	}
	HardDisk(){
		
	}
}`
##实验结果
cpu速度:2200
硬盘容量:200
cpu价格:500
硬盘大小:30
＃#实验感想
了解了如何定义对象调用对象，了解了private的用法，把实验的不同类放在多个包中还欠佳

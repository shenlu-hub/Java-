# Java-
java第二次实验
# 阅读程序
 ## 实验目的
1. 理解 Java 语言是如何体现面向对象编程基本思想的；

2. 掌握类的声明以及对象的创建；

3. 了解类的成员变量和成员方法的特性以及类的构造方法的使用。

4. 了解修饰符并能多元化的运用
## 实验过程
用类描述计算机中CPU的速度和硬盘的容量，要求Java应用程序由4个类，名字分别是PC、CPU、HardDisk、和Test，其中Test是主类。

PC类与CPU和HardDisk类关联的UML图
其中，CPU类要求getSpeed()返回speed的值，要求setSpeed(int m)方法将参数m的值赋值给speed；
HardDisk类要求getAmount()返回amount的值，要求setAmount（int m）方法将参数m的值赋值给amount；
PC类要求setCPU(CPU c)将参数c的值赋值给CPU，
要求setHardDisk(HardDisk h)方法将参数h的值赋值给HD，要求show()方法能显示CPU的速度和硬盘的容量。
主类Test的要求
（1）main方法中创建一个CPU对象cpu，cpu将自己的speed设置为2200.
（2）main方法中创建一个HardDisk对象disk，disk将自己的amount设置为200。
（3）main方法中创建一个PC对象pc。
（4）pc调用setCPU(CPU c)方法，调用时实参是cpu。
（5）pc调用setHardDisk(HardDisk）方法，调用时实参是disk。
（6）pc调用show方法。
附加条件：
类中定义不少于两个构造方法；
每个类定义不少于2个属性，且属性的类型应该多样化；
根据课堂中关于访问权限的内容，尝试定义属性的修饰符多样化，类中定义方法操作属性，避免直接通过“类对象.属性”的形式访问属性值；且定义的方法内应该有符合常理的逻辑判断；
尝试把本次实验的多个类放置在不同的包中，体会修饰符private的用法。


## 核心方法

### Test
```
public class Test {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CPU cpu = new CPU();//创建一个CPU对象
		HardDisk HD = new HardDisk();//创建一个HardDisk对象
		cpu.setSpeed(2200);//将cpu的速度设置为2200
		HD.setAmount(200);//将硬盘的容量设置为200
		cpu.setPrice(500);
		HD.setSize(30);
		PC pc = new PC();
		pc.setCPU(cpu);
		pc.setHardDisk(HD);
		pc.show();

	}

}
```
### CPU
```
class CPU{
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
}
```
### PC
```
class PC{
	CPU cpu;
	HardDisk HD;
	void setCPU(CPU cpu){
		this.cpu = cpu;
	}
	void setHardDisk(HardDisk HD){
		this.HD = HD;
	}
	
	void show() {
		System.out.println("cpu速度："+cpu.getSpeed());
		System.out.println("硬盘容量："+HD.getAmount());
		System.out.println("cpu价格:"+cpu.getPrice());
		System.out.println("硬盘大小:"+HD.getSize());
		
	}
}
```
### HardDisk
```
class HardDisk{
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
	
}
```

## 实验结果
cpu速度:2200
硬盘容量:200
cpu价格:500
硬盘大小:30
## 实验感想
了解了如何定义对象调用对象，了解了private的用法，把实验的不同类放在多个包中还欠佳

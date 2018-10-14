package com.free;
import java.util.Scanner;

public class Selecter {
	private int[] nums;
	public int[] getNums() {
		return nums;
	}

	public void setNums(int[] nums) {
		this.nums = nums;
	}

	public int getDates() {
		return dates;
	}

	public void setDates(int dates) {
		this.dates = dates;
	}

	private int dates;
	Scanner input = new Scanner(System.in);

	public void enter(Car c[]) {
		System.out.println("您是否需要租车？是：1， 否：0");
		int s1 = input.nextInt();
		if(s1 == 1) {
			System.out.println("欢迎进入达达租车系统");
			this.printCars(c);
		} else {
			System.out.println("期待再次相见");
		}
	}
	
	public void printCars(Car c[]) {
		System.out.println("序号  车型  租金  载客 载物");
		for(int i=0;i<c.length;i++) {
			Car c1 =c[i];
			System.out.println(c1.item+c1.name+c1.price+"/天，载物："+c1.tonNum+",载客"+c1.personNum);
		}
	}
	
	
	
	@SuppressWarnings("null")
	public void printChoice() {
		System.out.println("您需要租几辆车？");
		int s = input.nextInt();
		int[] n = null;
		for(int i=0;i<s;i++) {
			System.out.println("请输入第"+(i+1)+"辆车的序号");
			int in = input.nextInt();
			n[i]=in;
			this.setNums(n);
		}
		System.out.println("请输入你要租的天数");
		this.dates = input.nextInt();
	}
	
	public void sumPrice(Car cars[]) {
		int sumPrice=0;
		for(int i=0;i<this.nums.length;i++) {
			Car c = cars[this.nums[i]];
			sumPrice+=c.price;
		}
		System.out.println("您本次租车总金额为:"+sumPrice*this.dates);
	}
	
	public void printTruck(Car cars[]) {
		int sumTon=0;
		System.out.println("可以载货的汽车有：");
		for(int i=0;i<this.nums.length;i++) {
			Car c=cars[this.nums[i]];
			if(c.tonNum>0) {
				System.out.print(c.name);
				sumTon+=c.tonNum;
			}
		}
		System.out.print("总共载货"+sumTon+"吨");
	}
	
	public void printNums(Car cars[]) {
		int sumPersons=0;
		System.out.println("可以载客的汽车有：");
		for(int i=0;i<this.nums.length;i++) {
			Car c=cars[this.nums[i]];
			if(c.personNum>0) {
				System.out.print(c.name);
				sumPersons+=c.personNum;
			}
		}
		System.out.print("总共载客"+sumPersons+"人");
	}

}

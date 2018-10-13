package com.free;
import java.util.Scanner;

public class Selecter {
	private int nums[];
	private int dates;
	Scanner input = new Scanner(System.in);
	public void enter() {
		System.out.println("您是否需要租车？是：1， 否：0");
		String s1 = input.nextLine();
		if(s1 == "1") {
			System.out.println("欢迎进入达达租车系统");
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
	
	public void printChoice() {
		System.out.println("您需要租几辆车？");
		int s = input.nextInt();
		for(int i=0;i<s;i++) {
			System.out.println("请输入第"+(i+1)+"辆车的序号");
			int n = input.nextInt();
			this.nums[i] = n;
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
	
	public void printTruck(Car Cars[]) {
		int sumTon=0;
	}

}

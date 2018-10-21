package com.free;
import java.util.Scanner;

public class Selecter {
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
	
	
	public int[] nums() {
		System.out.println("您需要租几辆车？");
		int s = input.nextInt();
		int[] nums=new int[10];
		for(int i=0;i<s;i++) {
			System.out.println("请输入第"+(i+1)+"辆车的序号");
			int in = input.nextInt();
			nums[i]=in;
		}
		return nums;
	}
	public int date() {
		System.out.println("请输入你要租的天数?");
		int in1=input.nextInt();
		return in1;
	}
	
	public void sumPrice(Car cars[], int[] nums, int dates) {
		int sumPrice=0;
		for(int i=0;i<nums.length;i++) {
			if(nums[i]>0) {
				Car c = cars[nums[i]];
				sumPrice+=c.price;
				System.out.println(c.price);
			}
			
		}
		System.out.println(sumPrice);
		System.out.println(dates);
		System.out.println("您本次租车总金额为:"+sumPrice*dates);
	}
	
	public void printTruck(Car cars[], int[] nums) {
		int sumTon=0;
		System.out.print("可以载货的汽车有：");
		for(int i=0;i<nums.length;i++) {
			if(nums[i]>0) {
				Car c=cars[nums[i]];
				if(c.tonNum>0) {
					System.out.print(c.name);
					sumTon+=c.tonNum;
				}
			}
			
		}
		System.out.print("总共载货"+sumTon+"吨");
	}
	
	public void printNums(Car cars[], int[] nums) {
		int sumPersons=0;
		System.out.print("可以载客的汽车有：");
		for(int i=0;i<nums.length;i++) {
			if(nums[i]>0) {
				Car c=cars[nums[i]];
				if(c.personNum>0) {
					System.out.print(c.name);
					sumPersons+=c.personNum;
				}
			}
			
			
		}
		System.out.print("总共载客"+sumPersons+"人");
	}

}

package com.free;

public class Inital {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car cars[]= {new Car(1,"马自达6",100.0,5,0), new Car(2,"雷凌",200,5,0),new Car(3,"皮卡",300,5,1),new Car(4,"江淮",200,0,10),new Car(5,"依维柯",400,10,0)};
		Selecter s=new Selecter();
		s.enter(cars);
		s.main(cars);
	}

}

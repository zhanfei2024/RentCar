package com.free;

public class Pickup extends Car implements ILoading, IPassenger {
	
	public Pickup(String name, double price, int code, int num, double ton) {
		super(name, price, code, num, ton);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void loading(double ton) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void passenger(int person) {
		// TODO Auto-generated method stub
		
	}
	

}

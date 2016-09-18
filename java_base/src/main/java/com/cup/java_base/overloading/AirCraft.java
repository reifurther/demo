package com.cup.java_base.overloading;

public class AirCraft {
	
	public void fly(){
		System.out.println("Fly for free.");
	}
	
	//overloading method
	public void fly(int times){
		for(int a=1;a<times;a++){
			System.out.println("I'm flying again.");
		}
	}
	
}

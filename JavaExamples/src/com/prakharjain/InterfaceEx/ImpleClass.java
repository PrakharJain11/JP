package com.prakharjain.InterfaceEx;

public class ImpleClass implements DInter {

	@Override
	public String sayHi() {
		// TODO Auto-generated method stub
		return "Hi";
	}

	@Override
	public String sayHiB() {
		// TODO Auto-generated method stub
		System.out.println("IN B");
		return null;
	}

	@Override
	public String sayHiA() {
		// TODO Auto-generated method stub
		return null;
	}

	/*@Override
	public String sayHiC() {
		// TODO Auto-generated method stub
		return null;
	}
*/
}

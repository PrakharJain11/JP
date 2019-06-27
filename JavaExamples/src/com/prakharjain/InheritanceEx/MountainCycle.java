package com.prakharjain.InheritanceEx;

public class MountainCycle extends MountainBike {
	/*public MountainCycle()
	{
		super(10,20,40);
	}
	*/
	public MountainCycle(int xyz, int abc, int def)
	{
		super(xyz,abc,def);
		System.out.println("In Mountain Cycle");
	}
	
}

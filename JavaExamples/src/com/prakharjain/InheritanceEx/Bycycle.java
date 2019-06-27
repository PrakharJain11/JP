package com.prakharjain.InheritanceEx;

public class Bycycle {
	// the Bicycle class has two fields 
    public int gear; 
    public int speed; 
          
    // the Bicycle class has one constructor 
    public Bycycle(int gear, int speed) 
    { 
        this.gear = gear; 
        this.speed = speed; 
        System.out.println("IN bicycle");
    } 
        
    // the Bicycle class has three methods 
    public void applyBrake(int decrement) 
    { 
        speed -= decrement; 
    } 
          
    public void speedUp(int increment) 
    { 
        speed += increment; 
    } 
      
    // toString() method to print info of Bicycle 
    public String toString()  
    { 
        return("No of gears are "+gear 
                +"\n"
                + "speed of bicycle is "+speed); 
    }  
}

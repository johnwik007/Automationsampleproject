package javaprogramms;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter any year");
	int n = sc.nextInt();
	if(n%100==0 && n%400==0 || n%100!=0 && n%4==0)
	{
		System.out.println("Leap year");
	}

	else
	{
		System.out.println("not a leap year");
	}
	
}

}

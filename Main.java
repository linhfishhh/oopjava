package javaoop;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Width: ");
		double width1=sc.nextDouble();
		System.out.print("height: ");
		double height1=sc.nextDouble();
		Rectangle rec=new Rectangle(width1, height1);
		rec.display();
	}

}

package com.cubeofnumber;

import java.util.Scanner;

public class Cube {

	public static void main(String[] args) {
		int n;
		int cube;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number...");
		n=sc.nextInt();
		sc.close();
		for (int i = 1; i <=n; i++) {
			cube=i*i*i;
			System.out.println("Number is "+i+" cube of "+i+" is :"+cube);
		}
	}

}

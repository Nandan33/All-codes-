package ta2;

import java.util.Scanner;

public class pattern {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 7;
		sc.close();
		System.out.println("enter n");
		for(int i=1;i<=n;i++) {
			for (int j = i; j < n; j++) {
				System.out.print(" "+"*");
			}
			System.out.println();
		}
	}

}

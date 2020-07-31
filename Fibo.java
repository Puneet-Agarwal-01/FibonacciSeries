package myCaptain;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of terms required in series :");
		int n = sc.nextInt();
		for (int i=0;i<n;i++) {
			int r = fibo(i);
			System.out.print(r + " ");
		}

	}
	public static int fibo(int a) {
		if (a == 0)
			return 0;
		else if (a == 1)
			return 1;
		else 
			return (fibo(a-1) + fibo(a-2));
		
	}

}

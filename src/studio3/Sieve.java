package studio3;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Sieve {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("Number: ");
		int n = in.nextInt();
		int[] array = new int [n];

		for(int i=2; i <= n; i++) {
			if (array[i - 1] != -1) {
				
				if (i == 2) {
					System.out.print(i);
				} else {
					System.out.print(", " + i);
				}
				
				int currentPrime = i;
				int currentMultiple = 2;
				
				while (currentPrime * currentMultiple <= n) {
					array[currentPrime * currentMultiple - 1] = -1;
					currentMultiple++;
				}
				
			}
	    }

	}
}

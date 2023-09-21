package studio3;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Sieve {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("Number: ");
		int n = in.nextInt();
		int[][] array = new int [10][4];
		
		for(int i=0; i < array.length; i++) {
	       for (int j=0; j < array.length; j++) {
	    	   array[i][j] = i+2;
	       }
	    }
	}
}

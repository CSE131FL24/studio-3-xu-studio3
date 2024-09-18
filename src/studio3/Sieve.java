package studio3;

import java.util.Scanner;

public class Sieve {

	public static void sieve(int n) {
		boolean prime[] = new boolean [n+1];
			for (int i = 2; i <= n; i++) {
				prime[i]=true;
		}
			for (int p = 2; p * p <= n; p++) {
				if(prime[p]) {
				 for(int i = p * p; i <= n; i +=p) {
					 prime[i]=false;
				 }
			}
		}
		System.out.println("Prime numbers up to " + n + ":");
		for (int i = 2; i <= n; i++) {
			if(prime[i]) {
				System.out.println(i + "");
				}
			}
		System.out.println();
		}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = in.nextInt();
		sieve(n);
	}
}
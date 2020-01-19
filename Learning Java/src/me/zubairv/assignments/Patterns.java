package me.zubairv.assignments;

public class Patterns {

	public static void main(String[] args) {
		System.out.println("--------------------01----------------------------");
		/*
		 1
		 1 2 
		 1 2 3
		 1 2 3 4
		 1 2 3 4 5		 
		 */
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		System.out.println("--------------------02----------------------------");
		/*
			A
			A B
			A B C
			A B C D
			A B C D E		 
		 */
		for(int i=1; i<=5; i++) {
			for(int j=65; j<65+i; j++) {
				System.out.print((char)j+" ");
			}
			System.out.println();
		}
		System.out.println("--------------------03----------------------------");
		/*
		 	$ $ $ $ $ 
			$       $ 
			$       $ 
			$       $ 
			$ $ $ $ $ 

		 */
		int n = 5;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				if(i==1 || i==n || j==1 || j==n) {
					System.out.print("$ ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println("------------------------------------------------");
		
	}

}

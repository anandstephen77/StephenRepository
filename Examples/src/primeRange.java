

import java.util.Scanner;

public class primeRange {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter low and high ranges:");
		int low= sc.nextInt();
		int high= sc.nextInt();
		
		System.out.println("prime numbers are:");
		for (int i = low; i <= high; i++) {
			int c = 0;
			for(int j=1;j<=i;j++){
				if(i%j == 0){
					c++;
				}
			}
			if(c==2){
				System.out.println(i);
			}
		}
		
		
	}
}

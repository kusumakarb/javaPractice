package start;

import java.util.Scanner;

public class Sum {
	
	static int addThem(int a, int b){
		return a+b;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t,a,b,sum;
		t = in.nextInt();
		
		for(int i=0;i<t;i++){
			a = in.nextInt();
			b = in.nextInt();
			sum = addThem(a,b);
			System.out.println(sum);
		
		}
		
		in.close();
	}

}

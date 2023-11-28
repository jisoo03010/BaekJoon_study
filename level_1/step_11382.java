package level_1;

import java.util.Scanner;

public class step_11382 {
    public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
	    long a, b, c;
		a = sc.nextLong();
		b = sc.nextLong();
		c = sc.nextLong();
        
		
		System.out.println(a+b+c);
	}
}

// int 바이트가 넘어갈 수 있음으로 long 타입으로 변환 해야한다.
// int 타입은  4바이트임 
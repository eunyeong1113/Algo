package com.algo.date0805;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class swexpert1225 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//sc = new Scanner(src);
		int a=1;
		int num=0;
		Queue<Integer> password = new LinkedList<Integer>();
		//LinkedList<Integer> password = new LinkedList<Integer>();
		
		//for (int i = 0; i < 10; i++) {
			int T=sc.nextInt();
			for (int j = 0; j < 8; j++) {
				password.offer(sc.nextInt());
			}
			while(true)
			{
				for (int j = 0; j < 5; j++) {
					num=password.peek();
					System.out.println("num : "+num);
					System.out.println(password.size());
					password.poll();
					password.offer(num-a);
					System.out.println("num-a : "+(num-a));
					//System.out.println("peek"+password.peek());
					a++;
				}
				a=1;
				if(password.poll()<=0)
					break;
			}
			for (int j = 0; j < 8; j++) {
				//System.out.print(password.poll()+" ");
			}
			System.out.println();
		}

	//}
	static String src="1\r\n" + 
			"9550 9556 9550 9553 9558 9551 9551 9551 \r\n" + 
			"2\r\n" + 
			"2419 2418 2423 2415 2422 2419 2420 2415 \r\n" + 
			"3\r\n" + 
			"7834 7840 7840 7835 7841 7835 7835 7838 \r\n" + 
			"4\r\n" + 
			"4088 4087 4090 4089 4093 4085 4090 4084 \r\n" + 
			"5\r\n" + 
			"2945 2946 2950 2948 2942 2943 2948 2947 \r\n" + 
			"6\r\n" + 
			"670 667 669 671 670 670 668 671 \r\n" + 
			"7\r\n" + 
			"8869 8869 8873 8875 8870 8872 8871 8873 \r\n" + 
			"8\r\n" + 
			"1709 1707 1712 1712 1714 1710 1706 1712 \r\n" + 
			"9\r\n" + 
			"10239 10248 10242 10240 10242 10242 10245 10235 \r\n" + 
			"10\r\n" + 
			"6580 6579 6574 6580 6583 6580 6577 6581 \r\n" + 
			"";

}

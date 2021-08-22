package com.algo.date0820;

import java.util.Scanner;

public class swexpert1247 {
	static class point{
		int x;
		int y;
		public point(int x, int y) {
			this.x = x;
			this.y = y;
		}
		@Override
		public String toString() {
			return "x : " + x + " y : "+ y;
		}
	}
	static boolean visit[];
	static point[] p,number;
	static int N,dir,min=Integer.MAX_VALUE;
	static point start,end;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		int T=sc.nextInt();
		for (int tc = 1; tc <=T; tc++) {
			N=sc.nextInt();
			p=new point[N];
			number=new point[N+2];
			visit=new boolean[N];
			start = new point(sc.nextInt(), sc.nextInt());
			end = new point(sc.nextInt(), sc.nextInt());
			for (int i = 0; i < p.length; i++) {
				p[i]=new point(sc.nextInt(), sc.nextInt());
			}
			for (int i = 0; i < N+2; i++) {
				number[i]=new point(0,0);
			}
			//System.out.println(Arrays.toString(p));
			dfs(0);
			System.out.println("#"+tc+" "+min);
			min=Integer.MAX_VALUE;
		}
	
	}
	private static void dfs(int cnt) {
		if(cnt==N) {
			
			//System.out.println(Arrays.toString(number));
			number[0].x=start.x;number[0].y=start.y;
			number[N+1].x=end.x;number[N+1].y=end.y;
			for (int i = 0; i < number.length; i++) {
				if(i+1<number.length) {
			
					dir+=Math.abs(number[i].x-number[i+1].x)+Math.abs(number[i].y-number[i+1].y);
				}
			}
			min=Math.min(min, dir);
			dir=0;
			return;
		}
		
		for (int j = 0; j < p.length; j++) {
			if(visit[j])continue;
			
			number[cnt+1].x=p[j].x;
			number[cnt+1].y=p[j].y;
			visit[j]=true;
			
			dfs(cnt+1);
			visit[j]=false;
		}
		
	}

}


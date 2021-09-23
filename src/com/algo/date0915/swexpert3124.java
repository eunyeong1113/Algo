package com.algo.date0915;

import java.util.Arrays;
import java.util.Scanner;

public class swexpert3124 {

	static int V,E;
	static MST[] mstList;
	static int[] parents;
	static class MST implements Comparable<MST>{
		int start;
		int end;
		long value;
		public MST(int start, int end, long value) {
			this.start = start;
			this.end = end;
			this.value = value;
		}
		@Override
		public int compareTo(MST o) {
			return Long.compare(this.value, o.value);
		}
		
	}
	private static void make() {
		parents =  new int[V+1];
		for (int i = 1; i <= V; i++) {
			parents[i]=i;
		}
	}
	private static int find(int a) {
		if(a==parents[a])return a;
		return parents[a]=find(parents[a]);
	}
	private static boolean union(int a, int b) {
		int aRoot = find(a);
		int bRoot = find(b);
		if(aRoot==bRoot) return false;
		
		parents[bRoot]=aRoot;
		return true;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T=sc.nextInt();
		for (int tc = 1; tc <=T; tc++) {
			V = sc.nextInt();
			E = sc.nextInt();
			mstList=new MST[E];
			
			for (int i = 0; i < E; i++) {
				mstList[i]=new MST(sc.nextInt(), sc.nextInt(), sc.nextInt());
			}
			Arrays.sort(mstList);
			
			make();
			int cnt=0;
			long result=0;
			for (MST m : mstList) {
				if(union(m.start, m.end)) {
					result +=m.value;
					if(++cnt==V-1)break;
				}
			}
			System.out.println("#"+tc+" "+result);
		}
	}
}

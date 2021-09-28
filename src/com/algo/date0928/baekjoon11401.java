package com.algo.date0928;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baekjoon11401 {

	static int N,K,P;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()+" ");
		
		N = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());
		P=1000000007;
		
		System.out.println(nCr(N,K,P));
	}
	private static long nCr(int n, int k, int p) {
		if(K==0)
			return 1L;
		
		long[] fac = new long[n+1];
		fac[0]=1L;
		
		for (int i = 1; i <= n; i++) {
			fac[i] = fac[i-1]*i%p;
		}
		return (fac[n]*power(fac[k],p-2,p) % p*power(fac[n-k],p-2,p))%p;
		
		
	}
	private static long power(long x, int y, int p) {
		long res=1L;
		//x=x%p;
		while(y>0) {
			if(y%2==1)
				res = (res*x)%p;
			y=y>>1;
			x=(x*x)%p;
		}
		return res;
	}

}

package com.algo.date0901;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon5639 {

	static Node root;
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		root = new Node(Integer.parseInt(br.readLine()));//
		
		while(true) {
			String s=br.readLine();
			if(s==null||s.equals(""))
				break;
			Node N=new Node(Integer.parseInt(s));
			setNode(root, N);
		}
		getNode(root);
		System.out.println(sb.toString());
	}
	static void setNode(Node start, Node next) {
		if(next.num<start.num) {
			if(start.left!=null)
				setNode(start.left, next);
			else
				start.left=next;
		}else {
			if(start.right!=null)
				setNode(start.right, next);
			else
				start.right=next;
		}
	}
	static void getNode(Node node) {
		if(node==null)
			return;
		getNode(node.left);
		getNode(node.right);
		sb.append(node.num+"\n");
		
	}
	static class Node{
		int num;
		Node left;
		Node right;
		public Node(int num) {
			this.num = num;
		}
	}
}


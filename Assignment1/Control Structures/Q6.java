package com.assignment2.app;

public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		short count = 10;
		String s = ".";
		
		for(int i = 0;i<count;i++){
			for(int j = count;j>i;j--){
				System.out.print(s);
			}
			System.out.println();
		}

	}

}

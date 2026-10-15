package com.KodeWala.Array;

public class array1 {
		public static void main(String [] args) {
			
			int arr[] = new int[1000];
			
			for(int i=0; i<arr.length ; i++) {
				if(arr[i]<0) {
					System.out.println("-ve array");
					break;
				}
				else {
					System.out.println("+ve array");
				}
			}
			
			
		}
}

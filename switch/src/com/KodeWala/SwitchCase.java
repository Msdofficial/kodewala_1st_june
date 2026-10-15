package com.KodeWala;
//import java.util.Scanner;
public class SwitchCase {

	public static void main(String[] args) {
		//Scanner sc = new Scanner(System.in);
		//int day = sc.nextInt();
		
		int day = Integer.parseInt(args[0]);
		
		
        String output = SwitchCase.identifyDay(day);
        System.out.println("The day is: "+output);
	}
	
	public static String identifyDay(int number) {
		String day = "null";
		switch (number) {
		case 1:
			day = "MON";
			break;
		case 2:
			day = "TUE";
			break;
		case 3:
			day = "WED";
			break;
		case 4:
			day = "THU";
			break;
		case 5:
			day = "FRI";
			break;
		case 6:
			day = "SAT";
			break;
		case 7:
			day = "SUN";
			break;

		default:
			day = "UNKNOWN";
			break;
		}
		return day;
	}

}

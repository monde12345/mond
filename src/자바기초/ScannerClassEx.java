package �ڹٱ���;

import java.util.Scanner;

 public class ScannerClassEx {
	 

	public static void main(String[] args) {
		//Scanner Ŭ���� ��ü ���� ���
		Scanner scan = new Scanner(System.in);
		
		System.out.println(scan);
		double inptDouble =scan.nextDouble();
	    System.out.println(inptDouble);
		
		/*
		System.out.print("���� �Է�>>>");
		input inputInt = scan. nextInt();
		System.out.println(inputInt);
         */

        
		System.out.print("���ڿ� �Է�>>>");
		String inputString = scan.nextLine();
		System.out.println(inputString);
	}   
 }
package day02;

import java.util.Scanner;

public class SimpleCompute {

	public static void main(String[] args) {
	    int number1, number2, sum, diff, product;

	    Scanner scan = new Scanner(System.in);
	    

	    System.out.print("첫 번째 정수를 입력하세요: ");
	    number1 = scan.nextInt();

	    System.out.print("두 번째 정수를 입력하세요: ");
	    number2 = scan.nextInt();

	    sum = number1 + number2;

	    diff = number1 - number2;

	    product = number1 * number2;

	    System.out.println ("합  = " + sum);
	    System.out.println ("차  = " + diff);
	    System.out.println ("곱  = " + product);
	}

}

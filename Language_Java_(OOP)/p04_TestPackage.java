// By 5MQuadr! (s-m-quadri@github , 26107@diems2020-24)
// Last Updated On : 11th December 2021

import a5.p04_Calci;
import a5.p04_Series;
import java.util.Scanner;

class Main{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		
		// Calci class
		p04_Calci obj = new p04_Calci();
		System.out.printf("\nđšī¸ Please enter any two numbers : ");
		int a = scan.nextInt();
		int b = scan.nextInt();
		System.out.printf("đ¸ī¸ Addition is %d \n",p04_Calci.add(a,b));
		System.out.printf("đ¸ī¸ Substraction is %d \n",obj.sub(a,b));
		System.out.printf("đ¸ī¸ Multiplication is %d \n",obj.mul(a,b));
		System.out.printf("đ¸ī¸ Division is %2.2f \n",obj.div(a,b));
		System.out.printf("đ¸ī¸ It is %b that, %d is even\n" , obj.isEven(a) , a);
		System.out.printf("đ¸ī¸ It is %b that, %d is odd\n" , obj.isOdd(b) , b);
		System.out.printf("đ¸ī¸ It is %b that, %d and %d are equal\n",obj.isEqual(a,b),a,b);
		
		// Series class - table
		System.out.printf("\nđšī¸ Enter the number : ");
		int table_number = scan.nextInt();
		p04_Series.get_table(table_number);
		
		// Series class - fibonachi series
		p04_Series.fibonaci();
		
		
	}
	
}

package homework1JavaSyntax.task1and2;


import java.util.Scanner;

public class RectangleArea {

	public static void main(String[] args) {
		calculateArea();

	}

	public static void calculateArea(){
		Scanner scanner=new Scanner(System.in);
		double a=scanner.nextDouble();
		double b=scanner.nextDouble();	
		scanner.close();
		
		double result=a * b;
		
		System.out.println("Rectangle Area is: "+result);
	}
}

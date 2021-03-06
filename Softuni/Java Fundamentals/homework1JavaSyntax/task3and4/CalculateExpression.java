package homework1JavaSyntax.task3and4;

public class CalculateExpression {

	public static void main(String[] args) {
		getResult(5, 2, 3);
		getResult(3.8, 2.5, 1.2);

	}

	private static double resultOfFirstFormula(double a, double b, double c){
		double aSqrt = a * a;
		double bSqrt = b * b;
		double mainExpr = (aSqrt+bSqrt)/(aSqrt-bSqrt);
		double powExpr=(a+b+c)/Math.sqrt(c);
		
		return Math.pow(mainExpr, powExpr);
	}
	
	
	private static double resultOfSecondFormula(double a, double b, double c){
		double cCub=c*c*c;
		double mainExpr=a*a + b*b - cCub;
		double powExpr=a-b;
		return Math.pow(mainExpr, powExpr);
	}
	
	private static double averageOfNumbers(double a, double b, double c){
		return (a+b+c)/3;
	}
	
	private static double averageOfFormulas(double a, double b, double c){
		return (resultOfFirstFormula(a, b, c) + resultOfSecondFormula(a, b, c)) / 2;
	}
	
	private static void getResult(double a, double b, double c){
		double f1=averageOfNumbers(a,b,c);
		double f2=averageOfFormulas(a, b, c);
		double result=Math.abs(f1-f2);	
		System.out.format("F1: %.2f  F2: %.2f  Diff: %.2f%n", f1, f2, result);
	}
}

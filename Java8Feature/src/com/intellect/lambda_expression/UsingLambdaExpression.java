package com.intellect.lambda_expression;

import com.intellect.lambda_expression.Caculator;

public class UsingLambdaExpression {

	public static void main(String[] args) {
		//With type decleration 
		Caculator sum = (int a, int b) -> System.out.println("The sum is: " + (a + b));
		sum.operation(10, 20);
		
		//With out type declaration
		Caculator subtract = (a, b) -> System.out.println("The subtract is: " + (a - b));
		subtract.operation(20, 10);
		
		
		Caculator multi = (a, b) -> System.out.println("The multiplication is: " + (a * b));
		multi.operation(20, 10);
		
		Caculator div = (a, b) -> System.out.println("The divide is: " + (a / b));
		div.operation(20, 10);
	}
}

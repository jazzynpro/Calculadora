package com.krakedev;

public class TestCalculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculadora c1 = new Calculadora();
		int r1;
		r1 = c1.sumar(5, 8);		
		System.out.print("Resultado suma: "+ r1);
		
		int r2;
		r2 = c1.restar(8, 5);
		System.out.print("Resultado resta: "+ r2);
		
		double r3;
		r3 = c1.multiplicar(10, 5);
		System.out.print("Resultado producto: "+ r3);
		
	}

}

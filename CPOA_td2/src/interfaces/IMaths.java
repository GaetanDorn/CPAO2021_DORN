package interfaces;

import exception.MathsException;

public interface IMaths {
	
	int addition(int a , int b);
	
	int soustraction(int a, int b);

	int multiplication(int a, int b);
	
	double division(int a, int b) throws MathsException;
}

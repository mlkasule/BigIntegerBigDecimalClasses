/**
 * if we want to deal with numbers that are too large, 
 * we wont will not be using the int, long, or double datatype to store these number.
 * We can use the BIgDecimal and BigNumber classes to create new objects,
 * then store and perform tasks on the data. 
 * @author Mark
 *
 */


import java.math.BigInteger;
import java.math.BigDecimal;
public class BigNumberDecimal {

	public static void main(String[] args) {
		
		//declare a big number
		BigInteger firstNumber = new BigInteger("9323232321232343434334");	
		BigInteger secondNumber = new BigInteger("566634565534338634333");	
		
		multplyBigNumbers(firstNumber, secondNumber);		//multiply
		subBigNumbers(firstNumber, secondNumber);			//Subtract
		addBigNumbers(firstNumber, secondNumber);			//add
		divideBigNumbers(firstNumber, secondNumber);		//divide
		remainderBigNumbers(firstNumber, secondNumber);		//remainders

	}
	//multiply method
	public static void multplyBigNumbers(BigInteger number1, BigInteger number2)
	{
		BigInteger result = number1.multiply(number2);
	}
	//subtract method
	public static void subBigNumbers(BigInteger number1, BigInteger number2)
	{	
		BigInteger result = number1.subtract(number2);
	}
	//add method
	public static void addBigNumbers(BigInteger number1, BigInteger number2)
	{	
		BigInteger result = number1.add(number2);
	}
	//divide method
	public static void divideBigNumbers(BigInteger number1, BigInteger number2)
	{	
		BigDecimal result = new BigDecimal(number1.divide(number2));	//change to decimal if we want decimal points
	}
	//remainder method
	public static void remainderBigNumbers(BigInteger number1, BigInteger number2)
	{	
		BigDecimal result = new BigDecimal(number1.remainder(number2));  //change to decimal to get remainders
	}

}

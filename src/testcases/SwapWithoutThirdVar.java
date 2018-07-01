package testcases;

public class SwapWithoutThirdVar {

	public static void main(String[] args) {

		int x = 5; //0101
		int y = 10; //1010
		
		//x = 10, y = 5
		
		//1. with using third var : t
//		int t;
//		t = x; //5
//		x = y; //10
//		y = t; //5
		
		//2. without using third var: using + operator
//		x = x + y; //15
//		y = x - y; //5
//		x = x - y; // 10
		
		//3. without using third var: using * operator
//		 x = x * y; //50
//		 y = x / y;  //5
//		 x = x / y; //10
		
	     //4. using XOR: ^
		x = x ^ y; //15 --> 1111
		y = x ^ y; //10 --> 1010
		x = x ^ y; // 5 --> 0101
		 
		
		System.out.println(x);
		System.out.println(y);
		
		
		
		
	}

}

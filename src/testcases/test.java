package testcases;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class test {
	static int[] array = { 1, 3, 5, 6, 7, 9, 10 };

	public static void main(String[] args){

		find();
	}
	
	public static void find(){
		for (int i = 0; i < array.length; i++)
		    System.out.println(array[i] + " ");

		System.out.println("The Missing Number is:");
		 int j = 0;
		for (int i = 1; i <= array[array.length-1]; i++) {
		    if (j < array.length && i == array[j])
		    j++;
		    else
		    System.out.println(i + " ");
		}

}
}

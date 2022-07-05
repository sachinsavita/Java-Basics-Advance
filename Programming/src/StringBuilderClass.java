
public class StringBuilderClass {
	
	//java.lang.StringBuilder
	//final class
	//mutable
	//store in heap memory
	//capacity based
	//dynamic in size
	// Use StringBuilder where you dont want to create string object again and again.
	
	//Has Four Constructor
	
	//1. new StringBuilder - 16
	//2. new StringBuilder(String str) - str.length()+16 
	//3. new StringBuilder (Char[]arr) - arr.length()+16
	//4. new StringBuilder (int capacity) - Uder Define
	
	//Methods - 
	//1. capacity();
	//2. length();
	//3. append("aaaa");
	//4. reverse();
	//CAPACITY = (OLD CAPACITY * 2) + 2

	
	public static void main(String[] args) {
		StringBuilder strbr = new StringBuilder();
		strbr.append("aaaa");
		strbr.append("bbbb");
		System.out.println(strbr.length());
		strbr.append("cccc");
		strbr.append("dddd");
		System.out.println(strbr.length());
		strbr.append("eeee");
		System.out.println(strbr.reverse());
		System.out.println(strbr.capacity());
		
	}
}

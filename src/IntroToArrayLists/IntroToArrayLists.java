package Package;

import java.util.ArrayList;

public class IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		//   Don't forget to import the ArrayList class
		ArrayList<String> al=new ArrayList<String>();
		//2. Add five Strings to your list
		al.add("ae");
		al.add("bd");
		al.add("cc");
		al.add("db");
		al.add("ea");
		//3. Print all the Strings using a standard for-loop
		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i));
		}
		//4. Print all the Strings using a for-each loop
		System.out.println();
		for(String str:al) {
			System.out.println(str);
		}
		System.out.println();
		//5. Print only the even numbered elements in the list.
		for(int i=0;i<al.size();i++) {
			if(i%2==0)
			System.out.println(al.get(i));
		}
		//6. Print all the Strings in reverse order.
		System.out.println();
		for(int i=al.size()-1;i>=0;i--) {
			System.out.println(al.get(i));
		}
		//7. Print only the Strings that have the letter 'e' in them.
		System.out.println();
		for(int i=0;i<al.size();i++) {
			if(al.get(i).contains("e"))
			System.out.println(al.get(i));
		}
	}
}
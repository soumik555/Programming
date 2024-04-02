package practice;

import java.util.ArrayList;
import java.util.Collections;
//import java.util.TreeMap;

public class Frequency_Collection {
	public static void main(String[] args) {
	ArrayList<Integer> t1=new ArrayList<Integer>();
//		TreeMap<Integer, Integer> t1=new TreeMap<Integer, Integer>();
		t1.add(90);
		t1.add(45);
		t1.add(90);
		t1.add(30);
		t1.add(45);
		t1.add(50);
		t1.add(60);
		
//		System.out.println("Before Sorting:");
//		System.out.println(t1);
//		
//		System.out.println("After Sorting:");
//		Collections.sort(t1);
//		System.out.println(t1);
		
		int freq=Collections.frequency(t1, 90);
		int freq2=Collections.frequency(t1, 45);
		int freq3=Collections.frequency(t1, 30);
		int freq4=Collections.frequency(t1, 50);
		int freq5=Collections.frequency(t1, 60);
		
		System.out.println("90 " + freq );
		System.out.println("45 " + freq2 );
		System.out.println("30 " + freq3 );
		System.out.println("50 " + freq4 );
		System.out.println("60 " + freq5 );
		
		
	}

}

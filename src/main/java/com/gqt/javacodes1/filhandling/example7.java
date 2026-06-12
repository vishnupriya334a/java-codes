package com.gqt.javacodes1.filhandling;

import java.util.ArrayList;
import java.util.Collections;

public class example7 {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(100);
        al.add(95);
        al.add(86);
        al.add(150);
        al.add(26);
        al.add(125);
        al.add(175);
        System.out.println(al);
        System.out.println("-----------");
        Collections.sort(al);
        System.out.println(al);
        
	}

}

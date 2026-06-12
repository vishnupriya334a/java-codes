package com.gqt.javacodes1.filhandling;

import java.util.ArrayList;

public class example14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
        for(Integer integer : al) {
        	System.out.println(integer);
        }

	}

}

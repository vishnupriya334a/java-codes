package com.gqt.javacodes1.filhandling;

import java.util.ArrayList;

public class example11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al = new ArrayList<String>();
        al.add("anu");
        al.add("vishnu");
        al.add("rohan");
        al.add("anju");
        al.add("nikitha");
        System.out.println(al);
        System.out.println("-----------");
        String min =al.stream().min((s1,s2)->s1.compareTo(s2)).get();
        System.out.println("The min valued String is ="+min);
        System.out.println("-------------");
        String max =al.stream().max((s1,s2)->s1.compareTo(s2)).get();
        System.out.println("The max valued String is ="+max);

	}

}

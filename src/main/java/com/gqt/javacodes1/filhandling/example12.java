package com.gqt.javacodes1.filhandling;

import java.util.ArrayList;

public class example12 {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
        al.add("100");
        al.add("95");
        al.add("86");
        al.add("150");
        al.add("26");
        al.add("125");
        al.add("175");
        System.out.println(al);
        System.out.println("-----------");
        String min =al.stream().min((s1,s2)->s1.compareTo(s2)).get();
        System.out.println("The min valued String is ="+min);
        System.out.println("-------------");
        String max =al.stream().max((s1,s2)->s1.compareTo(s2)).get();
        System.out.println("The max valued String is ="+max);
	}

}

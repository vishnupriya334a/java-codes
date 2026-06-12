package com.gqt.javacodes1.filhandling;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class example10 {

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
        Collections.sort(al);
        List<String>res = al.stream().sorted((s1,s2)->s1.compareTo(s2)).collect(Collectors.toList());
        System.out.println(res);
	}

}

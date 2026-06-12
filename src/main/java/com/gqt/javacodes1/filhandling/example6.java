package com.gqt.javacodes1.filhandling;

import java.util.ArrayList;

public class example6 {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
        al.add("anu");
        al.add("vishnu");
        al.add("rohan");
        al.add("anju");
        al.add("nikitha");
        System.out.println(al);
        System.out.println("-----------");
        long count= al.stream().filter(s->s.length()==5).count();
        System.out.println(count);
	}

}

package com.gqt.javacodes1.filhandling;

import java.util.ArrayList;

public class example3 {

	public static void main(String[] args) {
         ArrayList<String> al = new ArrayList<String>();
         al.add("anu");
         al.add("vishnu");
         al.add("rohan");
         al.add("anju");
         al.add("nikitha");
         System.out.println(al);
         System.out.println("-----------");
         ArrayList<String>res=new ArrayList<String>();
         for(int i=0;i<al.size();i++) {
        	 res.add(al.get(i).toUpperCase());
         }
         System.out.println(res);
         
         
	}

}

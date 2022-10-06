package com.handling.bll;

import java.util.Scanner;

public class Handling002 {

	public static void main(String[]  args) {
		
		String w;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a sentence here : ");
		String a[] = sc.nextLine().split(" ");
		w = "";
		
		for(String i:a) {
			if(w.length() > i.length());
			w=i;
		}
		System.out.println("Largest word : " + w);
		System.out.println("Length : "+ w.length());
		sc.close();
	}
}

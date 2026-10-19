package test;

import java.util.Scanner;

public class Ex6 {
	public static void main(String[] args) {
		float math,english,physics,programming,min,max,minplural = 0,maxplural = 0;
		double ave;
		boolean count = false;
		Scanner sc = new Scanner(System.in);
		System.out.println("Input your scores of 4 subjects ( Math,English,Phusics, and Programming) :");
		
		math = sc.nextFloat();
		english = sc.nextFloat();
		physics = sc.nextFloat();
		programming = sc.nextFloat();
		
		min = Math.min(math, Math.min(english, Math.min(physics, programming)));
		max = Math.max(math, Math.max(english, Math.max(physics, programming)));
		
		if(math == english || math == physics || math == programming || english == physics || english == programming || physics == programming) {
			count = true;
		}
		
		System.out.print("Max score is: " + max + "(");
		if(math == max) {
			System.out.print("Math");
		}
		if (math == max && english == max) {
			System.out.print(" and");
			maxplural = max;
		}
		if(english == max) {
			System.out.print(" English");
		}
		if (english == max && physics == max) {
			System.out.print(" and");
			maxplural = max;
		}
		if(physics == max) {
			System.out.print(" Physics");
		}
		if (physics == max && programming == max) {
			System.out.print(" and");
			maxplural = max;
		}
		if(programming == max) {
			System.out.print(" Programming");
		}
		if (count == true && maxplural == max) {
			System.out.println(" courses)");
		}else {
			System.out.println(" course)");
		}
		
		System.out.print("Min score is: " + min + "(");
		if(math == min) {
			System.out.print("Math");
		}
		if (math == min && english == min) {
			System.out.print(" and");
			minplural = max;
		}
		if(english == min) {
			System.out.print(" English");
		}
		if (english == min && physics == min) {
			System.out.print(" and");
			minplural = max;
		}
		if(physics == min) {
			System.out.print(" Physics");
		}
		if (physics == min && programming == min) {
			System.out.print(" and");
			minplural = max;
		}
		if(programming == min) {
			System.out.print(" Programming");
		}
		if (count && minplural == min) {
			System.out.println(" courses)");
		}else {
			System.out.println(" course)");
		}
		
		 ave = (math+english+physics+programming)/4;
		System.out.print("Average score of this student is: " + ave);
		sc.close();
		
	}

}

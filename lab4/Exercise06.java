package lab4;

import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;

public class Exercise06 {
	public static void main(String[] args) {
		ArrayList<String> candidates = new ArrayList<>();
		try {
			Scanner sc = new Scanner(new File("CandidatePerformanceTest.csv"));
			sc.nextLine(); 
			while (sc.hasNextLine()) {
			    String line = sc.nextLine().trim();
			    String[] parts = line.split(",");
			    if (parts.length == 10 && Character.isDigit(line.charAt(0))) {
			        candidates.add(line);
			    }
			}

			question1(candidates);
			question2(candidates);
			question3(candidates);
			question4(candidates);
			sc.close();
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void question1(ArrayList<String> list) {
			int total = list.size();
			int male = 0,female = 0;
			float pmale,pfemale;
			for (String s : list) {
				String data[] = s.split(",");
				if(data[1].equalsIgnoreCase("male")) {
					male++;
				}else {
					female++;
				}
			}
			pmale = (100f*male)/total;
			pfemale = (female*100f)/total;
			System.out.println("Total candidates: " + total);
			System.out.println("Male % = " + pmale );
			System.out.println("Female % = " + pfemale);
		}
	public static void question2(ArrayList<String> list) {
		int male = 0, female = 0, total = list.size();
		float pmale, pfemale;
		
		for(String s : list ) {
			String data[] = s.split(",");
			double score = Double.parseDouble(data[9].trim());
			if( score >= 90 && data[1].equalsIgnoreCase("male")) {
				male++;
			}
			if( score >= 90 && data[1].equalsIgnoreCase("female")) {
				female++;
			}
		}
		pmale = (male*100)/total;
		pfemale = (female*100)/total;
		System.out.println("\nCandidates got higher than 90 = " + (male+female));
		System.out.println("Male % = " + pmale);
		System.out.println("Female % = " + pfemale);
	}
	public static void question3(ArrayList<String> list) {
		int m=0,e=0,c=0;
		for(String s : list ) {
			String data[] = s.split(",");
			int mscore = Integer.parseInt(data[5].trim());
			int escore = Integer.parseInt(data[6].trim());
			int cscore = Integer.parseInt(data[7].trim());
			if( mscore >=85) {
				m++;
			}
			if( escore >=85) {
				e++;
			}
			if( cscore >=85) {
				c++;
			}
		}
		System.out.println("\nCandidates got least 85 for each subjects:");
		System.out.println("Math = " + m);
		System.out.println("English = " + e);
		System.out.println("Computer = " + c);
	}
	public static void question4(ArrayList<String> list) {
		int amale = 0, bmale = 0, cmale = 0, dmale = 0, emale = 0;
		int afemale = 0, bfemale = 0, cfemale = 0, dfemale = 0, efemale = 0;
		float pamale, pafemale, pbmale, pbfemale, pcmale, pcfemale, pdmale, pdfemale, pemale, pefemale;
		int total = list.size();
		for(String s : list) {
			String data[] = s.split(",");
			if(data[1].equalsIgnoreCase("male") && data[2].equalsIgnoreCase("group A")) {
				amale++;
			}
			if(data[1].equalsIgnoreCase("female") && data[2].equalsIgnoreCase("group A")) {
				afemale++;
			}
			if(data[1].equalsIgnoreCase("male") && data[2].equalsIgnoreCase("group B")) {
				bmale++;
			}
			if(data[1].equalsIgnoreCase("female") && data[2].equalsIgnoreCase("group B")) {
				bfemale++;
			}
			if(data[1].equalsIgnoreCase("male") && data[2].equalsIgnoreCase("group C")) {
				cmale++;
			}
			if(data[1].equalsIgnoreCase("female") && data[2].equalsIgnoreCase("group C")) {
				cfemale++;
			}
			if(data[1].equalsIgnoreCase("male") && data[2].equalsIgnoreCase("group D")) {
				dmale++;
			}
			if(data[1].equalsIgnoreCase("female") && data[2].equalsIgnoreCase("group D")) {
				dfemale++;
			}
			if(data[1].equalsIgnoreCase("male") && data[2].equalsIgnoreCase("group E")) {
				emale++;
			}
			if(data[1].equalsIgnoreCase("female") && data[2].equalsIgnoreCase("group E")) {
				efemale++;
			}
		}
		pamale = (amale*100f)/total;
		pafemale = (afemale*100f)/total;
		pbmale = (bmale*100f)/total;
		pbfemale = (bfemale*100f)/total;
		pcmale = (cmale*100f)/total;
		pcfemale = (cfemale*100f)/total;
		pdmale = (dmale*100f)/total;
		pdfemale = (dfemale*100f)/total;
		pemale = (emale*100f)/total;
		pefemale = (efemale*100f)/total;
		System.out.println("\nGroup A = " + (amale + afemale));
		System.out.println("Male % = " + pamale);
		System.out.println("Female % = " + pafemale);
		System.out.println("Group B + " + (bmale + bfemale));
		System.out.println("Male % = " + pbmale);
		System.out.println("Female % = " + pbfemale);
		System.out.println("Group C + " + (cmale + cfemale));
		System.out.println("Male % = " + pcmale);
		System.out.println("Female % = " + pcfemale);
		System.out.println("Group D + " + (dmale + dfemale));
		System.out.println("Male % = " + pdmale);
		System.out.println("Female % = " + pdfemale);
		System.out.println("Group E + " + (emale + efemale));
		System.out.println("Male % = " + pemale);
		System.out.println("Female % = " + pefemale);
	}
}

package lab4;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.FileWriter;

public class Exercise07 {
	public static void main(String[] args) {
		ArrayList<String> candidates = new ArrayList<>();
		ArrayList<String> groupa = new ArrayList<>();
		ArrayList<String> groupb = new ArrayList<>();
		ArrayList<String> groupc = new ArrayList<>();
		ArrayList<String> groupd = new ArrayList<>();
		ArrayList<String> groupe = new ArrayList<>();

		try {
			Scanner sc = new Scanner(new File("CandidatePerformanceTest.csv"));
			
			File fa = new File("GroupA.csv");
			File fb = new File("GroupB.csv");
			File fc = new File("GroupC.csv");
			File fd = new File("GroupD.csv");
			File fe = new File("GroupE.csv");
			FileWriter fwa = new FileWriter(fa);
			FileWriter fwb = new FileWriter(fb);
			FileWriter fwc = new FileWriter(fc);
			FileWriter fwd = new FileWriter(fd);
			FileWriter fwe = new FileWriter(fe);
			

			
			String header = sc.nextLine();
			
			while(sc.hasNextLine()) {
				candidates.add(sc.nextLine());
				}
			
			int amale = 0, bmale = 0, cmale = 0, dmale = 0, emale = 0;
			int afemale = 0, bfemale = 0, cfemale = 0, dfemale = 0, efemale = 0;
			float pamale, pafemale, pbmale, pbfemale, pcmale, pcfemale, pdmale, pdfemale, pemale, pefemale;
			for(String s : candidates) {
				String data[] = s.split(",");
				if(data[1].trim().equalsIgnoreCase("male") && data[2].trim().equalsIgnoreCase("group A")) {
					amale++;
					groupa.add(s);
				}
				if(data[1].trim().equalsIgnoreCase("female") && data[2].trim().equalsIgnoreCase("group A")) {
					afemale++;
					groupa.add(s);
				}
				if(data[1].equalsIgnoreCase("male") && data[2].equalsIgnoreCase("group B")) {
					bmale++;
					groupb.add(s);
				}
				if(data[1].equalsIgnoreCase("female") && data[2].equalsIgnoreCase("group B")) {
					bfemale++;
					groupb.add(s);
				}
				if(data[1].equalsIgnoreCase("male") && data[2].equalsIgnoreCase("group C")) {
					cmale++;
					groupc.add(s);
				}
				if(data[1].equalsIgnoreCase("female") && data[2].equalsIgnoreCase("group C")) {
					cfemale++;
					groupc.add(s);
				}
				if(data[1].equalsIgnoreCase("male") && data[2].equalsIgnoreCase("group D")) {
					dmale++;
					groupd.add(s);
				}
				if(data[1].equalsIgnoreCase("female") && data[2].equalsIgnoreCase("group D")) {
					dfemale++;
					groupd.add(s);
				}
				if(data[1].equalsIgnoreCase("male") && data[2].equalsIgnoreCase("group E")) {
					emale++;
					groupe.add(s);
				}
				if(data[1].equalsIgnoreCase("female") && data[2].equalsIgnoreCase("group E")) {
					efemale++;
					groupe.add(s);
				}
				
			}
			int atotal = groupa.size();
			int btotal = groupb.size();
			int ctotal = groupc.size();
			int dtotal = groupd.size();
			int etotal = groupe.size();
			
			System.out.println("Group A: " + groupa.size());
			System.out.println("Group B: " + groupb.size());
			System.out.println("Group C: " + groupc.size());
			System.out.println("Group D: " + groupd.size());
			System.out.println("Group E: " + groupe.size());
			
			pamale = (amale*100f)/atotal;
			pafemale = (afemale*100f)/atotal;
			pbmale = (bmale*100f)/btotal;
			pbfemale = (bfemale*100f)/btotal;
			pcmale = (cmale*100f)/ctotal;
			pcfemale = (cfemale*100f)/ctotal;
			pdmale = (dmale*100f)/dtotal;
			pdfemale = (dfemale*100f)/dtotal;
			pemale = (emale*100f)/etotal;
			pefemale = (efemale*100f)/etotal;
			
			sc.close();
			fwa.write(header + "\n" );
			fwa.write("ID,gender,group,Education,test preparation course,Math,English,Computor,Total,Average\n");
			for(String s : groupa) {
				fwa.write(s + "\n");
			}
			fwa.write("Total ,"+ atotal + "\n");
			fwa.write("Male %," + pamale + "\n");
			fwa.write("Femal %," + pafemale + "\n");
			fwb.write(header + "\n");
			fwb.write("ID,gender,group,Education,test preparation course,Math,English,Computor,Total,Average\n");
			for(String s : groupb) {
				fwb.write(s + "\n");
			}
			fwb.write("Total ,"+ btotal + "\n");
			fwb.write("Male %," + pbmale + "\n");
			fwb.write("Femal %," + pbfemale + "\n");
			
			fwc.write(header + "\n");
			fwc.write("ID,gender,group,Education,test preparation course,Math,English,Computor,Total,Average\n");
			for(String s : groupc) {
				fwc.write(s + "\n");
			}
			fwc.write("Total ,"+ ctotal + "\n");
			fwc.write("Male %," + pcmale + "\n");
			fwc.write("Femal %," + pcfemale + "\n");
			
			fwd.write(header + "\n");
			fwd.write("ID,gender,group,Education,test preparation course,Math,English,Computor,Total,Average\n");
			for(String s : groupd) {
				fwd.write(s + "\n");
			}
			fwd.write("Total ,"+ dtotal + "\n");
			fwd.write("Male %," + pdmale + "\n");
			fwd.write("Femal %," + pdfemale + "\n");
			
			fwe.write(header + "\n");
			fwe.write("ID,gender,group,Education,test preparation course,Math,English,Computor,Total,Average\n");
			for(String s : groupe) {
				fwe.write(s + "\n");
			}
			fwe.write("Total ,"+ etotal + "\n");
			fwe.write("Male %," + pemale + "\n");
			fwe.write("Femal %," + pefemale + "\n");
			fwa.close();
			fwb.close();
			fwc.close();
			fwd.close();
			fwe.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}

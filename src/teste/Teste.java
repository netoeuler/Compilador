package teste;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

class Teste {
	
	public static void main(String args[]) {
		
		BufferedReader br = null;
		String dir = System.getProperty("user.dir") + "/src/";
		
		try {
			br = new BufferedReader(new FileReader(dir + "programaParaTeste"));			
		} catch (FileNotFoundException e) {
			System.out.println(e);
			return;
		}
				
	}
}
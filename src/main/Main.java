package main;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PushbackReader;

import compilador.lexer.Lexer;
import compilador.lexer.LexerException;
import compilador.node.Token;


class Main {
	
	public static void main(String args[]) {
		BufferedReader br = null;
		String dir = System.getProperty("user.dir") + "/src/";
		
		try {
			br = new BufferedReader(new FileReader(dir + "programaParaTeste"));			
		} catch (FileNotFoundException e) {
			System.out.println(e);
			return;
		}
		
		Lexer l = new Lexer(new PushbackReader(br));
		Token t = null;
		String erros = "";
		
		while (true){
			try{
				t = l.next();
			} catch (LexerException e){
				erros += e+"\n";
				continue;
			} catch (IOException e) {
				erros += e+"\n";
				continue;
			}
			
			System.out.println(t.getText() + " (" + t.getClass() + ")");
			
			if (t.getText().equals(""))
				break;
		}
		
		if (!erros.trim().isEmpty())
			System.out.println(erros);
		
	 }
}

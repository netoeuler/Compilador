package main;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PushbackReader;

import compilador.lexer.Lexer;
import compilador.lexer.LexerException;
import compilador.node.Start;
import compilador.parser.Parser;
import compilador.parser.ParserException;


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
		
		try {
			// Create a Parser instance.
			Parser p =	new Parser(
					new Lexer(new PushbackReader(br)));
			
			// Parse the input.
			//Start tree = p.parse();
			p.parse();
			
		 } catch (LexerException e) {
			System.out.println(e);
		 } catch (ParserException e) {
			System.out.println(e);
		} catch (IOException e) {
			System.out.println(e);
		}
	 }
}

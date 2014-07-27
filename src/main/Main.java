package main;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PushbackReader;

import semantica.AnalisadorSemantico;
import semantica.SemanticaAritmetica;

import compilador.lexer.Lexer;
import compilador.lexer.LexerException;
import compilador.node.Start;
import compilador.node.Token;
import compilador.parser.Parser;
import compilador.parser.ParserException;


class Main {
	
	public static void main(String args[]) {
		String arquivo = "";
		if (args.length == 0)
			arquivo = System.getProperty("user.dir") + "/teste/programaParaTeste6";
		else
			arquivo = args[0];
		
		BufferedReader br = null;		
		
		//Análise Léxica
		try {						
			br = new BufferedReader(new FileReader(arquivo));
		} catch (FileNotFoundException e) {
			System.out.println(e);
			return;
		}
		
		Lexer l = new Lexer(new PushbackReader(br));
		Token t = null;
		String erros = "";
		int numTokens = 0;
		
		while (true){
			try{
				t = l.next();
				numTokens++;
			} catch (LexerException e){
				erros += e+"\n";
				continue;
			} catch (IOException e) {
				erros += e+"\n";
				continue;
			}
			
			Integer lenId = t.getClass().toString().split(" ")[1].split("\\.").length-1;
			String id = t.getClass().toString().split(" ")[1].split("\\.")[lenId];
			/*System.out.print(id + " ");
			
			if (numTokens % 10 == 0)
				System.out.println("");*/
			if (t.getText().equals(""))
				break;
		}
	
		System.out.println("");
		if (!erros.trim().isEmpty())
			System.out.println(erros);		
		
		//Análise Sintática
		try {						
			br = new BufferedReader(new FileReader(arquivo));
		} catch (FileNotFoundException e) {
			System.out.println(e);
			return;
		}
		
		l = new Lexer(new PushbackReader(br));		
		
		Parser p = new Parser(l);
		try {
			Start tree;
			tree = p.parse();
			tree.apply(new AnalisadorSemantico());
			tree.apply(new SemanticaAritmetica());
		} catch (ParserException e) {			
			System.out.println(e.getMessage());
		} catch (LexerException e) {			
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	 }
}
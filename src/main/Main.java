package main;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PushbackReader;

import semantica.AnalisadorSemantico;
import semantica.SemanticaAritmetica;
import semantica.SemanticaAtribuicao;

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
			arquivo = System.getProperty("user.dir") + "/src/teste/semantica/programaParaTeste5";
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
		
		MyLexer l = new MyLexer(new PushbackReader(br));
		Token t = null;
		
		while (true){
			try{
				t = l.next();
			} catch (LexerException e){
				System.out.println(e+"\n");
				continue;
			} catch (IOException e) {
				System.out.println(e+"\n");
				continue;
			}
			
			if (t.getText().equals(""))
				break;
		}
		
		//Análise Sintática
		try {						
			br = new BufferedReader(new FileReader(arquivo));
		} catch (FileNotFoundException e) {
			System.out.println(e);
			return;
		}
		
		l = new MyLexer(new PushbackReader(br));
		
		Parser p = new Parser(l);
		try {
			Start tree;
			tree = p.parse();
			tree.apply(new AnalisadorSemantico());
			//tree.apply(new SemanticaAtribuicao());
			//tree.apply(new SemanticaAritmetica());
		} catch (ParserException e) {			
			System.out.println(e.getMessage());
		} catch (LexerException e) {			
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	 }
}
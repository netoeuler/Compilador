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
		String arquivo = "";
		if (args.length == 0)
			arquivo = System.getProperty("user.dir") + "/src/teste/programaParaTeste";
		else
			arquivo = args[0];
		
		BufferedReader br = null;		
		
		try {						
			br = new BufferedReader(new FileReader(arquivo));
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
			
			//System.out.println(t.getText() + " (" + t.getClass() + ")");
			Integer lenId = t.getClass().toString().split(" ")[1].split("\\.").length-1;
			String id = t.getClass().toString().split(" ")[1].split("\\.")[lenId];
			System.out.print(id + " ");
			
			if (id.equals("TQuebra") || id.equals("TCommentLine"))
				System.out.println("");			
			if (t.getText().equals(""))
				break;
		}
		
		System.out.println("");
		if (!erros.trim().isEmpty())
			System.out.println(erros);
		
	 }
}
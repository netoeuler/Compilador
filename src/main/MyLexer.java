package main;

import java.io.IOException;
import java.io.PushbackReader;

import compilador.lexer.Lexer;
import compilador.lexer.LexerException;
import compilador.node.TEol;

public class MyLexer extends Lexer{
	
	public MyLexer(PushbackReader in) {
		super(in);
	}

	public void run(){
		
		TEol eol = new TEol();
		String nomeToken = "";
		
		try {
			nomeToken = peek().getText();
		} catch (LexerException e) {			
			System.out.println(e + nomeToken);
		} catch (IOException e) {			
			System.out.println(e + nomeToken);
		}
		
		while (token != null && !token.equals(eol)){
			try {
				token = null;
				nomeToken = peek().getText();
			} catch (LexerException e) {			
				System.out.println(e + nomeToken);
			} catch (IOException e) {			
				System.out.println(e + nomeToken);
			}
		}
	}
	
	@Override
	protected void filter() throws LexerException, IOException
    {
        // Do nothing
    }

}

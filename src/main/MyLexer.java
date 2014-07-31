package main;

import java.io.IOException;
import java.io.PushbackReader;

import compilador.lexer.Lexer;
import compilador.lexer.LexerException;
import compilador.node.InvalidToken;
import compilador.node.TComentarioBloco;

public class MyLexer extends Lexer{

	public MyLexer(PushbackReader pushbackReader) {
		super(pushbackReader);		
	}
	
	@Override
	protected void filter() throws LexerException, IOException {
		if (token instanceof TComentarioBloco){
			String comentario=((TComentarioBloco)token).getText();
			int balanco=0;
			
			for (int i=0 ; i < comentario.length()-1 ; i++){
				//System.out.println("["+comentario.charAt(i)+"]");
				if (comentario.charAt(i) == '/' && comentario.charAt(i+1) == '*')
					balanco++;				
				else if (comentario.charAt(i) == '*' && comentario.charAt(i+1) == '/')
					balanco--;
			}
			
			if (balanco > 0)
				throw new LexerException(new InvalidToken("/*"), "Comentário em linha não aninhado");
			else if (balanco < 0)
				throw new LexerException(new InvalidToken("*/"), "Comentário em linha não aninhado");
		}
	}

}

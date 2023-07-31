package br.com.epsilon.cm.modelo;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import java.util.concurrent.locks.Condition;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.com.epsilon.cm.excecao.ExplosaoException;

public class CampoTeste {

	private Campo campo;
	
	@BeforeEach // Para cada metodo ele vai chamar esse função
	void iniciarCampo() {
		campo = new Campo(3, 3);
	}
	
	@Test
	void testeVizinhoDistancia1Esquerda() {
		Campo vizinho = new Campo(3, 2);
		boolean resultado = campo.adicionarVizinho(vizinho);
		assertTrue(resultado);
	}

	@Test
	void testeVizinhoDistancia1Direita() {
		Campo vizinho = new Campo(3, 4);
		boolean resultado = campo.adicionarVizinho(vizinho);
		assertTrue(resultado);
	}

	@Test
	void testeVizinhoDistancia1EmCima() {
		Campo vizinho = new Campo(2, 3);
		boolean resultado = campo.adicionarVizinho(vizinho);
		assertTrue(resultado);
	}

	@Test
	void testeVizinhoDistancia1EmBaixo() {
		Campo vizinho = new Campo(4, 3);
		boolean resultado = campo.adicionarVizinho(vizinho);
		assertTrue(resultado);
	}

	@Test
	void testeVizinhoDistancia2() {
		Campo vizinho = new Campo(2, 2);
		boolean resultado = campo.adicionarVizinho(vizinho);
		assertTrue(resultado);
	}

	@Test
	void testeNaoVizinho() {
		Campo vizinho = new Campo(1, 1);
		boolean resultado = campo.adicionarVizinho(vizinho);
		assertFalse(resultado);
	}
	 
	@Test
	void testeAlternarMarcao() {
		campo.alternarMarcacao();
		assertTrue(campo.isMarcado());
	}

	@Test
	void testeAlternarMarcaoDuasChamadas() {
		campo.alternarMarcacao();
		campo.alternarMarcacao();
		assertFalse(campo.isMarcado());
	}

	@Test
	void testeValorPadraoAtributoMarcado() {
		assertFalse(campo.isMarcado());
	}
	
	@Test
	void testeAbrirNaoMinadoNaoMarcado() {
		assertTrue(campo.abrir());
	}

	@Test
	void testeAbrirNaoMinadoMarcado() {
		campo.alternarMarcacao();
		assertFalse(campo.abrir());
	}

	@Test
	void testeAbrirMinadoMarcado() {
		campo.alternarMarcacao();
		campo.minar();
		assertFalse(campo.abrir());
	}

	@Test
	void testeAbrirMinadoNaoMarcado() {
		campo.minar();
		
		assertThrows(ExplosaoException.class, () -> { // Testar o tipo de exceção
			campo.abrir();
		});
	
	}
	
	@Test
	void testeAbrirComVizinhos1() {
		
		Campo campo11 = new Campo(1, 1);	
		Campo campo22 = new Campo(2, 2);		
		campo22.adicionarVizinho(campo11);
		
		campo.adicionarVizinho(campo22);
		campo.abrir();
		
		assertTrue(campo22.isAberto() && campo11.isAberto());
	}

	@Test
	void testeAbrirComVizinhos2() {
		
		Campo campo11 = new Campo(1, 1);	
		Campo campo12 = new Campo(1, 1);
		campo12.minar();
		
		Campo campo22 = new Campo(2, 2);		
		campo22.adicionarVizinho(campo11);
		campo22.adicionarVizinho(campo12);
		
		campo.adicionarVizinho(campo22);
		campo.abrir();
		
		assertTrue(campo22.isAberto() && campo11.isFechado());
	}
	
	@Test
	void testeGetColuna() {
		Campo c1 = new Campo(1, 4);
		
		int colunaEsperada = 4;
		int colunaRetornada = c1.getColuna();
		
		assertEquals(colunaEsperada, colunaRetornada);
	}

	@Test
	void testeGetLinha() {
		Campo c1 = new Campo(1, 4);
		
		int linhaEsperada = 1;
		int linhaRetornada = c1.getLinha();
		
		assertEquals(linhaEsperada, linhaRetornada);
	}
	
	@Test
	void testeobjetivoAlcancado() {
		Campo c1 = new Campo(2, 4);
		c1.abrir();
		Campo c2 = new Campo(3, 3);
		c2.minar();
		c2.alternarMarcacao();
		
		assertTrue(c1.objetivoAlcancado() || c2.objetivoAlcancado());		
		
	}
	
	@Test
	void testeReiniciar() {
		Campo c1 = new Campo(3, 2);
		c1.abrir();
		c1.minar();
		c1.alternarMarcacao();
		
		c1.reiniciar();
		
		assertFalse(c1.isAberto());
		assertFalse(c1.isMinado());
		assertFalse(c1.isMarcado());
	}
	
	
	@Test
    void testeToStringCampoMarcado() {
    	Campo campo = new Campo(1, 1);
    	campo.alternarMarcacao();
    	
    	String retornoEsperado = "x";
    	String retorno = campo.toString();
    	
    	assertEquals(retornoEsperado, retorno);
    }
    
    @Test
    void testeToStringCampoAbertoComMina() {
        Campo campo = new Campo(2, 2);
        campo.abrir();
        campo.minar();
        
        String retornoEsperado = "*";
        String retorno = campo.toString();
        assertEquals(retornoEsperado, retorno);
    }
    
    @Test
    void testeToStringCampoAbertoComVizinhacaMinada() {
    	Campo campo = new Campo(3, 3);
    	campo.abrir();
    	campo.adicionarVizinho(new Campo(2, 3));
    	campo.getVizinhos().forEach(v -> v.minar());
    	
    	String retornoEsperado = "1";
    	String retorno = campo.toString();
    	assertEquals(retornoEsperado, retorno);
    }
    
    @Test
    void testeToStringCampoAbertoSemMinaNemVizinhacaMinada() {
    	Campo campo = new Campo(4, 4);
    	campo.abrir();
    	
    	String retornoEsperado = " ";
    	String retorno = campo.toString();
    	assertEquals(retornoEsperado, retorno);
    }
   
    @Test
    void testeToStringCampoFechado() {
        Campo campo = new Campo(5, 5);
        
        String retornoEsperado = "?";
        String retorno = campo.toString();
        assertEquals(retornoEsperado, retorno);
    }
	
}
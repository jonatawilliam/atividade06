package com.jonatawilliam.atividade06;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jonatawilliam
 */
public class MedianaTest {
    
    public MedianaTest() {
    }

    @Test
    public void testeVetorOrdenadoImpar(){
        double[] vetor = {1, 2, 3, 4, 5};
        Mediana mediana = new Mediana();
        double resposta = mediana.getMediana(vetor);
        assertEquals(3, resposta, 0.1);
    }
    
    @Test(expected = Validacao.class)
    public void testeVetorNulo(){
        Mediana mediana = new Mediana();
        assertNull(mediana.getMediana(null));
    }
    
    @Test(expected = Validacao.class)
    public void testeVetorVazio(){
        Mediana mediana = new Mediana();
        assertNull(mediana.getMediana(null));
    }
    
    @Test
    public void testeMedia(){
        double[] vetor = {1, 2, 3, 4, 5};
        Mediana media = new Mediana();
        assertEquals(3.0, media.getMedia(vetor), 0.1);
    }
    
    @Test
    public void testeMenorValor(){
        double[] vetor = {1, 2, 3, 4, 5};
        Mediana menor = new Mediana();
        assertEquals(1.0, menor.getMenorValor(vetor), 0.1);
    }
    
    @Test
    public void testeMaiorValor(){
        double[] vetor = {1, 2, 3, 4, 5};
        Mediana maior = new Mediana();
        assertEquals(5.0, maior.getMaiorValor(vetor), 0.1);
    }
    
    
    
}

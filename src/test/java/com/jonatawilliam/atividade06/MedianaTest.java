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
    
    
    
}

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
    
    @Test(expected = Validacao.class)
    public void testeVetorNulo(){
        Mediana mediana = new Mediana();
        assertNull(mediana.getVetorVazioOuNulo(null));
    }
    
    @Test(expected = Validacao.class)
    public void testeVetorVazio(){
        Mediana mediana = new Mediana();
        assertNull(mediana.getVetorVazioOuNulo(null));
    }
    
    @Test
    public void testeMedia(){
        double[] vetor = {1, 2, 3, 4, 5};
        Mediana media = new Mediana();
        assertNotNull(media.getVetorVazioOuNulo(vetor));
        assertEquals(3.0, media.getMedia(vetor), 0.1);
    }
    
    @Test
    public void testeMenorValor(){
        double[] vetor = {1, 2, 3, 4, 5};
        Mediana menor = new Mediana();
        assertNotNull(menor.getVetorVazioOuNulo(vetor));
        assertEquals(1.0, menor.getMenorValor(vetor), 0.1);
    }
    
    @Test
    public void testeMaiorValor(){
        double[] vetor = {1, 2, 3, 4, 5};
        Mediana maior = new Mediana();
        assertNotNull(maior.getVetorVazioOuNulo(vetor));
        assertEquals(5.0, maior.getMaiorValor(vetor), 0.1);
    }
    
    @Test
    public void testeValoresMenoresDaMedia(){
        double[] vetor = {1, 2, 3, 4, 5};
        Mediana menorMedia = new Mediana();
        assertNotNull(menorMedia.getVetorVazioOuNulo(vetor));
        double media = menorMedia.getMedia(vetor);
        assertEquals(2, menorMedia.getValoresMenoresDaMedia(vetor, media), 0.1);
    }
    
    @Test
    public void testeValoresMaioresDaMedia(){
        double[] vetor = {1, 2, 3, 4, 10};
        Mediana maiorMedia = new Mediana();
        assertNotNull(maiorMedia.getVetorVazioOuNulo(vetor));
        double media = maiorMedia.getMedia(vetor);
        assertEquals(1, maiorMedia.getValoresMaioresDaMedia(vetor, media), 0.1);
    }
    
    @Test
    public void testeDesvioPadrao(){
        double[] vetor = {1, 2, 3, 4, 5};
        Mediana desvioPadrao = new Mediana();
        assertNotNull(desvioPadrao.getVetorVazioOuNulo(vetor));
        double media = desvioPadrao.getMedia(vetor);
        assertEquals(1.58114, desvioPadrao.getDesvioPadrao(vetor, media), 0.1);
    }
    
    @Test
    public void testeMediana(){
        double[] vetorPar = {1, 2, 3, 4, 5, 6};
        double[] vetorImpar = {1, 2, 3, 4, 5};
        Mediana mediana = new Mediana();
        assertNotNull(mediana.getVetorVazioOuNulo(vetorPar));
        assertNotNull(mediana.getVetorVazioOuNulo(vetorImpar));
        double mediaVetorPar = mediana.getMedia(vetorPar);
        double mediaVetorImpar = mediana.getMedia(vetorImpar);
        assertEquals(3.5, mediana.getMediana(vetorPar, mediaVetorPar), 0.1);
        assertEquals(3.0, mediana.getMediana(vetorImpar, mediaVetorImpar), 0.1);
    }
    
    
    
}

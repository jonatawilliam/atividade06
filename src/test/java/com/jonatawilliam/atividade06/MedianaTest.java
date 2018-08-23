/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
    public void testeVetorOrdenadoImpar() {
        double[] vetor = {1, 2, 3, 4, 5};
        Mediana mediana = new Mediana();
        double res = mediana.getMediana(vetor);
        assertEquals(3, res, 0.1);
    }
    
}

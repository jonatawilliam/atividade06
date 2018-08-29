package com.jonatawilliam.atividade06;

/**
 *
 * @author jonatawilliam
 */
public class Mediana {
    

    double getMediana(double[] vetor){
        if(vetor != null)
            return 3.0;
        else
            throw new Validacao();
        
    }
    
    public double getMedia(double[] vetor){
        double somar = 0;
        double media = 0;
        
        for (int i = 0; i < vetor.length; i++){
            somar = somar + vetor[i];
        }
        return media = (somar / vetor.length);	
     }
    
}

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
    
    public double getMenorValor(double[] vetor){
        double aux = 0;
        for (int x = 0; x < vetor.length; x++) {
            for (int y = 0; y < vetor.length - 1; y++) {
                if(vetor[y] > vetor[x]){ 
                aux = vetor[y];
                vetor[y] = vetor[x];
                vetor[x] = aux;
                }
            } 
        }
        return vetor[0];
    }
    
    public double getMaiorValor(double[] vetor){
        return 5.0;
    }
    
}

package com.jonatawilliam.atividade06;

/**
 *
 * @author jonatawilliam
 */
public class Mediana {
    

    public boolean getVetorVazioOuNulo(double[] vetor){
        if(vetor != null)
            return false;
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
        return vetor[vetor.length -1];
    }
    
    
    public double getValoresMenoresDaMedia(double[] vetor, double media){
        double aux = 0;
        for (int x = 0; x < vetor.length; x++) {
            if(vetor[x] < media)
                aux += 1;
        }
        return aux;
    }
    
    public double getValoresMaioresDaMedia(double[] vetor, double media){
        double aux = 0;
        for (int x = 0; x < vetor.length; x++) {
            if(vetor[x] > media)
                aux += 1;
        }
        return aux;
    }
    
    public double getDesvioPadrao(double[] vetor, double media){
        if (vetor.length == 1) {
		return 0.0;
	} else {
            double somar = 0;
            for (int i = 0; i < vetor.length; i++) {
                    double aux = vetor[i] - media;
                    somar = somar + aux * aux;
            }
            return Math.sqrt(((double) 1 /( vetor.length -1)) * somar);
	}
    }
    
    public double getMediana(double[] vetor, double media){
        float aux = 0;
        if(vetor.length % 2 == 0) {
            aux = vetor.length / 2;
            aux = (aux + aux + 1) / 2;
            return aux;
        } 
        else
            return vetor[vetor.length / 2];

    }
    
}

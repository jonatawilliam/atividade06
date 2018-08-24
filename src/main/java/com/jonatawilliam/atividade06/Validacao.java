package com.jonatawilliam.atividade06;

/**
 *
 * @author jonatawilliam
 */
class Validacao extends RuntimeException {
     
    @Override
    public String getMessage() {
        return "Valor Nulo ou Vazio";
    }
}

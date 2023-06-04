package com.deveficiente.desafioformatamatriz;

public class Solucao {

    public static String formata(int[] vetor, int limiteColunas) {
        StringBuilder topo = new StringBuilder();
        StringBuilder meio = new StringBuilder();
        StringBuilder fundo = new StringBuilder();
        StringBuilder resultado = new StringBuilder();

        int tamanhoCelula = String.valueOf(vetor[0]).length();

        for(int numero : vetor){
            tamanhoCelula = Math.max(tamanhoCelula, String.valueOf(numero).length());
        }

        //codigo gerado pelo copilot
        StringBuilder caracteresParaTamanhoCelula = new StringBuilder(tamanhoCelula);
        for(int i = 0; i < tamanhoCelula; i++) {
            caracteresParaTamanhoCelula.append("-");
        }
        
                
        int contadorLimiteColunas = 0;

        for(int posicao = 0; posicao < vetor.length; posicao++) {
            topo.append("+").append(caracteresParaTamanhoCelula);

            
            meio.append("|");
            
            //lado direito foi gerado pelo copilot
            int diferenca = tamanhoCelula - String.valueOf(vetor[posicao]).length();
            for(int i = 0; i < diferenca; i++) {
                meio.append(" ");
            }

            meio.append(vetor[posicao]);
                        
            contadorLimiteColunas++;

            if(contadorLimiteColunas == limiteColunas) {
                //fecha a linha
                topo.append("+\n");
                meio.append("|\n");                
                resultado.append(topo).append(meio);

                //reseta as variaveis (gerado pelo copilot)
                topo = new StringBuilder();
                meio = new StringBuilder();                
                contadorLimiteColunas = 0;                
            }
        }
        

        //codigo parcialmente gerado pelo copilot
        //aqui fecha o topo e o meio quando a ultima linha está quebrada
        if(contadorLimiteColunas > 0) {

            //aqui completa o topo da ultima linha com o que falta
            for(int i = 0; i < limiteColunas - contadorLimiteColunas; i++) {
                topo.append("+").append(caracteresParaTamanhoCelula);
            }

            topo.append("+\n");
            meio.append("|\n");                
            resultado.append(topo).append(meio);
        }
        
        int resto = contadorLimiteColunas == 0 ? limiteColunas : contadorLimiteColunas;

        //esse codigo o copilot pensou antes de mim        
        for(int i = 0; i < resto; i++) {
            fundo.append("+").append(caracteresParaTamanhoCelula);
        }

        //fecha a última linha
        fundo.append("+");

        return resultado.append(fundo).toString();
    }
}

package com.deveficiente.desafioformatamatriz;

public class Solucao {

    public static String formata(int[] vetor, int limiteColunas) {
        StringBuilder topo = new StringBuilder();
        StringBuilder meio = new StringBuilder();
        StringBuilder fundo = new StringBuilder();
        StringBuilder resultado = new StringBuilder();
        /*
         * 1 - +-+-+
         * 2 - |4|2|
         * 3 - +-+-+
         */
        
                
        int contadorLimiteColunas = 0;

        for(int posicao = 0; posicao < vetor.length; posicao++) {
            topo.append("+-");
            meio.append("|"+vetor[posicao]);
                        
            contadorLimiteColunas++;

            if(contadorLimiteColunas == limiteColunas) {
                topo.append("+\n");
                meio.append("|\n");                
                resultado.append(topo).append(meio);

                topo = new StringBuilder();
                meio = new StringBuilder();                
                contadorLimiteColunas = 0;                
            }
        }

        int resto = vetor.length % limiteColunas;
        //esse codigo o copilot pensou antes de mim
        for(int i = 0; i < limiteColunas - resto; i++) {
            fundo.append("+-");
        }

        fundo.append("+");

        return resultado.append(fundo).toString();
    }
}

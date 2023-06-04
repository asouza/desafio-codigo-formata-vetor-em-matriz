package com.deveficiente.desafioformatamatriz;

public class Solucao {

    public static String formata(int[] vetor, int limiteColunas) {
        StringBuilder topo = new StringBuilder();
        StringBuilder meio = new StringBuilder();
        StringBuilder fundo = new StringBuilder();
        /*
         * 1 - +-+-+
         * 2 - |4|2|
         * 3 - +-+-+
         */
        
        
         
        for(int numero : vetor){
            topo.append("+-");
            meio.append("|"+numero);
            fundo.append("+-");
        }

        return """
                %s+
                %s|
                %s+
                """.formatted(topo,meio,fundo)
        ;
    }
}

package com.deveficiente.desafioformatamatriz;

public class Solucao {

    public static String formata(int[] vetor, int limiteColunas) {
        return geraUmaCelula(vetor[0]);            
    }

    private static String geraUmaCelula(int numero) {
        return String.format("""
+-+
|%s|
+-+                
""",numero);
    }
}

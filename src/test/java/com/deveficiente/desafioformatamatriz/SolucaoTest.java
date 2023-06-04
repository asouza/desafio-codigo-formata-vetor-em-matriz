package com.deveficiente.desafioformatamatriz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SolucaoTest {

    @DisplayName("Deveria formatar a matriz corretamente para o caso mais simples de apenas uma linha com um numero")
    @Test
    public void test1(){
        String resultado = Solucao
            .formata(new int[]{4},1);

        Assertions.assertEquals("""
                                +-+
                                |4|
                                +-+\
                                """,resultado);
    }

    @DisplayName("Deveria formatar a matriz corretamente para o caso de uma linha com dois numeros")
    @Test
    public void test2(){
        String resultado = Solucao
            .formata(new int[]{4,2},2);

                
        Assertions.assertEquals("""
                                +-+-+
                                |4|2|
                                +-+-+\
                                """,resultado);                                                
    }
    @DisplayName("Deveria formatar a matriz corretamente para o caso de uma linha com vários numeros")
    @Test
    public void test3(){
        String resultado = Solucao
            .formata(new int[]{4,2,3,5,6,7,8},7);

                
        Assertions.assertEquals("""
                                +-+-+-+-+-+-+-+
                                |4|2|3|5|6|7|8|
                                +-+-+-+-+-+-+-+\
                                """,resultado);                                                                                              
    }
    @DisplayName("Deveria formatar a matriz corretamente para o caso de necessidade de duas linhas")
    @Test
    public void test4(){
        String resultado = Solucao
            .formata(new int[]{4,2},1);

                
        Assertions.assertEquals("""
                                +-+
                                |4|
                                +-+
                                |2|
                                +-+\
                                """,resultado);                                                                                              
    }

    @DisplayName("Deveria formatar a matriz corretamente para o caso de necessidade de n linhas exatamente iguais")
    @Test
    public void test5(){
        String resultado = Solucao
            .formata(new int[]{4,2,3,5},2);

                
        Assertions.assertEquals("""
                                +-+-+
                                |4|2|
                                +-+-+
                                |3|5|
                                +-+-+\
                                """,resultado);                                                                                              
    }    

    @DisplayName("Deveria formatar a matriz corretamente para o caso de necessidade de n linhas sobrando na última")
    @Test
    public void test6(){
        String resultado = Solucao
            .formata(new int[]{4,2,3,5,7},2);

                
        Assertions.assertEquals("""
                                +-+-+
                                |4|2|
                                +-+-+
                                |3|5|
                                +-+-+
                                |7|
                                +-+\
                                """,resultado);                                                                                                                          
    }        
    @DisplayName("Deveria formatar a matriz corretamente para o caso de necessidade de n linhas com y elementos sobrando na última")
    @Test
    public void test7(){
        String resultado = Solucao
            .formata(new int[]{4,2,3,5,7},3);

                
        Assertions.assertEquals("""
                                +-+-+-+
                                |4|2|3|
                                +-+-+-+
                                |5|7|
                                +-+-+\
                                """,resultado);                                                                                                                          
    }        

    @DisplayName("Deveria formatar a matriz corretamente para o caso de necessidade de n linhas com y elementos sobrando na última e com numero de tamanhos diferentes")
    @Test
    public void test8(){
        String resultado = Solucao
            .formata(new int[]{40,2,3,5,7},3);

                
        Assertions.assertEquals("""
                                +--+--+--+   
                                |40| 2| 3|
                                +--+--+--+
                                | 5| 7|
                                +--+--+\
                                """,resultado);                                                                                                                          
    }            

    @DisplayName("Deveria formatar a matriz corretamente para o caso de necessidade de n linhas com y elementos sobrando na última e com numero de tamanhos diferentes no cenario que eu considero mais complicado")
    @Test
    public void test9(){
        String resultado = Solucao
            .formata(new int[]{4567,250,30,5,70},3);

                
        Assertions.assertEquals("""
                                +----+----+----+   
                                |4567| 250|  30|
                                +----+----+----+
                                |   5|  70|
                                +----+----+\
                                """,resultado);                                                                                                                          
    }                

    

}

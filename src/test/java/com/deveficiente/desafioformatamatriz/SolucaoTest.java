package com.deveficiente.desafioformatamatriz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SolucaoTest {

    @DisplayName("Deveria formatar a matriz corretamente para o caso mais simples de apenas uma linha com um numero")
    @Test
    public void test(){
        String resultado = Solucao
            .formata(new int[]{4},1);
            
        Assertions.assertEquals(            """
            +-+
            |1|
            +-+                
        """,resultado);
    }
}

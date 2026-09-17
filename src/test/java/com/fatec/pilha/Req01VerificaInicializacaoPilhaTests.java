package com.fatec.pilha;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import com.fatec.pilha.servico.Pilha;

public class Req01VerificaInicializacaoPilhaTests {
    @Test
    void ct01_inicializacao_da_pilha() {
        Pilha pilha = new Pilha();
        assertTrue(pilha.estaVazia(), "A pilha recém-criada deve estar vazia");
        assertEquals(0, pilha.tamanho(), "O tamanho inicial da pilha deve ser 0");
    }

}

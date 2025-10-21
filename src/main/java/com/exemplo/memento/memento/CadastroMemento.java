package com.exemplo.memento.memento;

import com.exemplo.memento.model.Cadastro;
/**
 * Classe Memento
 * ----------------------------
 * Armazena o "estado" (snapshot) de um objeto Cadastro.
 * O objetivo é capturar o estado atual do objeto sem violar seu encapsulamento.
 *
 * Essa classe é imutável — uma vez criado o Memento, ele não deve ser alterado.
 */
public class CadastroMemento {
    private final Cadastro estado;
    /**
     * Construtor recebe o estado atual do Cadastro e cria uma cópia.
     * Assim, futuras alterações em "estado" original não afetam o Memento.
     */
    public CadastroMemento(Cadastro estado) {
        this.estado = new Cadastro(estado.getNome(), estado.getEmail());
    }
    /**
     * Retorna o estado salvo (snapshot) do cadastro.
     */
    public Cadastro getEstadoSalvo() {
        return estado;
    }
}

package com.exemplo.memento.memento;

import com.exemplo.memento.model.Cadastro;
/**
 * Classe Originator
 * ----------------------------
 * O Originator é o objeto que possui o estado que queremos salvar e restaurar.
 * Ele pode:
 *  - Criar um Memento contendo seu estado atual.
 *  - Restaurar seu estado anterior a partir de um Memento.
 */
public class CadastroOriginator {
    private Cadastro estadoAtual;
    /**
     * Define (atualiza) o estado atual do Originator.
     */
    public void setEstado(Cadastro estado) {
        this.estadoAtual = estado;
    }
    /**
     * Retorna o estado atual.
     */
    public Cadastro getEstado() {
        return estadoAtual;
    }
    /**
     * Cria um novo Memento com o estado atual do cadastro.
     * Esse método é chamado quando queremos salvar o estado.
     */
    public CadastroMemento salvarParaMemento() {
        return new CadastroMemento(estadoAtual);
    }
    /**
     * Restaura o estado do cadastro a partir de um Memento anterior.
     * Esse método é chamado quando queremos "desfazer" a última mudança.
     */
    public void restaurarDeMemento(CadastroMemento memento) {
        this.estadoAtual = memento.getEstadoSalvo();
    }
}

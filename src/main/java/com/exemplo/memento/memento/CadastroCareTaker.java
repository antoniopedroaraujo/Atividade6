package com.exemplo.memento.memento;

import java.util.Stack;
/**
 * Classe CareTaker
 * ----------------------------
 * O CareTaker é responsável por armazenar os Mementos.
 * Ele age como um "histórico" dos estados anteriores do Originator.
 *
 * Neste caso, usamos uma pilha (Stack) para facilitar o "desfazer" (último estado salvo).
 */
public class CadastroCareTaker {
    private final Stack<CadastroMemento> historico = new Stack<>();
    /**
     * Salva um novo Memento no histórico.
     * Esse método é chamado sempre que o usuário envia um novo cadastro.
     */
    public void salvarMemento(CadastroMemento memento) {
        historico.push(memento);
    }
    /**
     * Retorna o último Memento salvo (ou null se não houver histórico).
     * Esse método é chamado quando o usuário clica em "Restaurar".
     */
    public CadastroMemento getUltimoMemento() {
        if (!historico.isEmpty()) {
            return historico.pop();
        }
        return null;
    }
}


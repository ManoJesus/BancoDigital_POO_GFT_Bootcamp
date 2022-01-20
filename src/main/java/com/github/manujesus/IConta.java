package com.github.manujesus;

public interface IConta {
    void sacar(double valor);
    void depositar(double valor);
    void transferir(double valor, IConta destinatario);

    void imprimirExtrato();

}

package com.github.manujesus;

public class Main {
    public static void main(String[] args) {
        Cliente aldagusto = new Cliente();
        aldagusto.setName("Aldagusto");

        Conta cc = new ContaCorrente(aldagusto);
        Conta poupanca = new ContaPoupanca(aldagusto);
        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

        cc.depositar(100);
        cc.imprimirExtrato();
        cc.transferir(50, poupanca);

        poupanca.imprimirExtrato();
        cc.imprimirExtrato();
    }
}

package com.github.manujesus;

public class ContaPoupanca extends Conta{
    public ContaPoupanca(Cliente titular) {
        super(titular);
    }
    @Override
    public void imprimirExtrato() {
        System.out.println("-----------Extrato conta poupanca -----------");
        super.imprimirInformacoesBasicas();
    }
}

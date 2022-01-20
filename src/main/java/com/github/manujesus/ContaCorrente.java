package com.github.manujesus;

public class ContaCorrente extends Conta{
    public ContaCorrente(Cliente titular) {
        super(titular);
    }
    @Override
    public void imprimirExtrato() {
        System.out.println("-----------Extrato conta corrente -----------");
        super.imprimirInformacoesBasicas();
    }
}

package com.github.manujesus;

public abstract class Conta implements IConta{
    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL_NUMERO_CONTA = 1;

    private int agencia;
    private int numeroConta;
    private Double saldo;

    protected Cliente titular;

    public Conta(Cliente titular){
        this.agencia = AGENCIA_PADRAO;
        this.numeroConta = SEQUENCIAL_NUMERO_CONTA++;
        this.saldo = 0d;
        this.titular = titular;
    }

    @Override
    public void sacar(double valor) {
        saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public void transferir(double valor, IConta destinatario) {
        saldo -= valor;
        destinatario.depositar(valor);
    }

    public void imprimirInformacoesBasicas(){
        System.out.printf("Titular: %s \n" +
                         "Agencia: %d \n" +
                         "Conta: %d \n" +
                         "Saldo: %.2f \n", titular.getName(), agencia, numeroConta,saldo);
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }
}

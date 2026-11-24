package org.example;

public class Proposta implements Cloneable {
    private int numero;
    private String nomeCliente;
    private Endereco endereco;
    private String plano;

    public Proposta(int numero, String nomeCliente, Endereco endereco, String plano) {
        this.numero = numero;
        this.nomeCliente = nomeCliente;
        this.endereco = endereco;
        this.plano = plano;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getPlano() {
        return plano;
    }

    public void setPlano(String plano) {
        this.plano = plano;
    }

    @Override
    public Proposta clone() throws CloneNotSupportedException {
        Proposta propostaClone = (Proposta) super.clone();
        propostaClone.endereco = (Endereco) propostaClone.endereco.clone();
        return propostaClone;
    }

    @Override
    public String toString() {
        return "Proposta{" +
                "numero=" + numero +
                ", nomeCliente='" + nomeCliente + '\'' +
                ", endereco=" + endereco +
                ", plano='" + plano + '\'' +
                '}';
    }
}
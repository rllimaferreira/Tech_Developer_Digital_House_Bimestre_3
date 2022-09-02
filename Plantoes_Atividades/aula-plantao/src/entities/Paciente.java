package entities;

import java.util.Date;

public class Paciente extends Usuario {

    private int cpf;
    private String nome;
    private int celular;
    private String dataNasc;

    public Paciente() {
    }

    public Paciente(int cpf, String nome, int celular, String dataNasc) {
        this.cpf = cpf;
        this.nome = nome;
        this.celular = celular;
        this.dataNasc = dataNasc;
    }

    public void dadosPaciente() {
        System.out.println("Dados do Paciente " + this.nome + "\n");
    }

    @Override
    public String toString() {
        return "Paciente{" +
                "cpf=" + cpf +
                ", nome='" + nome + '\'' +
                ", celular=" + celular +
                ", dataNasc='" + dataNasc + '\'' +
                '}';
    }
}

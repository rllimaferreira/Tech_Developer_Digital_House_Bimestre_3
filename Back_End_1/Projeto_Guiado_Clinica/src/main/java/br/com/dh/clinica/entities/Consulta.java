package br.com.dh.clinica.entities;

import java.time.LocalDate;

public class Consulta {

    private Integer id;
    private LocalDate datacadastro;
    private LocalDate dataatendimento;
    private String paciente;
    private String dentista;
    private String usuario;

    public Consulta() {
    }

    public Consulta(Integer id, LocalDate datacadastro, LocalDate dataatendimento, String paciente, String dentista, String usuario) {
        this.id = id;
        this.datacadastro = datacadastro;
        this.dataatendimento = dataatendimento;
        this.paciente = paciente;
        this.dentista = dentista;
        this.usuario = usuario;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDate getDatacadastro() {
        return datacadastro;
    }

    public void setDatacadastro(LocalDate datacadastro) {
        this.datacadastro = datacadastro;
    }

    public LocalDate getDataatendimento() {
        return dataatendimento;
    }

    public void setDataatendimento(LocalDate dataatendimento) {
        this.dataatendimento = dataatendimento;
    }

    public String getPaciente() {
        return paciente;
    }

    public void setPaciente(String paciente) {
        this.paciente = paciente;
    }

    public String getDentista() {
        return dentista;
    }

    public void setDentista(String dentista) {
        this.dentista = dentista;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
}

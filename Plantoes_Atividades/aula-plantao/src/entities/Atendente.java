package entities;

public class Atendente {

    private int matriculaAtendente;
    private String nome;
    private int telefone;
    private String historicoAtendimento;
    private boolean statusConsulta;
    private String especialidade;
    private String dataConsulta;
    private String nomeMedico;
    private boolean statusExame;
    private String tipoExame;

    public Atendente() {
    }

    public Atendente(int matriculaAtendente, String nome, int telefone, String historicoAtendimento, boolean statusConsulta, String especialidade, String dataConsulta, String nomeMedico, boolean statusExame, String tipoExame) {
        this.matriculaAtendente = matriculaAtendente;
        this.nome = nome;
        this.telefone = telefone;
        this.historicoAtendimento = historicoAtendimento;
        this.statusConsulta = statusConsulta;
        this.especialidade = especialidade;
        this.dataConsulta = dataConsulta;
        this.nomeMedico = nomeMedico;
        this.statusExame = statusExame;
        this.tipoExame = tipoExame;
    }

    

}

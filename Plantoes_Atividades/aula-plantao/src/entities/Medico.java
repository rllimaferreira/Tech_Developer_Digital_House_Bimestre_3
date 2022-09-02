package entities;

// Classe construtora vazia abaixo
public class Medico extends Usuario {

    private int crm;
    private String nome;
    private String especialidade;

    // Construtor 1: é utilizado vazio porque é usado para teste
    public Medico() {
    }

    // Construtor 2:
    public Medico(int crm, String nome, String especialidade) {
        this.crm = crm;
        this.nome = nome;
        this.especialidade = especialidade;
    }

    // O static é utilizado para criar um método sem precisar instanciar o objeto
    public void criarGuiaExame() {
        System.out.println("Guia de exame criado com sucesso!");
        System.out.printf("\nDados da especialidade do(a) Medico " + this.especialidade + "\n");
    }
    // OBS: pesquisar como o Java coloca informação de um atributo da classe dentro do System.out

    // Método Overwirght é para sobrescrever a classe do pai
    @Override
    public String toString() {
        return "Medico{" +
                "crm=" + crm +
                ", nome='" + nome + '\'' +
                ", especialidade='" + especialidade + '\'' +
                '}';
    }
}

package entities;

public class Hotel {

    private Integer id;
    private String nomeDaFilial;
    private String rua;
    private Integer numero;
    private String cidade;
    private String estado;
    private Integer estrelas;

    public Hotel() {
    }

    public Hotel(Integer id, String nomeDaFilial, String rua, Integer numero, String cidade, String estado, Integer estrelas) {
        this.id = id;
        this.nomeDaFilial = nomeDaFilial;
        this.rua = rua;
        this.numero = numero;
        this.cidade = cidade;
        this.estado = estado;
        this.estrelas = estrelas;
    }

    public Hotel(String nomeDaFilial, String rua, Integer numero, String cidade, String estado, Integer estrelas) {
        this.nomeDaFilial = nomeDaFilial;
        this.rua = rua;
        this.numero = numero;
        this.cidade = cidade;
        this.estado = estado;
        this.estrelas = estrelas;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNomeDaFilial() {
        return nomeDaFilial;
    }

    public void setNomeDaFilial(String nomeDaFilial) {
        this.nomeDaFilial = nomeDaFilial;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Integer getEstrelas() {
        return estrelas;
    }

    public void setEstrelas(Integer estrelas) {
        this.estrelas = estrelas;
    }

    @Override
    public String toString() {
        return "Hotel { " +
                "id = " + id +
                ", nomeDaFilial = '" + nomeDaFilial + '\'' +
                ", rua = '" + rua + '\'' +
                ", numero = " + numero +
                ", cidade = '" + cidade + '\'' +
                ", estado = '" + estado + '\'' +
                ", estrelas = " + estrelas +
                '}';
    }
}
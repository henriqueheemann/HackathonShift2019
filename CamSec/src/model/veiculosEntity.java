package model;

public class veiculosEntity {

    private int id;
    private String placa;
    private String situacao;

    public veiculosEntity(int id, String placa, String situacao) {
        this.id = id;
        this.placa = placa;
        this.situacao = situacao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

}

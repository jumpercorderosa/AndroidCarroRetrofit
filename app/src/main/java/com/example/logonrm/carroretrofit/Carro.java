package com.example.logonrm.carroretrofit;

import com.google.gson.annotations.SerializedName;

public class Carro {

    //serializando o json
    @SerializedName("marca")
    private String marca;
    private String modelo;
    private String cor;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
}

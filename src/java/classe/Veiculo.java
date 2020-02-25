/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classe;

import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author alunocmc
 */
@XmlRootElement
public class Veiculo {
    private String placa;
    private int  ano;
    private String marca;
    private String modelo;
    private long kilometragem;

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

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

    public long getKilometragem() {
        return kilometragem;
    }

    public void setKilometragem(long kilometragem) {
        this.kilometragem = kilometragem;
    }

    public Veiculo() {
    }

    public Veiculo(String placa, int ano, String marca, String modelo, long kilometragem) {
        this.placa = placa;
        this.ano = ano;
        this.marca = marca;
        this.modelo = modelo;
        this.kilometragem = kilometragem;
    }
    
    
}

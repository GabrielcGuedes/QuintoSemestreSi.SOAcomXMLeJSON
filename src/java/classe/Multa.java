/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classe;

import java.util.Date;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author alunocmc
 */
@XmlRootElement
public class Multa {
  private Date data;
  private double valor;
  private int pontos;
  private Veiculo veiculo;

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getPontos() {
        return pontos;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public Multa() {
    }

    public Multa(Date data, double valor, int pontos) {
        this.data = data;
        this.valor = valor;
        this.pontos = pontos;
    }

    public Multa(Date data, double valor, int pontos, Veiculo veiculo) {
        this.data = data;
        this.valor = valor;
        this.pontos = pontos;
        this.veiculo = veiculo;
    }
  
  
}

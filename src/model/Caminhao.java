/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author evert
 */
public class Caminhao extends Veiculo {

    private double tara;
    private double lotacao;
    private double Alt_Max;
    private double comprimento;
    
    
    public Caminhao(double preco) {
        super(preco);
    }
    
    public void setTara(double tara){
        this.tara=tara;
    }
    
    public void setLotacao(double lot){
        this.lotacao=lot;
    }
    public void setAlt_Max(double alt){
        this.Alt_Max=alt;
    }
    public void setComprimento(double compr){
        this.comprimento=compr;
    }
    
    public double getTara(){
        return tara;
    }
    public double getLotacao(){
        return lotacao;
    }
    public double getAltura_Max(){
        return Alt_Max;
    }
    public double getComprimento(){
        return comprimento;
    }
    
    public double getPesoMaximo(){
        return (tara+lotacao);
    }
    public boolean testaAltura(double altura){
        boolean teste=false;
        if(altura<=Alt_Max){
            teste=true;
        }
        return teste;
    }
}
/*
4) Crie a classe Caminhao, derivada da classe Veiculo. Inclua os atributos tara, lotação, altura máxima e
comprimento. Crie getters e setters e o toString da classe. Crie também os métodos:
a. getPesoMaximo(): double; retorna o peso máximo do caminhão (tara + lotação);
b. testaAltura(double altura): boolean: retorna True se o caminhão tem altura máxima menor ou
igual a altura informada;
5) Crie um programa de teste para sua aplicação.*/
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
public class Automovel extends Veiculo {

    private String marca;
    private String modelo;
    private Motor motor;
    private String cor;
    private int ano;
    
    
    public Automovel(double preco) {
        super(preco);
        cor="branca";
        ano=2019;
    }

    public Automovel(double preco, String marca, String modelo){
        super(preco);
        this.marca=marca;
        this.modelo=modelo;
        cor="branca";
        ano=2019;
        
    }
    public Automovel(double preco,String marca, String modelo, String cor){
        super(preco);
        this.marca=marca;
        this.modelo=modelo;
        this.cor=cor;
        ano=2019;
    }
    public Automovel(double preco, String marca, String modelo, String cor, int ano){
        super(preco);
        this.marca=marca;
        this.modelo=modelo;
        this.cor=cor;
        this.ano=ano;
    }
    
    public void setMarca(String marca){
        this.marca=marca;
    }
    public void setModelo(String model){
        modelo=model;
    }
    
    public void setMotor(Motor mot){
        motor=mot;
    }
    
    public void setCor(String cor){
        this.cor=cor;
    }
    public void setAno(int ano){
        this.ano=ano;
    }
    
    public String getMarca(){
        return marca;
    }
    public String getModelo(){
        return modelo;
    }
    public Motor getMotor(){
        return motor;
    }
    public String getCor(){
        return cor;
    }
    public int getAno(){
        return ano;
    }
    
}
/*
3) Crie a classe Automovel, derivada da classe Veiculo. Inclua os atributos marca, modelo, Motor, cor e ano.
Crie construtores para esta classe que exijam os campos:
a. marca e modelo;
b. marca, modelo e cor;
c. marca, modelo, cor e ano.
d. Caso não sejam informados, adote que a cor é Branca e o ano é 2019.*/

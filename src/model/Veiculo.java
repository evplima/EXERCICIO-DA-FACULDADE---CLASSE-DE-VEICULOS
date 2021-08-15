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
public class Veiculo {
    
    private double peso;
    private double vel_max;
    private double preco;
    
    public Veiculo(double preco){
        this.preco=preco;
    }
    
    public void setPeso(double peso){
        this.peso=peso;
    }
    public void setVel_Max(double vel){
        vel_max=vel;
    }
    
    public String getPeso(){
        return String.valueOf(peso);
    }
    
    public String getVel_Max(){
        return String.valueOf(vel_max);
    }
    public String getPreco(){
        return String.valueOf(preco);
    }
}
/*
1) Crie a classe Veiculo, contendo o peso, a velocidade máxima, e o preço. Inclua um construtor que exija o
campo preço. Crie getters e setters e o toString da classe.*/
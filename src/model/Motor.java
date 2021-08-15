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
public class Motor {
    
    private String nm_motor;
    private double potencia;
    private String tipo_comb;
    
    public Motor(){
        
    }
    public Motor(String nm, double poten, String tipo_combus){
        this.nm_motor=nm;
        this.potencia=poten;
        this.tipo_comb=tipo_combus;
    }
    
     public void setNm_Motor(String nm){
        this.nm_motor=nm;
    }
    public void setPotencia(double pot){
        this.potencia=pot;
    }
    public void setCombus(String comb){
        this.tipo_comb=comb;
    }
    
    public String getNm_Motor(){
        return String.valueOf(nm_motor);
    }
    
    public String getPotenc(){
        return String.valueOf(potencia);
    }
    public String getTipo_Comb(){
        return String.valueOf(tipo_comb);
    }
    
    
    
}
/*
2) Crie a classe Motor, contendo o nome, a potência e o tipo de combustível utilizado. Inclua um construtor
sem argumentos e um com argumentos para inicialização dos atributos. Crie getters e setters e o toString
da classe.*/


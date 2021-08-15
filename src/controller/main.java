/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import model.Automovel;
import model.Veiculo;
import model.Caminhao;
import model.Motor;
/**
 *
 * @author evert
 */
public class main {
    public static void main(String[] args){
        Automovel hb20 = new Automovel(20000);
        
        System.out.println(hb20.getCor());
    }
}

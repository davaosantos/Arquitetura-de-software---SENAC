/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factory;

/**
 *
 * @author david.aosantos1
 */
public class Gol implements Carro{
    
    private String modelo;
    private double preco;
    
    

    @Override
    public String getModelo() {
      return modelo;
    }

    @Override
    public double getPreco() {
        return preco;
    }

    public Gol(String modelo, double preco) {
        this.modelo = modelo;
        this.preco = preco;
    }
    
    
    
}

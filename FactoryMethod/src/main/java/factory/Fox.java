/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factory;

/**
 *
 * @author david.aosantos1
 */

// CONCRETE PRODUCT
// Fox implementa o product , conforme o diagrama
public class Fox implements Carro{
    
    //Pois tem varias versoes de fox
    private String modelo;
    private double preco;
    
    
    public Fox(){
    
    }

    public Fox(String modelo, double preco) {
        this.modelo = modelo;
        this.preco = preco;
    }
    
    @Override
    public String getModelo() {
       return modelo;
    }

    @Override
    public double getPreco() {
        return preco;
    }
    
}

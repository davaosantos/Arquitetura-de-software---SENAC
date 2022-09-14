/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factory;

/**
 *
 * @author david.aosantos1
 */

//CONCRETE PRODUCT
public class Jetta implements Carro{
    private String modelo;
    private double preco;
    
    
    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }
    
    /**
     * @return the preco  CONSTRUTOR VAZIO
     */
    public double getPreco() {
        return preco;
    }
    
    //CONSTRUTOR COM PARAMETROS
    public Jetta(String modelo, double preco) {
        this.modelo = modelo;
        this.preco = preco;
    }
    
    
    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    

    /**
     * @param preco the preco to set
     */
    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    
}

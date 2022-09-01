/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cesta;

/**
 *
 * @author david.aosantos1
 */
public class Leaf implements Component{
    private double preco;
    private String nome;
    
    public Leaf(){
    
    }
    
    public Leaf(String nome, double preco){
        this.preco = preco;
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Leaf{" + "preco=" + preco + ", nome=" + nome + '}';
    }

    

    @Override
    public double getPreco() {
       return preco;
    }
    
    
    
}

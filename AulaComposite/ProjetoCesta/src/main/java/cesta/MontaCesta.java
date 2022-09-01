/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cesta;

/**
 *
 * @author david.aosantos1
 */
public class MontaCesta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Composite cesta = new Composite("Cesta de cafe");
        
        //Pois a interface component esta implementada em leaf
        Component produto1 = new Leaf("Pao", 4.5);
        Component produto2 = new Leaf("Café", 2.3);       
        Component produto3 = new Leaf("Leite", 12.3);        
        Component produto4 = new Leaf("Fatias de presunto", 6.7);        
        Component produto5 = new Leaf("Fatias de queijo", 9.88);
                
        // Adicionando os objetos 
        cesta.adicionar(produto1);
        cesta.adicionar(produto2);
        cesta.adicionar(produto3);
        
        
        //Pois sera uma caixa com 2 produtos , queijo e presunto
        Composite caixa = new Composite("Frios");
        
        caixa.adicionar(produto4);
        caixa.adicionar(produto5);
        
        
        //Para colocar a caixa na cesta
        cesta.adicionar(caixa);
        
        //Exibir o preço
        System.out.println(cesta.getPreco());
        
        //Exibir a cesta , com o toString
        System.out.println(cesta);
    }
    
}

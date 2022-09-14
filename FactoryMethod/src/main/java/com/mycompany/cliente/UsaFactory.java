/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.cliente;

//Importa todas as classes do pacote
import factory.*;

/**
 *
 * @author david.aosantos1
 */
public class UsaFactory {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        try{
            
            int n = 5;
            //Metodo VALUES retorna um array de enum
            Carro carro = Fabrica.factoryMethod(ListaCarros.values()[n]);
            System.out.println("Modelo: " + carro.getModelo());
            System.out.println("Preço: " + carro.getPreco());
        
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Carro invalido - ERROR" + e.getMessage());
        }
        
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.exemplosingleton;

/**
 *
 * @author david.aosantos1
 */

//Thread , para executar as duas instancias em concorrencia, quase simultaneo, classe que oferece multitarefa
public class UsaSingleton extends Thread {

    @Override
    public void run() {
        super.run(); // Run ira excutar os processamentos de baixo , de forma paralela
        Singleton sin = Singleton.getInstance();
        System.out.println(sin);
       
    }
    
    public static void main(String[] args) {
        // nao permite acessar , pois esta como o tipo privativo
        //Singleton sin = new Singleton();
        
        //Singleton sin = Singleton.getInstance(); // ou seja , só executa uma instancia
        //Singleton sin2 = Singleton.getInstance();
        
         //System.out.println(sin); // imprime o endereco de memoria
         
        /* System.out.println(sin2); // imprime um endereco diferente do endereco de cima, portanto mantem a regra */
        
        // uma instancia executa varios serviços , por vezes desnecessario, desvantagem > ocupa memoria desnecessaria
        // no momento
        
        // lazySingleton > Carrega somente quando solicitado
        
        UsaSingleton t1 = new UsaSingleton();
        UsaSingleton t2 = new UsaSingleton();
        
        t1.start();
        t2.start(); // estado pronto para executar
        
       
    }
    
}

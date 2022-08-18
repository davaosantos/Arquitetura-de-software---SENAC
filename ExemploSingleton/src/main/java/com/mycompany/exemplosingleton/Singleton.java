/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exemplosingleton;

/**
 *
 * @author david.aosantos1
 */
public class Singleton {
    
    // variavel de referencia do tipo singleton
   /* private static Singleton singleton = new Singleton(); // É gerado a instancia, ja na classe */
    
    
    //Lazy singleton
    private static Singleton singleton; // não instancia , ou seja , nao ocupa tanta memoria
    
    // nao pode instanciar
    private Singleton(){}
    
    
    //retorna um tipo singleton , e é publico
    /* public Singleton getInstance(){ //A principio só é acessado atraves de uma instancia , por isso usa o static
        return singleton;
    } */
    
    
    //Versao Singleton
 /*   public static Singleton getInstance(){ //A principio só é acessado atraves de uma instancia , por isso usa o static
        return singleton;
    } */
    
    
    
    // Versao lazySingleton
    public static Singleton getInstance(){ //A principio só é acessado atraves de uma instancia , por isso usa o static
        if(singleton == null){
            singleton = new Singleton();
        }
        return singleton;
    }
    
}

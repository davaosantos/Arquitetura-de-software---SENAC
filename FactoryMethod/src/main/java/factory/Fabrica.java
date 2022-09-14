/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factory;

/**
 *
 * @author david.aosantos1
 */

//CONCRETE CREATOR
public class Fabrica {
    
    //Tipo do carro que irá receber , como parametro
    //Parametro do tipo listaCarro
    public static Carro factoryMethod(ListaCarros carro){
        Carro car = null;
        
        if(carro.equals(ListaCarros.FOX)){
            car = new Fox("CrossFox", 45000);
        }else if (carro.equals(ListaCarros.JETTA)){
            car = new Jetta("JETTA TSI", 12000);
        }else if (carro.equals(ListaCarros.GOL)){
            car = new Gol("Gol 98", 5000);
        }
        
        return car;
    }
}

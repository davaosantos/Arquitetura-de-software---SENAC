/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pattern;

/**
 *
 * @author david.aosantos1
 */

//Padrao STATE

// Teremos metodos que fazem a transição de estado
public interface State {
    
    //Refere-se a tarefa > Fazem a transição de estado do objeto
    public void atrasada();
    public void concluida();
    public void pendente();
}

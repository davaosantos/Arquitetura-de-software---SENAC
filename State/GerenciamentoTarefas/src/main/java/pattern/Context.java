/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pattern;

/**
 *
 * @author david.aosantos1
 */


// Atravez do state , ela que vai invocar os metodos de transição do estado do objeto
// Devido a isso tera o metodo request
// Ninguem pode estender a classe
public final class Context {
    // Agregação com o state 
    private State estado; 

    public Context() {
        estado = new Pendente(this); // this representa o objeto
    }
    
    
    /**
     * @return the estado
     */
    public State getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(State estado) {
        this.estado = estado;
    }
    
    public void requisitarAtrasada(){
        estado.atrasada();
    }
    
    public void requisitarConcluida(){
        
        // Estado é do tipo state , portanto tem os metodos de state
        estado.concluida();
    
    }
    
    public void requisitarPendencia(){
        estado.pendente();
    }
    
}

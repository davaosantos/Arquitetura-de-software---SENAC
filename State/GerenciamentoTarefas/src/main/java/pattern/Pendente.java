/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pattern;

/**
 *
 * @author david.aosantos1
 */
public class Pendente implements State {
    
    private final String nome = "Pendente";
    private Context tarefa; // Irá mudar de estado, objeto que ira transitar de estado

    public Pendente(Context tarefa) {
        this.tarefa = tarefa;
    }
    
    @Override
    public void atrasada() {
        
      // Atrasada a = new Atrasada(); Isso que é feito , passado um objeto Atrasada
      
       tarefa.setEstado(new Atrasada(tarefa));
    }

    @Override
    public void concluida() {
       tarefa.setEstado(new Concluida(tarefa));
    }

    @Override
    public void pendente() {
       System.out.println("Já esta pendente");
    }

    @Override
    public String toString() {
        return "Novo estado: " + nome;
    }
    
    
}

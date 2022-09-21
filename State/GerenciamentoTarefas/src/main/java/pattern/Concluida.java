/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pattern;

/**
 *
 * @author david.aosantos1
 */
public class Concluida implements State{
    
    private final String nome = "Concluida";
    private Context tarefa; // Irá mudar de estado, objeto que ira transitar de estado


    Concluida(Context tarefa) {
        this.tarefa = tarefa;
    }

    @Override
    public void atrasada() {
        tarefa.setEstado(new Atrasada(tarefa));
    }

    @Override
    public void concluida() {
        System.out.println("Já esta concluida");
    }

    @Override
    public void pendente() {
       tarefa.setEstado(new Pendente(tarefa));
    }

    @Override
    public String toString() {
        return "Novo estado: " + nome;
    }
    
    
}

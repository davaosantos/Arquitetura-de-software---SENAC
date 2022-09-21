/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pattern;

/**
 *
 * @author david.aosantos1
 */
public class Atrasada implements State{
    
    private final String nome = "Atrasada";
    private Context tarefa; // Irá mudar de estado, objeto que ira transitar de estado


    Atrasada(Context tarefa) {
        this.tarefa = tarefa;
    }

    @Override
    public void atrasada() {
        System.out.println("Ja esta atrasada");
    }

    @Override
    public void concluida() {
        tarefa.setEstado(new Concluida(tarefa));
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

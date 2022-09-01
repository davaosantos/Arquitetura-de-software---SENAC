/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cesta;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author david.aosantos1
 */
public class Composite implements Component {
    private List<Component> lista = new ArrayList<>();
    private String nome;

    
    
    public void adicionar(Component component){
        this.getLista().add(component);
    }
    
    public void remover(Component component){
        this.getLista().remove(component);
    }

    /**
     * @return the lista
     */
    public List<Component> getLista() {
        return lista;
    }

    /**
     * @param lista the lista to set
     */
    public void setLista(List<Component> lista) {
        this.lista = lista;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    @Override
    public double getPreco() {
        double total = 0;
        for (Component c : lista) {
            total += c.getPreco();
        }
       return total;
    }

    @Override
    public String toString() {
        return "Composite{" + "lista=" + lista + ", nome=" + nome + '}';
    }

    
    
    public Composite(String nome){
        this.nome = nome;
    };
}

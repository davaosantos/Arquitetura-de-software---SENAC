/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.gerenciamentotarefas;

import pattern.Context;

/**
 *
 * @author david.aosantos1
 */
public class UsaGerenciamentoTarefas {

    /**
     * @param args the command line arguments
     */
    
    //Classe cliente
    public static void main(String[] args) {
        Context tarefa = new Context();
        System.out.println(tarefa.getEstado());
        tarefa.requisitarAtrasada();
        tarefa.requisitarConcluida();
        tarefa.requisitarPendencia();
    }
    
}

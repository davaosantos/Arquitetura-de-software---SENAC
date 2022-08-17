/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aulasas;

/**
 *
 * @author david.aosantos1
 */
public class Tanque implements Posicao, Cor, Canhao {
    
    private float x,y;
    private CoresRGB corTanque, corCanhao;

    @Override
    public void setCorTanque(CoresRGB corTanque) {
       
    }

    @Override
    public void setCorCanhao(CoresRGB corCanhao) {
        
    }

    public float getX() {
        return x;
    }

    public CoresRGB getCorCanhao() {
        return corCanhao;
    }

    /**
     * @param x the x to set
     */
    public void setX(float x) {
        this.x = x;
    }

    /**
     * @return the y
     */
    public float getY() {
        return y;
    }

    /**
     * @param y the y to set
     */
    public void setY(float y) {
        this.y = y;
    }

    /**
     * @return the corTanque
     */
    public CoresRGB getCorTanque() {
        return corTanque;
    }

    @Override
    public void atirar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
    
    
    
}

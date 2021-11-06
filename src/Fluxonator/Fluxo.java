/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fluxonator;

/**
 *
 * @author paulo
 */
public class Fluxo {
    private int L1,L2,L3;
   
    private int C, D, E;
    
    //VALORES DE L1, L2, L3== 1 (ALAVANCA VIRADA PRA ESQUERDA) 
    //VALORS ==2 (ALAVANCA PRA DIREITA)
    
 
   
    public void A(int atomo){
    if(atomo==1 && L1==1){
    L1=2;
    System.out.println("Entrada A Saida D");
    }
    else if(atomo==1 && L1==2 && L2==1){
    L1=1;
    L2=2;
    System.out.println("Entrada A Saida D");
    }
    else if(atomo==1 && L1==2 && L2==2){
    L1=1;
    L2=2;
    System.out.println("Entrada A Saida E");
    }
    }
    
    
    public void B(int atomo){
    if(atomo==1 && L2==1){
    L2=2;
    System.out.println("Entrada B Saida D");
    }
    else if(atomo==1 && L2==2){
    L2=1;
    System.out.println("Entrada B Saida E");
    }
    }
    
    public void C(int atomo){
    
    if(atomo==1 && L3==2){
        L3=1;
        System.out.println("Entrada C Saida E");
    }
    else if(atomo==1 && L3==1 && L2==1){
        L3=2;
        L2=2;
        System.out.println("Entrada C Saida D");
    }
    else if(atomo==1 && L3==1 && L2==2){
        L3=2;
        L2=1;
        System.out.println("Entrada C Saida E");
    }
 
    }
    
    public void reset(){
    L1=1;
    L2=1;
    L3=1;
    System.out.println("Alavancas resetadas para esquerda\n");
    
    
    }

    public int getL1() {
        return L1;
    }

    public void setL1(int L1) {
        this.L1 = L1;
    }

    public int getL2() {
        return L2;
    }

    public void setL2(int L2) {
        this.L2 = L2;
        
    }

    public int getL3() {
        return L3;
    }

    public void setL3(int L3) {
        this.L3 = L3;
    }

    public int getC() {
        return C;
    }

    public void setC(int C) {
        this.C = C;
    }

    public int getD() {
        return D;
    }

    public void setD(int D) {
        this.D = D;
    }

    public int getE() {
        return E;
    }

    public void setE(int E) {
        this.E = E;
    }
    
    
   
    }
    
    
    
    
    


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
public class Fluxonator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
    //VALORES DE L1, L2, L3== 1 (ALAVANCA VIRADA PRA ESQUERDA) 
    //VALORES ==2 (ALAVANCA PRA DIREITA)
       
    
    
     Fluxo f1= new Fluxo();
     
     
    System.out.println("================= BLOCO 1 =================");
    f1.setL1(2);
    f1.setL2(1);
    f1.A(1);
  
    
    f1.setL2(1);
    f1.B(1);
    f1.reset();
    
    f1.setL1(2);
    f1.setL2(2);
    f1.A(1);
  
    
    f1.setL1(1);
    f1.A(1);
    f1.reset();
     
        System.out.println("================= BLOCO 2 =================");
    
    f1.setL2(1);
    f1.B(1);
   
    f1.setL2(2);
    f1.B(1);
     f1.reset();
    
    
    f1.setL2(1);
    f1.B(1);
    
    f1.setL1(2);
    f1.setL2(1);
    f1.A(1);
     f1.reset();
  
    
    f1.setL1(2);
    f1.setL2(2);
    f1.A(1);
    
    f1.setL2(1);
    f1.B(1);
     f1.reset();

    
    f1.setL3(2);
    f1.C(1);
    
    f1.setL2(2);
    f1.setL3(1);
    f1.C(1);
    f1.reset();
    
    
    f1.setL2(1);
    f1.setL3(1);
    f1.C(1);
    
    System.out.println("================= BLOCO 3 =================");
    
    f1.setL2(1);
    f1.B(1);
   
    f1.setL3(2);
    f1.C(1);
    f1.reset();
    
    f1.setL1(1);
    f1.A(1);
    
    f1.setL2(1);
    f1.B(1);
    f1.reset();
    
    f1.setL3(2);
    f1.C(1);
    
    
    f1.setL2(2);
    f1.B(1);
    f1.reset();
    
    f1.setL2(1);
    f1.setL3(1);
    f1.C(1); 
    
  
    
    f1.setL1(2);
    f1.setL2(2);
    f1.A(1);
    f1.reset();
    
    f1.setL1(1);
    f1.A(1);
    
    f1.setL1(1);
    f1.A(1);
    f1.reset();
    
    f1.setL1(1);
    f1.A(1);
    
    f1.setL1(2);
    f1.setL2(2);
    f1.A(1);
    f1.reset();
    
    f1.setL3(2);
    f1.C(1);
    
    f1.setL2(1);
    f1.B(1);
    f1.reset();
    
    f1.setL2(2);
    f1.B(1);
    
    f1.setL1(1);
    f1.A(1);
    f1.reset();
    
    f1.setL2(1);
    f1.B(1);
    
    f1.setL1(2);
    f1.setL2(2);
    f1.A(1);
    f1.reset();
    
    f1.setL2(1);
    f1.setL3(1);
    f1.C(1);
    
    
    f1.setL3(2);
    f1.C(1);
    f1.reset();
    
    f1.setL2(2);
    f1.setL3(1);
    f1.C(1);
    
    f1.setL1(1);
    f1.A(1);
    f1.reset();
    
        
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
   
    
    
   
   
    
    
   
    
    
  
    
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer_ent;

/**
 *
 * @author ACOLL
 */
public class Ejer_ent {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        for (int i = 0; i < 10; i++) {
            System.out.print("[ "+i+" ]");
        }System.out.println("");
        
        for (int i = 0; i < 10; i++) {
            if (i%2==0) {
                System.out.print("[ "+i+" ]");
            }else if(i%2 != 0){
                System.out.print("[   ]");
            }       
        }System.out.println("");
        
    }
    
}

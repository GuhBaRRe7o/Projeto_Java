/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contador01;

/**
 *
 * @author gsouzab
 */
public class Contador01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Fluxo de um laço simples, usando o 'while'
        /*int cc = 1;
        while (cc<=4){
            System.out.println("Cambalhota " + cc);
            cc++;
        }*/
        
        //Mudando o fluxo de um laço, usando o 'continue'
        int cc = 0;
        while (cc<10) {
            cc++;
            if (cc == 2 || cc == 3 || cc == 4) {
                continue; //Interrompe o fluxo e volta para o while
            } 
            if (cc == 7){
                break; //Interrompe o fluxo e vai para o final do programa
            }
            System.out.println("Cambalhota " + cc);
        }
    }
    
}

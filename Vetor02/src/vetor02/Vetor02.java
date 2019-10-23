/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetor02;

/**
 *
 * @author gsouzab
 */
public class Vetor02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String mes[] = {"Jan","Fev","Mar","Abr","Mai",
            "Jun","Jul","Ago","Set","Out","Nov","Dez"};
        int tot[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        for(int c=0; c<=mes.length-1; c++){
            System.out.println("O mês de " + mes[c] + " tem " + 
                    tot[c] + " dias ao todo.");
        }
    }
    
}

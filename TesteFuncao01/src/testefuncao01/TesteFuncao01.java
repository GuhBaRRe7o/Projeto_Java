/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testefuncao01;

/**
 *
 * @author gsouzab
 */
public class TesteFuncao01 {

    /**
     * @param args the command line arguments
     */
    
    //main - método --> Primeiro a ser executado
    //void - procedimento, n retorna valores
    static int soma(int a, int b){
        int s = a + b;
        return s;
        //System.out.println("A soma é: " + s);
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        //Primeiro será executado o método main, logo após será executado a soma
        System.out.println("Começou o programa");
        int sm = soma(5,2);
        System.out.println("A soma vale " + sm);
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question06;

/**
 *
 * @author Bruce
 */
public class Question06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x = 5;
        int y = 10;
        int fx = (2 * x) + 3;
        int fy = 2 + (int)(3 * Math.pow(y, 2));
        
        System.out.println("Fx: "+fx);
        System.out.println("Fy: "+fy);
    }
    
}
/*

Crie um algoritmo para calcular a função f(x, y) = 2x + 3y2
, num domínio real.


*/
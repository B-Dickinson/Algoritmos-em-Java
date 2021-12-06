package questao53;


public class Questao53 {

   
    public static void main(String[] args) {
           int n1[][] = new int[4][6];
           int n2[][] = new int[4][6];
           int l;
           int c;
           int m1[][] = new int[4][6];
           int m2[][] = new int[4][6];
           
           //n1
           
           for(l=0; l < n1.length;l++){
               for(c=0; c < n1[l].length;c++){
                   n1[l][c] = (int)(1 + Math.random() * (4-1));
               }
           }
           
           //n2
           for(l=0; l < n1.length;l++){
               for(c=0; c < n1[l].length;c++){
                   n2[l][c] = (int)(1 + Math.random() * (4-1));
               }
           }
           //m1
           for(l=0; l < n1.length;l++){
               for(c=0; c < n1[l].length;c++){
                  m1[l][c] = n1[l][c] + n2[l][c];
               }
           }  
           //m2
           for(l=0; l < n1.length;l++){
               for(c=0; c < n1[l].length;c++){
                  m2[l][c] = n1[l][c] - n2[l][c];
               }
           }
                   System.out.println("");
                   System.out.println("");
                   System.out.println("Matriz N1:");
                   
            for(l=0;l < n1.length; l++){
                for(c=0; c < n1[l].length;c++){
                    System.out.print(n1[l][c]+" ");
                }
                    System.out.println();
            }  
                    
                    System.out.println("");
                    System.out.println("");
                    System.out.println("Matriz N2:");
                    
            for(l=0; l < n1.length;l++){
               for(c=0; c < n1[l].length;c++){
                    System.out.print(n2[l][c]+" ");
               }
                    System.out.println();
            } 
                
                    System.out.println("");
                    System.out.println("");
                    System.out.println("Matriz M1:");
                    
            for(l=0; l < n1.length;l++){
               for(c=0; c < n1[l].length;c++){
                   System.out.print(m1[l][c]+" ");
               }
                   System.out.println();
            }          
            
                   System.out.println("");
                   System.out.println("");
                   System.out.println("Matriz M2:");
                   
            for(l=0; l < n1.length;l++){
               for(c=0; c < n1[l].length;c++){
                   System.out.print(m2[l][c]+" ");
               }
                   System.out.println("");
           }         
           
           
           
           
    }
}

/*

Escrever um algoritmo que lê duas matrizes N1(4,6) e N2(4,6) e cria:

a) Uma matriz M1 que seja a soma de N1 e N2
b) Uma matriz M2 que seja a diferença de N1 com N2

Escrever as matrizes lidas e calculadas


*/
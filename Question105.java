package matematica;


public class Ex005 {

public static void main(String[]args){
       int m[][] = new int[5][6];
       int i;
       int j;
       float sp = 0;
       int q = 0;
       float mediap = 0;


for(i=0; i < m.length; i++){
    for(j=0; j < m[i].length; j++){
        m[i][j] = (int)(1 + (Math.random()) * (8-1));
    }
}       
        System.out.println();
        System.out.println("Matriz M:");
        System.out.println();

for(i=0; i < m.length; i++){
    for(j=0; j < m[i].length; j++){
        if(m[i][j] % 2 == 0){
               sp += m[i][j];
               q++;   
            }
        
        System.out.print(m[i][j]+"\t");
    }
        System.out.println("\n");
} 
        mediap += (sp / q);
        
        System.out.println();              
        System.out.printf("Existem exatamente "+q+" números pares na matriz...média = %.2f",mediap);              
        System.out.println();              
        System.out.println();              
       
    }    
}

/*

Escrever um algoritmo para armazenar valores inteiros em uma matriz (5,6). A seguir, 
calcular a média dos valores pares contidos na matriz e escrever seu conteúdo.


*/
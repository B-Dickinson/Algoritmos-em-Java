package matematica;

import java.util.Scanner;

public class Ex003 {

public static void main(String[]args){
   
Scanner teclado = new Scanner(System.in);
int b[][] = new int[3][2];
int t[][] = new int[2][3];
int r[][] = new int[2][3];
int i;
int j;


for(i=0; i < b.length; i++){
    for(j=0; j < b[i].length; j++){
        System.out.print("["+i+","+j+"]: ");
        b[i][j] = teclado.nextInt();
    }
}
        System.out.println(); 
        System.out.println("Matriz B:");  
        System.out.println(); 

for(i=0; i < b.length; i++){
    for(j=0; j < b[i].length; j++){
        System.out.print(b[i][j]+"\t");
    }
        System.out.println("\n");
}
        System.out.println();
        System.out.println("Matriz B':");
        System.out.println();

for(j=0; j < t.length; j++){
    for(i=0; i < t[j].length; i++){
        t[j][i] = b[i][j];
        System.out.print(t[j][i]+"\t");
    }
        System.out.println("\n");
}  


        System.out.println();    
        System.out.println("Matriz Resultante:");    
        System.out.println();    

for(j=0; j < t.length; j++){
    for(i=0; i < t[j].length; i++){
        r[j][i] = (3 * t[j][i]);
        System.out.print(r[j][i]+"\t");
    }
        System.out.println("\n");
}     



    }
}

/*

Considerando a matriz B, encontre a Matriz transposta e calcule 3B'

     1  5
B =  2  0
    -1  2

*/
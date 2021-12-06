package matematica;

public class Ex009 {

public static void main(String[]args){

int n1[][] = new int[4][6];
int n2[][] = new int[4][6];
int m1[][] = new int[4][6];
int m2[][] = new int[4][6];
int i = 0;
int j = 0;

for(i=0;i < n1.length; i++){
    for(j=0; j < n1[i].length;j++){
        n1[i][j] = (int)(1 + (Math.random())* (8-1));
    }
}

for(i=0;i < n2.length; i++){
    for(j=0; j < n2[i].length;j++){
        n2[i][j] = (int)(1 + (Math.random())* (8-1));
    }
}

for(i=0;i < m1.length; i++){
    for(j=0; j < m1[i].length;j++){
        m1[i][j] = n1[i][j] + n2[i][j];
    }
}

for(i=0;i < m2.length; i++){
    for(j=0; j < m2[i].length;j++){
        m2[i][j] = n1[i][j] - n2[i][j];
    }
}

System.out.println("------------------------------------------------------------------------------------------------------");
System.out.println("");
System.out.println("Matriz N1:");
System.out.println("");

for(i=0;i < n1.length; i++){
    for(j=0; j < n1[i].length;j++){
        System.out.print(n1[i][j]+"\t");
    }
        System.out.println("\n");
}

System.out.println("-----------------------------------------------------------------------------------------------------");
System.out.println("");
System.out.println("Matriz N2:");
System.out.println("");

for(i=0;i < n2.length; i++){
    for(j=0; j < n2[i].length;j++){
        System.out.print(n2[i][j]+"\t");
    }
        System.out.println("\n");
}

System.out.println("-----------------------------------------------------------------------------------------------------");
System.out.println("");
System.out.println("Matriz M1:");
System.out.println("");

for(i=0;i < m1.length; i++){
    for(j=0; j < m1[i].length;j++){
        System.out.print(m1[i][j]+"\t");
    }
        System.out.println("\n");
}

System.out.println("-----------------------------------------------------------------------------------------------------");
System.out.println("");
System.out.println("Matriz M2:");
System.out.println("");

for(i=0;i < m2.length; i++){
    for(j=0; j < m2[i].length;j++){
        System.out.print(m2[i][j]+"\t");
    }
        System.out.println("\n");
}



    }        
}

/* 

5 - Escrever um algoritmo que lê duas matrizes N1(4,6) e N2(4,6) e cria:
a) Uma matriz M1 que seja a soma de N1 e N2
b) Uma matriz M2 que seja a diferença de N1 com N2
Escrever as matrizes lidas e calculadas.

*/

package metodosmatematicos;

import static java.lang.Math.pow;
import java.util.Scanner;

public class MetodosMatematicos {

    public static void main(String[] args) {
           int x = 0;
           int y = 0;
           int r = 0;
           float z;
           Scanner teclado = new Scanner(System.in);
           
           System.out.print("Informe um número: ");
           x = teclado.nextInt();
           System.out.print("Informe outro número: ");
           y = teclado.nextInt();
           
           // adiçao
           r = Math.addExact(x,y);
           System.out.println(x+" + "+y+" = "+r);
           
           // subtração
           r = Math.subtractExact(x,y);
           System.out.println(x+" - "+y+" = "+r);
           
           // multiplicação
           r = Math.multiplyExact(x, y);
           System.out.println(x+" * "+y+" = "+r);
           
           // números aleatórios
           System.out.println(Math.round(Math.random() * 10));
           
           // potencia
           System.out.println(pow(x, y));
           
           // exponenciacao
           System.out.println(Math.exp(x));
           
           // pi
           System.out.printf("%.6f \n",Math.PI);
           
           // Raiz Quadrada
           System.out.println(Math.sqrt(x));
           
           // Raiz Cúbica
           System.out.println(Math.cbrt(x));
           
           // Fator
           System.out.println(Math.scalb(x, y)); // (2 * x) * 2
           
           //  Numero absoluto
           z =  -8.45f;
           System.out.println(Math.abs(z));
           
           // arredonda pra cima
           z = 8.45f;
           System.out.println(Math.ceil(z));
           
           // arredonda pra baixo
           
           System.out.println(Math.floor(z));
           
           // o menor numero <= ao quociente
           int h =  - 5;
           System.out.println(Math.floorDiv(1, h));
           
           // o menor numero <= ao resto da divisao
           System.out.println(Math.floorMod(20,3));
           
           // arredondamento aritmetico
           z = 8.85f;
           System.out.println(Math.round(z));
           
           //primeiro numero depois de x em direcao de y
           System.out.println(Math.nextAfter(x, y));
           
           // primeiro numero antes de x
           System.out.println(Math.nextDown(x));
           
           // maior numero entre x e y
           System.out.println(Math.max(x, y));
           
           // menor numero
           System.out.println(Math.min(x,y));
           
           // primeiro numero após x
           int j = 8;
           System.out.println(Math.nextUp(j));
           
           
   
    }
}








import java.util.Arrays;
import java.util.Scanner;




public class Solution
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        // 10. Implementar l'algorisme d'ordenació Bubble Sort (ordenació de bombolla, en anglès): funciona revisant cada element de la llista a ordenar amb el següent, intercanviant-de posició si estan en l'ordre equivocat. Cal revisar diverses vegades tota la llista fins que no es necessitin més intercanvis, la qual cosa significa que la llista està ordenada. Per exemple:
        int i = 0, temp = 0,  size, array[];
        boolean swap = true;   // swap=true vol dir que hem fet algun intercanvi

        // Llegeix el tamany del vector

        System.out.println("Número d'elements del vector: ");
        size = sc.nextInt();

        array = new int[size];

        // Creem un vector d'enters aleatoris entre 0 i 100
        for (i = 0; i < size; i++)
            array[i] = (int)(Math.random()*100);
        for (i = 0; i < size; i++)
            System.out.print("a[" + i + "]=" + array[i] + " ");
        System.out.println("\n");

        sc.close();

        int recorreguts = 0; //num de recorreguts del vector

        while (swap) {
            recorreguts++;
            swap = false; //al inici de cada recorregut posem l'indicador d'intercanvis a false
            for(int j=0; j<array.length-1; j++)
            {
                if ( array[j] > array[j+1] )
                {
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    swap = true;
                }
            }
        }

        for (i=0; i<size; i++)
            System.out.print("a[" + i + "]=" + array[i] + " ");

        System.out.println("\n\nNúmero de recorreguts: " + recorreguts);

    }
}




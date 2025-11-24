import java.util.Scanner;
public class BurbujaNumeros2
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[100];
        int aux = 0;
        int con = 0;
        for(int i = 0; i < arr.length; i++)
        {
            System.out.println("Introduce un número a ordenar:");
            arr[con] = scanner.nextInt();
            con++;
            System.out.println("¿Quieres agregar otro número?");
            System.out.println("Presiona 1 para continuar");
            System.out.println("Presiona 2 para ordenar");
            int S = scanner.nextInt();
            if( S == 2)
            {
                break;
            }
            if( S != 1)
            {
                System.out.println("Opción invalida");
                break;
            }

        }
        System.out.print("Números ordenados por orden de introducción:  ");
        for (int i = 0; i < con; i++)
        {
            System.out.print(arr[i]);
        }
        System.out.print("\n");
        for (int i = 0; i < con; i++)
        {
            for (int y = i + 1; y < con; y++)
            {
                if (arr[y] < arr[i])
                {
                    aux = arr[i];
                    arr[i] = arr[y];
                    arr[y] = aux;
                }
            }
        }
        System.out.print("Números ordenados de menor a mayor:  ");
        for(int i = 0; i < con; i++)
        {
            System.out.print(arr[i]);
        }
    }
}

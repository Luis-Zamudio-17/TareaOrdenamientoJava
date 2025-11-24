import java.util.Scanner;
public class Menu
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        boolean valor = true;
        while(valor == true)
        {
            System.out.println("Bienvenido al ordenamiento Burbuja");
            System.out.println("ELige una de las siguientes opciones");
            System.out.println("Presiona 1 para ordenar números");
            System.out.println("Presiona 2 para ordenar palabras");
            System.out.println("Presiona 3 para salir");
            int opcion = scanner.nextInt();
            switch(opcion)
            {
                case 1:
                    burbujanumeroS();
                    valor = true;
                    break;
                case 2:
                    burbujaalfabetica();
                    valor = true;
                    break;
                case 3:
                    valor = false;
                    break;
                default:
                    System.out.println("Opción incorrecta");
                    valor = false;
                    break;
            }
        }
    }

    private static void burbujaalfabetica()
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce las palabras a ordenar:");
        String cadena = scanner.nextLine();


        char[] arr = cadena.toCharArray();

        char aux;

        System.out.print("Cadena original: ");
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i]);
        }
        System.out.print("\n");

        for (int i = 0; i < arr.length; i++)
        {
            for (int y = i + 1; y < arr.length; y++)
            {
                int valorY = arr[y];
                if(valorY >= 97 && valorY <= 122)
                {
                    valorY = valorY - 32;
                }

                int valorI = arr[i];
                if(valorI >= 97 && valorI <= 122)
                {
                    valorI = valorI - 32;
                }

                if (valorY < valorI)
                {
                    aux = arr[i];
                    arr[i] = arr[y];
                    arr[y] = aux;
                }
            }
        }

        System.out.print("Cadena ordenada alfabeticamente: ");
        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i]);
        }
        System.out.println("\n");
    }

    private static void burbujanumeroS()
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
        System.out.println("\n");
    }
}

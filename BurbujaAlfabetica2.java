import java.util.Scanner;
public class BurbujaAlfabetica2
{
    public static void main(String[] args)
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
        System.out.println();
    }
}

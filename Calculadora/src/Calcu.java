import java.util.Scanner;

public class Calcu {

    public static void main (String[] args)
    {
        Scanner x = new Scanner(System.in);

        int Opcion;
        float Numero1, Numero2, Sum, Res, Multiplica, Dividir;

        do {
            System.out.println("-----Bienvenidos-----");
            System.out.println("¿A qué función desea acceder?");
            System.out.println("1) Suma");
            System.out.println("2) Resta");
            System.out.println("3) Multiplicación");
            System.out.println("4) Dividir");
            System.out.println("5) Salir");
            Opcion = x.nextInt();

            switch (Opcion) {
                case 1:
                    System.out.println("Ingrese el primer número a sumar: ");
                    Numero1 = x.nextFloat();
                    System.out.println("Ingrese el segundo número a sumar: ");
                    Numero2 = x.nextFloat();

                    Sum = Calcu.Sumar(Numero1, Numero2);

                    System.out.println("Resultado: " + Sum);
                    break;

                case 2:
                    System.out.println("Ingrese el primer número a restar: ");
                    Numero1 = x.nextFloat();
                    System.out.println("Ingrese el segundo número a restar: ");
                    Numero2 = x.nextFloat();

                    Res = Calcu.Restar(Numero1, Numero2);

                    System.out.println("Resultado: " + Res);
                    break;

                case 3:
                    System.out.println("Ingrese el primer número a multiplicar: ");
                    Numero1 = x.nextFloat();
                    System.out.println("Ingrese el segundo número a multiplicar: ");
                    Numero2 = x.nextFloat();

                    Multiplica = Calcu.Multi(Numero1, Numero2);

                    System.out.println("Resultado: " + Multiplica);
                    break;

                case 4:
                    System.out.println("Ingrese el primer número a dividir: ");
                    Numero1 = x.nextFloat();
                    System.out.println("Ingrese el segundo número a dividir: ");
                    Numero2 = x.nextFloat();

                    Dividir = Calcu.Div(Numero1, Numero2);

                    System.out.println("Resultado: " + Dividir);
                    break;

                case 5:
                    System.out.println("Saliendo del programa . . .");
                    break;
            }

        } while (Opcion != 5);
    }
        public static float Sumar(float Numero1, float Numero2)
        { return Numero1 + Numero2; }

        public static float Restar(float Numero1, float Numero2)
        { return Numero1 - Numero2; }

        public static float Multi(float Numero1, float Numero2)
        { return Numero1 * Numero2; }

        public static float Div(float Numero1, float Numero2)
        { return Numero1 / Numero2; }

}
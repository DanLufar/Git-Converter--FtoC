package app;

public class Main {

    public static void main(String[] args) {
        System.out.println("Converter Fahrenheits to Celsius and Back");

        int F = 68;
        int C = (F - 32) * 5 / 9;
        int Cl = 20;
        int Fr = Cl * 9 / 5 + 32;
        System.out.println();
        System.out.println(F + " Fahrenheits will be " + C + " Celsius");
        System.out.println(Cl + " Celsius will be " + Fr + " Fahrenheits");
    }

}

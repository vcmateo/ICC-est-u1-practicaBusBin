import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa la cantidad de personas:");
        int cantidadPersonas = scanner.nextInt();
        scanner.nextLine(); 

        Personas[] personas = new Personas[cantidadPersonas];

        for (int i = 0; i < cantidadPersonas; i++) {
            System.out.println("Ingresa el nombre de la persona " +(i+1));
            String nombre = scanner.nextLine();
            System.out.println("Ingresa la edad de la persona " +(i+1));
            int edad = scanner.nextInt();
            scanner.nextLine();
            personas[i] = new Personas(nombre, edad);
        }
        sortByEdad(personas);
        scanner.close();
        for (Personas persona : personas) {
            System.out.println(persona);
        }
    }

    public static void sortByEdad(Personas[] personas) {
        for (int i = 0; i < personas.length; i++) {
            for (int j = i + 1; j < personas.length; j++) {
                if (personas[i].getEdad() > personas[j].getEdad()) {
                    Personas aux = personas[i];
                    personas[i] = personas[j];
                    personas[j] = aux;
                }
            }
        }
    }
    public int busquedaBinaria(int[] arr, int value) {
        int inicio = 0;
        int fin = arr.length - 1;
        while (inicio <= fin) {
            int medio = inicio + (fin - inicio) / 2;
            if (arr[medio] == value) {
                return medio; // 
            }
            if (arr[medio] < value) {
                inicio = medio + 1; 
            } else {
                fin = medio - 1; 
            }
        }
        return -1; 
    }
}

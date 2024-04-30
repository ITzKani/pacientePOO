import java.util.Scanner;

class MainPaciente{
    public static void main(String[] args) {
        Scanner fn = new Scanner(System.in);

        System.out.print("Ingresa tu nombre: ");
        String nombre = fn.nextLine();

        System.out.print("Ingresa tu apellido: ");
        String apellido = fn.nextLine();

        System.out.print("Ingresa tu edad: ");
        int edad = fn.nextInt();

        System.out.print("Ingresa tu estatura: ");
        double estatura = fn.nextDouble();

        System.out.print("Ingresa tu peso: ");
        double peso = fn.nextDouble();

        System.out.print("Ingresa tu enfermedad: ");
        fn.nextLine();
        String enfermedad = fn.nextLine();

        Paciente p1 = new Paciente();

        p1.nombre = nombre;
        p1.apellido = apellido;
        p1.edad = edad;
        p1.estatura = estatura;
        p1.peso = peso;
        p1.enfermedad = enfermedad;

        p1.mostrarInfo();
    }
}
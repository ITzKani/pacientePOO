class Paciente{

    String nombre, apellido, enfermedad;
    int edad;
    double estatura, peso;

    public void mostrarInfo(){

        System.out.println("Nombre completo: " + nombre + " " + apellido);
        System.out.println("Edad: " + edad);
        System.out.println("Estatura: " + estatura + "m" + "    Peso: " + peso + "kg");
        System.out.println("**Enfermedad: " + enfermedad + "**");


    }
}
package com.example;

public class Main {
    public static void main(String[] args) {

        // TODO: Crear método main para:
        // 1. Crear dos objetos Estudiante con diferentes valores
        // 2. Mostrar la información de ambos estudiantes
        // 3. Modificar algún atributo usando un setter
        // 4. Mostrar la información actualizada
        Estudiante estudiante1 = new Estudiante("Juan", 18, 8.5);
        Estudiante estudiante2 = new Estudiante("María", 20, 9.2);

        estudiante1.mostrarInformacion();
        estudiante2.mostrarInformacion();

        estudiante1.setPromedio(9.0);
        estudiante1.mostrarInformacion();

        // TODO: Crear método main para:
        // 1. Crear un libro usando el constructor completo
        // 2. Crear un libro usando el constructor con solo titulo y autor
        // 3. Mostrar información de ambos libros
        // 4. Aplicar descuento usando ambas versiones del método
        // 5. Mostrar información actualizada de los libros
        Libro libro1 = new Libro("El Principito", "Antoine de Saint-Exupéry", 50.0);
        Libro libro2 = new Libro("Cien Años de Soledad", "Gabriel García Márquez");

        libro1.mostrarInformacion();
        libro2.mostrarInformacion();

        libro1.aplicarDescuento(10);
        libro2.setPrecio(40.0);
        libro2.aplicarDescuento(20, 5.0);

        libro1.mostrarInformacion();
        libro2.mostrarInformacion();
    }
}

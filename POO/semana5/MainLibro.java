class MainLibro {

    public static void main(String[] args) {

        Libro libro1 = new Libro("978-0-123456-47-2", "El principito", "Antoine de Saint-Exupéry", 1943, true);
        Libro libro2 = new Libro("978-0-123456-48-9", "Don Quijote de la Mancha", "Miguel de Cervantes", 1605, true);
        Libro libro3 = new Libro("978-0-123456-49-6", "Cien años de soledad", "Gabriel García Márquez", 1967, true);
        Libro libro4 = new Libro("978-0-123456-50-2", "Rayuela", "Julio Cortázar", 1963, true);
        Libro libro5 = new Libro("978-0-123456-51-9", "La sombra del viento", "Carlos Ruiz Zafón", 2001, true);

        // Mostrar información de los libros
        System.out.println("Información del Libro 1: " + libro1);
        System.out.println("Información del Libro 2: " + libro2);
        System.out.println("Información del Libro 3: " + libro3);
        System.out.println("Información del Libro 4: " + libro4);
        System.out.println("Información del Libro 5: " + libro5);

        // Mostrar solo el titulo del libro 2
        System.out.println("Título del Libro 2: " + libro2.getTitulo());

        //Cambiar el isbn del libro5
        libro5.setIsbn("978-0-123456-52-6");
        System.out.println("Nuevo ISBN del Libro 5: " + libro5.getIsbn());

        //verificar si el libro 3 está disponible
        System.out.println("¿El Libro 3 está disponible? " + libro3.estaDisponible());

        //prestar el libro 3
        libro3.prestar();
        System.out.println("¿El Libro 3 está disponible después de prestarlo? " + libro3.estaDisponible()); //false

        //Devolver el libro 3
        libro3.devolver();
        System.out.println("¿El Libro 3 está disponible después de devolverlo? " + libro3.estaDisponible()); //true
        
    
    }

}
public class Main {
    static class Estudiante {
        private final String nombre;
        private final int edad;
        private final String documento;
        private final String programa;

        public Estudiante(String nombre, int edad, String documento, String programa) {
            this.nombre = nombre;
            this.edad = edad;
            this.documento = documento;
            this.programa = programa;
        }

        public String getNombre() {
            return nombre;
        }

        public int getEdad() {
            return edad;
        }

        public String getDocumento() {
            return documento;
        }

        public String getPrograma() {
            return programa;
        }

        @Override
        public String toString() {
            return nombre + " " + edad + " " + documento + " " + programa;
        }
    }

    public static void main(String[] args) {
        Estudiante e1 = new Estudiante("Ana", 20, "1001", "Sistemas");
        Estudiante e2 = new Estudiante("Luis", 22, "1002", "Derecho");
        Estudiante e3 = new Estudiante("Marta", 19, "1003", "Medicina");

        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);

        // Comparación: atributo por atributo
        System.out.println(e1.getNombre() + " " + e1.getEdad() + " " + e1.getDocumento() + " " + e1.getPrograma());
    }
} 
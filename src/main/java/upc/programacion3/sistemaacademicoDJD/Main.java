package upc.programacion3.sistemaacademicoDJD;

import java.util.ArrayList;
import java.util.Scanner;
public class Main
{
    private static ArrayList<Object> estudiantes = new ArrayList<>();
    private static ArrayList<Object> asignatura = new ArrayList<>();
    private static ArrayList<Object> notas =new ArrayList<>();

    private static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;
        do {
            mostrarMenu();
            System.out.print("Seleccione una opción: ");
            opcion = leer.nextInt();
            leer.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1: registrarEstudiante(); break;
                case 2: listarEstudiantes(); break;
                case 3: buscarEstudiante(); break;
                case 4: actualizarEstudiante(); break;
                case 5: eliminarEstudiante(); break;
                case 6: registrarAsignatura(); break;
                case 7: listarAsignaturas(); break;
                case 8: buscarAsignatura(); break;
                case 9: actualizarAsignatura(); break;
                case 10: eliminarAsignatura(); break;
                case 11: registrarNota(); break;
                case 12: listarNotas(); break;
                case 13: buscarNota(); break;
                case 14: actualizarNota(); break;
                case 15: eliminarNota(); break;
                case 0: System.out.println("Saliendo del sistema..."); break;
                default: System.out.println("Opción no válida.");
            }
        } while (opcion != 0);
    }

    public static void mostrarMenu() {
        System.out.println("\n--- SISTEMA ACADÉMICO UPC ---");
        System.out.println("1. Registrar Estudiante");
        System.out.println("2. Listar Estudiantes");
        System.out.println("3. Buscar Estudiante");
        System.out.println("4. Actualizar Estudiante");
        System.out.println("5. Eliminar Estudiante");
        System.out.println("-----------------------------");
        System.out.println("6. Registrar Asignatura");
        System.out.println("7. Listar Asignaturas");
        System.out.println("8. Buscar Asignatura");
        System.out.println("9. Actualizar Asignatura");
        System.out.println("10. Eliminar Asignatura");
        System.out.println("-----------------------------");
        System.out.println("11. Registrar Nota");
        System.out.println("12. Listar Notas");
        System.out.println("13. Buscar Nota");
        System.out.println("14. Actualizar Nota");
        System.out.println("15. Eliminar Nota");
        System.out.println("0. Salir");
    }


    public static void registrarEstudiante() {
        System.out.println("\n--- Registrar Nuevo Estudiante ---");

        System.out.print("Ingrese código: ");
        String codigo = leer.nextLine();

        System.out.print("Ingrese nombre: ");
        String nombre = leer.nextLine();

        System.out.print("Ingrese apellido: ");
        String apellido = leer.nextLine();

        System.out.print("Ingrese edad: ");
        int edad = leer.nextInt();

        System.out.print("Ingrese semestre: ");
        int semestre = leer.nextInt();
        leer.nextLine();



        System.out.println("¡Estudiante registrado con éxito (Simulado)!");
    }
    public static void listarEstudiantes() {}
    public static void buscarEstudiante() {}
    public static void actualizarEstudiante() {}
    public static void eliminarEstudiante() {}
    public static void registrarAsignatura() {}
    public static void listarAsignaturas() {}
    public static void buscarAsignatura() {}
    public static void actualizarAsignatura() {}
    public static void eliminarAsignatura() {}
    public static void registrarNota() {}
    public static void listarNotas() {}
    public static void buscarNota() {}
    public static void actualizarNota() {}
    public static void eliminarNota() {}
}




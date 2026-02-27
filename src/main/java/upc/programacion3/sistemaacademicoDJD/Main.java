package upc.programacion3.sistemaacademicoDJD;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {


    private static ArrayList<Estudiante> estudiantes = new ArrayList<>();
    private static ArrayList<Asignatura> asignaturas = new ArrayList<>();
    private static ArrayList<Object> notas = new ArrayList<>(); // Se actualizará cuando Jorge termine la clase Nota

    private static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;
        do {
            mostrarMenu();
            System.out.print("Seleccione una opción: ");
            opcion = leer.nextInt();
            leer.nextLine();

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

    // --- MÉTODOS DE ESTUDIANTE ---

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

        // Uso del constructor de Florez: (codigo, nombre, apellido, edad, semestre)
        Estudiante nuevo = new Estudiante(codigo, nombre, apellido, edad, semestre);
        estudiantes.add(nuevo);
        System.out.println("¡Estudiante registrado con éxito!");
    }

    public static void listarEstudiantes() {
        System.out.println("\n--- Lista de Estudiantes ---");
        if (estudiantes.isEmpty()) {
            System.out.println("No hay registros en la lista.");
        } else {
            for (Estudiante est : estudiantes) {
                System.out.println(est);
            }
        }
    }

    public static void buscarEstudiante() {
        System.out.println("\n--- Buscar Estudiante ---");
        System.out.print("Ingrese el código a consultar: ");
        String codigo = leer.nextLine();

        boolean encontrado = false;
        for (Estudiante est : estudiantes) {
            if (est.getCodigo().equals(codigo)) {
                System.out.println("Resultado: " + est);
                encontrado = true;
                break;
            }
        }
        if (!encontrado) System.out.println("Estudiante no encontrado.");
    }

    public static void actualizarEstudiante() {
        System.out.println("\n--- Actualizar Estudiante ---");
        System.out.print("Ingrese el código del estudiante a editar: ");
        String codigo = leer.nextLine();

        for (Estudiante est : estudiantes) {
            if (est.getCodigo().equals(codigo)) {
                System.out.print("Nuevo nombre: ");
                est.setNombre(leer.nextLine());
                System.out.print("Nuevo apellido: ");
                est.setApellido(leer.nextLine());
                System.out.println("¡Datos actualizados!");
                return;
            }
        }
        System.out.println("No se encontró el estudiante.");
    }

    // Actividad 6: Implementación de eliminación física
    public static void eliminarEstudiante() {
        System.out.println("\n--- Eliminar Estudiante ---");
        System.out.print("Ingrese el código del estudiante a borrar: ");
        String codigo = leer.nextLine();

        boolean eliminado = estudiantes.removeIf(e -> e.getCodigo().equals(codigo));

        if (eliminado) {
            System.out.println("¡Estudiante eliminado con éxito!");
        } else {
            System.out.println("No se encontró ningún estudiante con ese código.");
        }
    }

    // --- MÉTODOS DE ASIGNATURA ---

    public static void registrarAsignatura() {
        System.out.println("\n--- Registrar Nueva Asignatura ---");
        System.out.print("Ingrese código: ");
        String codigo = leer.nextLine();
        System.out.print("Ingrese nombre: ");
        String nombre = leer.nextLine();
        System.out.print("Ingrese créditos: ");
        int creditos = leer.nextInt();
        leer.nextLine();
        System.out.print("Ingrese docente: ");
        String docente = leer.nextLine();

        // Constructor de Jorge: (nombre, codigo, creditos, docente)
        Asignatura nuevaAsig = new Asignatura(nombre, codigo, creditos, docente);
        asignaturas.add(nuevaAsig);
        System.out.println("¡Asignatura registrada con éxito!");
    }

    public static void listarAsignaturas() {
        System.out.println("\n--- Lista de Asignaturas ---");
        if (asignaturas.isEmpty()) {
            System.out.println("No hay asignaturas registradas.");
        } else {
            for (Asignatura a : asignaturas) {
                System.out.println(a);
            }
        }
    }

    public static void buscarAsignatura() {
        System.out.println("\n--- Buscar Asignatura ---");
        System.out.print("Ingrese el código: ");
        String codigo = leer.nextLine();

        for (Asignatura a : asignaturas) {
            if (a.getCodigo().equals(codigo)) {
                System.out.println("Encontrada: " + a);
                return;
            }
        }
        System.out.println("Asignatura no encontrada.");
    }

    public static void actualizarAsignatura() { /* Daniel Florez debe completar */ }
    public static void eliminarAsignatura() { /* Daniel Florez debe completar */ }

    // --- MÉTODOS DE NOTAS (Jorge debe completar) ---
    public static void registrarNota() {}
    public static void listarNotas() {}
    public static void buscarNota() {}
    public static void actualizarNota() {}
    public static void eliminarNota() {}
}
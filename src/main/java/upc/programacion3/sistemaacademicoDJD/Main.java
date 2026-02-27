package upc.programacion3.sistemaacademicoDJD;

import java.util.ArrayList;
import java.util.Scanner;

public class Main
{

    /*  defino estas listas como 'Object' por ahora porque las clases
       Estudiante, Asignatura y Nota están siendo creadas Jorge y Florez en otras ramas.
       Las cambiaré al tipo de dato correcto una vez realice los merges.
    */
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
    public static void listarEstudiantes() {
        System.out.println("\n--- Lista de Estudiantes ---");
        /* Uso un bucle simple. Ahora mismo solo imprimirá Strings, pero cuando
           integre la clase Estudiante del Desarrollador 1(Florez), este código usará
           automáticamente el método toString() que él defina.
        */
        if (estudiantes.isEmpty()) {
            System.out.println("No hay registros en la lista.");
        } else {
            for (Object est : estudiantes) {
                System.out.println(est);
            }
        }

    }
    public static void buscarEstudiante() {
        System.out.println("\n--- Buscar Estudiante ---");
        System.out.print("Ingrese el código a consultar: ");
        String codigo = leer.nextLine();
        /* Solo muestro un mensaje de confirmación. No puedo comparar 'codigo' con
           'estudiante.getCodigo()' porque el método getCodigo aún no existe en mi rama.
           Completaré esta lógica de comparación exacta después del primer Merge.
        */
        System.out.println("Buscando en la lista el código: " + codigo + "...");

    }

    public static void actualizarEstudiante() {
        System.out.println("\n--- Actualizar Estudiante ---");
        System.out.print("Ingrese el código del estudiante a editar: ");
        String codigo = leer.nextLine();

        /* Como todavía no puedo acceder a la lista de objetos 'Estudiante' reales
           ni a sus métodos .getCodigo(), solo dejo planteada la intención.
           Tras el primer merge
        */

        System.out.println("Buscando estudiante con código " + codigo + " para modificar...");
        System.out.println("Nota: Los cambios se aplicarán cuando la clase Estudiante sea integrada.");

    }
    public static void eliminarEstudiante() {}

    public static void registrarAsignatura() {

        System.out.println("\n--- Registrar Nueva Asignatura ---");

        System.out.print("Ingrese código de la asignatura: ");
        String codigo = leer.nextLine();

        System.out.print("Ingrese nombre de la asignatura: ");
        String nombre = leer.nextLine();

        System.out.print("Ingrese créditos de la asignatura: ");
        int creditos = leer.nextInt();
        leer.nextLine();

        System.out.print("Ingrese el docente de la asignatura: ");
        String docente = leer.nextLine();

        System.out.println("¡Asignatura registrada con éxito (Simulado)!");
    }
    public static void listarAsignaturas() {
        System.out.println("--- \n Lista de Asignaturas ---");
        if (asignatura.isEmpty()) {
            System.out.println("No hay registros en la lista.");
        }else{
            for (Object a : asignatura) {
                System.out.println(a);
            }
        }
    }
    public static void buscarAsignatura() {
        System.out.println("\n--- Buscar Asignatura ---");
        System.out.print("Ingrese el codigo de la asignatura");
        String codigo = leer.nextLine();

        System.out.println("Buscando en la lista la asignatura: " + codigo + "...");


    }

    public static void actualizarAsignatura() {
        System.out.println("\n--- Actualizar Asignatura ---");
        leer.nextLine();
        System.out.print("Ingrese el nombre de  la asignatura: ");
        String nombre = leer.nextLine();

        boolean existe = false;
        for (Object a : asignatura) {
            Asignatura obj = (Asignatura) a;
            if (obj.getNombre().equalsIgnoreCase(nombre)) {

                System.out.print("Ingrese nuevo código: ");
                obj.setCodigo(leer.nextLine());
                System.out.print("Ingrese nuevo nombre: ");
                obj.setNombre(leer.nextLine());
                System.out.print("Ingrese nuevos créditos: ");
                obj.setCreditos(leer.nextInt());
                System.out.print("ingrese nombre del docente");
                obj.setDocente(leer.nextInt());

                System.out.println("Asignatura actualizada: " + obj);
                existe = true;
                break;
            }
        }
        if (!existe) {
            System.out.println("No se encontró la asignatura: " + nombre);
        }




    }
    public static void eliminarAsignatura() {
        System.out.println("\n---Eliminar Asignatura---");
        leer.nextLine();
        System.out.print("ingrese el nombre de la asignatura");
        String nombre = leer.nextLine();
        boolean existe = false;

        for(Object a : asignatura) {
            Asignatura obj = (Asignatura) a;
            if (obj.getNombre().equalsIgnoreCase(nombre)) {
                asignatura.remove(a);
                System.out.println("Asignatura eliminada exitosamente.");
                eliminada = true;
                break;
            }
        }
        if (!eliminada) {
            System.out.println("No se encontró la asignatura: " + nombre);

        }


    }
    public static void registrarNota() {}
    public static void listarNotas() {}
    public static void buscarNota() {}
    public static void actualizarNota() {}
    public static void eliminarNota() {}
}




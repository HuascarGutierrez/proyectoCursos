/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.emi.proyectocursos;
import java.util.Scanner;
/**
 *
 * @author HELEN Y LOS INSANOS
 */
public class ProyectoCursos {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        ListaCurso IngDeSistemas = new ListaCurso("Ingenieria de Sistemas");
        
        //Tercer Semestre
        String[] terceroANombres = {"Juan", "Andres", "Mauro", "Adiel", "Laura", "Diego", "Julia", "Carolina"};
        String[] terceroAMaterias = {"ESTRUCTURA DE DATOS I", "PROGRAMACION II", "ANALISIS Y DISEÑO DE SISTEMAS BASADOS EN MICROPROCESADORES", "ECUACIONES DIFERENCIALES", "VARIABLE COMPLEJA", "ESTADISTICA II", "METODOLOGIA DE INVESTIGACION", "MATERIA MILITAR"};
        Double[][] terceroANotas = {{5.1, 5.3, 4.3, 3.2, 10.0, 3.2, 3.2, 8.4}, {7.5, 3.2, 10.0, 3.2, 3.2, 3.2, 3.2, 8.4}, {6.0, 7.2, 8.5, 9.1, 6.7, 8.8, 7.4, 6.9}, {9.5, 7.2, 8.5, 9.1, 6.7, 8.8, 7.4, 6.9}, {8.0, 7.0, 6.5, 8.0, 7.5, 8.0, 9.0, 7.0}, {9.0, 7.0, 7.5, 8.0, 7.5, 8.0, 9.0, 7.0}, {6.5, 8.5, 8.0, 7.5, 9.0, 7.5, 7.0, 8.5}, {7.0, 8.5, 8.0, 7.5, 9.0, 7.5, 7.0, 8.5}};
        Curso terceroA = new Curso("Tercero A",terceroANombres,terceroAMaterias,terceroANotas);
        
        //Cuarto Semestre
        String[] cuartoANombres = {"Dennis", "Laura", "Diego", "Sofia", "Julian", "Carla"};
        String[] cuartoAMaterias = {"ESTRUCTURA DE DATOS II", "BASE DE DATOS I", "METODOS NUMERICOS", "PROGRAMACION AVANZADA", "INGENIERIA DE SISTEMAS", "INVESTIGACION OPERATIVA I", "ECONOMIA PARA LA INGENIERIA", "MATERIA MILITAR"};
        Double[][] cuartoANotas = {{7.5, 9.0, 6.5, 7.5, 9.0, 6.5, 3.2, 4.2}, {8.5, 7.2, 9.5, 8.1, 7.7, 8.8, 9.4, 6.9}, {6.0, 7.2, 8.5, 9.1, 6.7, 8.8, 7.4, 6.9}, {9.0, 8.5, 7.0, 9.5, 8.0, 8.7, 6.4, 7.2}, {8.0, 7.5, 9.2, 6.8, 7.0, 8.6, 8.3, 7.8}, {9.5, 9.0, 8.5, 9.0, 9.0, 8.5, 9.5, 10.0}};
        Curso cuartoA = new Curso ("Cuarto A",cuartoANombres, cuartoAMaterias,cuartoANotas);
        
        //Quinto Semestre
        String[] quintoANombres = {"Jesus", "Maria", "Pedro", "Ana", "Carlos", "Isabel"};
        String[] quintoAMaterias = {"ANALISIS Y DISEÑO DE SISTEMAS I", "TALLER DE PROGRAMACION", "BASE DE DATOS II", "REDES DE COMPUTADORAS", "INTELIGENCIA ARTIFICIAL I", "INVESTIGACION OPERATIVA II", "MATERIA MILITAR"};
        Double[][] quintoANotas = {{7.5, 6.5, 7.5, 9.0, 6.5, 3.2, 4.2}, {9.0, 8.0, 8.5, 7.0, 8.5, 9.0, 9.5}, {8.0, 7.5, 9.0, 8.0, 7.5, 8.0, 8.5}, {7.5, 8.5, 7.0, 8.5, 9.0, 7.5, 8.0}, {8.0, 7.0, 8.5, 7.5, 9.5, 8.0, 7.5}, {9.0, 8.5, 9.0, 9.5, 9.0, 9.5, 10.0}};
        Curso quintoA = new Curso ("Quinto A",quintoANombres, quintoAMaterias,quintoANotas);
        
        //Sexto Semestre
        String[] sextoANombres = {"Pablo", "Juan", "Luis", "Sofia", "Marta", "David"};
        String[] sextoAMaterias = {"ANALISIS Y DISEÑO DE SISTEMAS II", "BASE DE DATOS III", "REDES DE COMPUTADORAS II", "ADMINISTRACION DE SISTEMAS OPERATIVOS Y SERVIDORES", "INTELIGENCIA ARTIFICIAL II", "INTERNET DE LAS COSAS", "MATERIA MILITAR"};
        Double[][] sextoANotas = {{7.5, 9.0, 6.5, 9.0, 6.5, 3.2, 4.2}, {3.2, 8.0, 7.5, 10.0, 6.5, 3.2, 4.6}, {9.0, 8.5, 8.0, 8.0, 7.5, 9.0, 9.5}, {7.5, 8.5, 9.0, 7.0, 8.5, 8.0, 8.5}, {8.0, 7.0, 8.5, 7.5, 9.5, 8.0, 7.5}, {9.0, 8.5, 9.0, 9.5, 9.0, 9.5, 10.0}};
        Curso sextoA = new Curso ("Sexto A",sextoANombres, sextoAMaterias,sextoANotas);
        
        //Septimo Semestre
        String[] septimoANombres = {"Dorian", "Melvin", "Jorge", "Maria", "Ana", "Diego"};
        String[] septimoAMaterias = {"ANALISIS Y DISEÑO DE SISTEMAS II", "BASE DE DATOS III", "REDES DE COMPUTADORAS II", "ADMINISTRACION DE SISTEMAS OPERATIVOS Y SERVIDORES", "INTELIGENCIA ARTIFICIAL II", "INTERNET DE LAS COSAS", "MATERIA MILITAR"};
        Double[][] septimoANotas = {
        {9.0, 6.5, 7.5, 9.0, 6.5, 3.2, 4.2},
        {8.0, 6.5, 7.5, 10.0, 6.5, 3.2, 4.6},
        {7.5, 8.0, 6.5, 9.0, 7.5, 4.2, 4.0},
        {6.5, 7.0, 8.5, 8.0, 9.0, 6.5, 4.5},
        {9.0, 7.5, 7.5, 8.0, 8.5, 3.2, 4.0},
        {7.5, 9.0, 6.5, 7.0, 8.0, 4.0, 4.0}
        };
        Curso septimoA = new Curso ("Septimo A",septimoANombres, septimoAMaterias,septimoANotas);
        
        //Octavo Semestre
        String [] octavoANombres = {"Alvaro","Jasmin","Dilan"};
        String [] octavoAMaterias={"INGENIERIA DE SOFTWARE II","REINGENIERIA DE SISTEMAS ","ROBOTICA ","INFORMATICA FORENSE","PREPARACION Y EVALUACION DE PROYECTOS ","PRACTICA EMPRESARIAL","MATERIA MILITAR"};
        Double [][] octavoANotas={{7.2,6.5,7.5,9.0,2.5,7.2,4.2},{8.0,6.5,7.5,10.0,8.5,3.2,4.6},{6.4,7.0,6.2,7.5,1.0,3.1,4.6}};
        Curso octavoA = new Curso ("Octavo A",octavoANombres, octavoAMaterias,octavoANotas);
        
        //Noveno Semestre
        String [] novenoANombres = {"Augusto","Hugo", "Maria", "Jose", "Carla", "Juan"};
        String [] novenoAMaterias={"TALLER DE TICS Y SOFTWARE","AUDITORIA DE SISTEMAS ","TALLER DE GRADO I ","MATERIA MILITAR"};
        Double [][] novenoANotas={{7.5,10.0,8.5,3.2},{3.5,3.0,3.3,3.1},{9.0,8.5,9.5,4.5},{6.5,7.0,8.5,3.5},{5.5,6.5,9.5,4.0},{8.5,7.5,8.0,2.5}};
        Curso novenoA = new Curso ("Noveno A",novenoANombres, novenoAMaterias,novenoANotas);
        
        //Decimo Semestre
        String [] decimoANombres = {"Alejo","Hugo", "Gabriela", "Diego", "Laura", "Sofia"};
        String [] decimoAMaterias={"TALLER DE MODELACION Y SIMULACION","ADMINISTRACION Y DIRECCION DE OPERACIONES ","TALLER DE GRADO II ","MATERIA MILITAR"};
        Double [][] decimoANotas={{10.0,8.0,6.5,7.5},{8.4,7.0,6.3,7.5},{9.2,8.1,7.5,9.0},{7.8,6.7,8.2,7.3},{8.9,9.1,7.3,8.0},{6.5,7.5,8.0,7.0}};
        Curso decimoA = new Curso ("Decimo A",decimoANombres, decimoAMaterias,decimoANotas);
        
        IngDeSistemas.agregarCurso(terceroA);
        IngDeSistemas.agregarCurso(cuartoA);      
        IngDeSistemas.agregarCurso(quintoA);
        IngDeSistemas.agregarCurso(sextoA);  
        IngDeSistemas.agregarCurso(septimoA);
        IngDeSistemas.agregarCurso(octavoA);  
        IngDeSistemas.agregarCurso(novenoA); 
        IngDeSistemas.agregarCurso(decimoA);
        
        while(true)
        {
            int x;
            System.out.println("\t\tMENU PRINCIPAL");
            System.out.println("1. Cursos");
            System.out.println("2. Estudiantes");
            System.out.println("3. Notas");
            System.out.println("4. Notas matriz");
            System.out.println("5. Cuadro de Honor");
            System.out.println("6. Cuadro de Honor matriz");
            System.out.println("7. Agregar curso");
            x=leer.nextInt();
            switch(x)
            {
                case 1: IngDeSistemas.mostrarCursos();
                        System.out.println("Ingrese el numero del curso");
                        int numCurso=leer.nextInt();
                        boolean condicion=true;
                        while (condicion)
                        {
                            System.out.println("\t MENU CURSO");
                            System.out.println("1. Mostrar estudiantes");
                            System.out.println("2. Mostrar notas");
                            System.out.println("3. Mostrar notas matriz");
                            System.out.println("4. Mostrar cuadro de honor");
                            System.out.println("5. Mostrar cuadro do honor matriz");
                            System.out.println("6. Salir");
                            int y;
                            y=leer.nextInt();
                            switch(y)
                            {
                                case 1: IngDeSistemas.recorrer(numCurso).mostrarEstudiantes();
                                break; 
                                case 2: IngDeSistemas.recorrer(numCurso).mostrarNotas();
                                break;
                                case 3: IngDeSistemas.recorrer(numCurso).mostrarNotasMatriz();
                                break;
                                case 4: IngDeSistemas.recorrer(numCurso).mostrarCuadroDeHonor();
                                break;
                                case 5: IngDeSistemas.recorrer(numCurso).mostrarCuadroDeHonorMatriz();
                                break;
                                case 6: condicion=false;
                                break;
                                case 7: IngDeSistemas.eliminarCurso(numCurso);
                                    System.out.println("Se quito el curso exitosamente :D");
                                    condicion=false;
                                break;
                                default: System.out.println("Ingrese un dato del indice");
                            }
                        }
                break;
                case 2: IngDeSistemas.mostrarEstudiantes();
                break;
                case 3: IngDeSistemas.mostrarNotas();
                break;
                case 4: IngDeSistemas.mostrarNotasMatriz();
                break;
                case 5: IngDeSistemas.listaMostrarCuadroDeHonor();
                break;
                case 6: IngDeSistemas.listaMostrarCuadroDeHonorMatriz();
                break;
                case 7: IngDeSistemas.agregarCurso();
                break;
                default: System.out.println("Ingrese un dato del indice");
            }
        }
        
        //IngDeSistemas.mostrarNotas();
    }
}

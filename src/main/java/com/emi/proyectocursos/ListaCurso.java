/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.emi.proyectocursos;
import java.util.Scanner;
/**
 *
 * @author HELEN Y LOS INSANOS
 */
public class ListaCurso {
    Curso l1;
    String nCarrera;
    int total;
    Scanner leer = new Scanner(System.in);
    
    public ListaCurso()
    {
        l1=null;
        System.out.println("Ingrese el nombre de la carrera: ");
        nCarrera=leer.nextLine();
        total=0;
    }
    
    public ListaCurso(String nombreC)
    {
        l1=null;
        nCarrera=nombreC;
        total=0;
    }
    
    public void agregarCurso()
    {
        Curso nuevo = new Curso();
        Curso actual=l1;
        if(l1==null)
        {
            l1=nuevo;
            actual=l1;
        }
        else
        {
            while(actual.siguiente!=null)
            {
                actual=actual.siguiente;
            }
            actual.siguiente=nuevo;
        }
        total++;
    }
    
    public void agregarCurso(Curso nuevo)
    {
        Curso actual=l1;
        if(l1==null)
        {
            l1=nuevo;
            actual=l1;
        }
        else
        {
            while(actual.siguiente!=null)
            {
                actual=actual.siguiente;
            }
            actual.siguiente=nuevo;
        }
        total++;
    }
    
    //se cambio mostrar por mostrar estudiantes
    public void mostrarEstudiantes()
    {
        Curso actual=l1;
        System.out.println("\tCarrera: "+this.nCarrera+"\n");
        if(actual!=null)
        {
            while(actual!=null)
            {
                actual.mostrarEstudiantes();
                actual=actual.siguiente;
            }
        }
        else
        {
            System.out.println("NO existen cursos en la carrera");
        }
    }
    
    //se crea el metodo mostrar notas
    public void mostrarNotas()
    {
        Curso actual=l1;
        System.out.println("\t\t\tCarrera: "+this.nCarrera+"\n");
        if(actual!=null)
        {
            while(actual!=null)
            {
                actual.mostrarNotas();
                actual=actual.siguiente;
            }
        }
        else
        {
            System.out.println("NO existen cursos en la carrera");
        }
    }
    
    //se creal el metodo mostrar notas matriz
    public void mostrarNotasMatriz()
    {
        Curso actual=l1;
        System.out.println("\t\t\tCarrera: "+this.nCarrera+"\n");
        if(actual!=null)
        {
            while(actual!=null)
            {
                actual.mostrarNotasMatriz();
                actual=actual.siguiente;
            }
        }
        else
        {
            System.out.println("NO existen cursos en la carrera");
        }
    }
    
    //se crea el metodo mostrar cursos
    public void mostrarCursos()
    {
        Curso actual=l1;
        System.out.println("\t\t\tCarrera: "+this.nCarrera+"\n");
        if(actual!=null)
        {
            while(actual!=null)
            {
                actual.mostrarCurso();
                actual=actual.siguiente;
            }
        }
        else
        {
            System.out.println("NO existen cursos en la carrera");
        }
    }
    
    //se crea el metodo cuadro de honor
    public void listaMostrarCuadroDeHonor()
    {
        Curso actual=l1;
        System.out.println("\t\t\tCarrera: "+this.nCarrera+"\n");
        if(actual!=null)
        {
            while(actual!=null)
            {
                actual.mostrarCuadroDeHonor();
                actual=actual.siguiente;
            }
        }
        else
        {
            System.out.println("NO existen cursos en la carrera");
        }
    }
    
    //se crea cuadro de honor matriz
    public void listaMostrarCuadroDeHonorMatriz()
    {
        Curso actual=l1;
        System.out.println("\t\t\tCarrera: "+this.nCarrera+"\n");
        if(actual!=null)
        {
            while(actual!=null)
            {
                actual.mostrarCuadroDeHonorMatriz();
                actual=actual.siguiente;
            }
        }
        else
        {
            System.out.println("NO existen cursos en la carrera");
        }
    }
    
    //crea el metodo recorrer
    public Curso recorrer(int x)
    {
        Curso actual=l1;
        if(actual!=null)
        {
            while(actual.idCurso!=x)
            {
                actual=actual.siguiente;
            }
        }
        else
        {
            System.out.println("NO existen cursos en la carrera");
        }
        return actual;
    }
    public void eliminarCurso(int x)
    {
        Curso actual=l1;
        Curso sig=l1;
        if(actual!=null)
        {
        if(x!=total && x!=3)
        {
            while(actual.siguiente.idCurso!=x)
            {
                actual=actual.siguiente;
                sig=sig.siguiente;
            }
            sig=sig.siguiente;
            sig=sig.siguiente;
            actual.siguiente=sig;
        }
        else
        {
            if(x==3)
            {
                l1=l1.siguiente;
            }
            else
            {
                while(actual.siguiente.siguiente!=null)
                {
                    actual=actual.siguiente;
                }
                actual.siguiente=null;
            }
        }
        total--;
        }
        else
        {
            System.out.println("NO existen cursos en la carrera");
        }
    }
}

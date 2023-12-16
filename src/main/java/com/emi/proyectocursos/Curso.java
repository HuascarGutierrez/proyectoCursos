package com.emi.proyectocursos;
import java.util.Scanner;

/**
 *
 * @author HELEN Y LOS INSANOS
 */

public final class Curso {
    static int generador=3;
    int idCurso;
    String nombreCurso;
    String [] listado;      //lista de los estudiantes
    String [] materias;     //materias del curos
    Double [] promedio;     // promedios del curso
    Double [][] nota;       //notas del curso
    Curso siguiente; //puntero
    Scanner leer = new Scanner(System.in);
    public Curso()
    {
        String opcion;
        //instancia el nombre del curso
        System.out.println("Ingrese el nombre del curso:");
        this.nombreCurso=leer.nextLine();
        
        //numero de materias del curso
        System.out.println("Ingrese el numero de materias");
        int tam=leer.nextInt();
        
        //instancia del vector materias
        this.materias= new String[tam];
        System.out.println("Ingrese las materias");
        leer.skip("\n");
        for(int i=0;i<tam;i++)
        {            
            System.out.print((i+1)+": ");
            this.materias[i]=leer.nextLine();
        }
        
        //numero de estudiantes
        System.out.println("Ingrese el numero de estudiantes:");
        tam=leer.nextInt(); 

        //instancia del vector listado para estudiantes
        this.listado = new String[tam];

        //ingreso del nombre de los estudiantes
        System.out.print("Ingrese los nombres de los estudiantes del curso:\n");
        leer.skip("\n");
        for(int i=0;i<tam;i++)
        {            
            this.listado[i]=leer.nextLine();
        }
        
        //instancia de la matriz notas
        this.nota = new Double[listado.length][materias.length];
        System.out.println("Desea argegar las notas?    Y/N");
        opcion=leer.nextLine();
        if(opcion.equalsIgnoreCase("Y"))
        {
            this.agregarNotas();
        }
        else
        {
            for(int i=0;i<nota.length;i++)
            {
                for(int j=0;j<nota[i].length;j++)
                {
                    nota[i][j] = 0.0;
                }
            }
        }
        idCurso=generador++;
        this.siguiente = null;
        
        //se instancia el atributo promedio
        this.promedio = new Double[listado.length];
        this.promedio();
    }
    
    public Curso(String nomCurso, String[] nomEstudiantes, String[] nomMaterias,Double[][] notasCurso)
    {
        //se instancian todoas las variables
        this.nombreCurso=nomCurso;
        
        this.listado= new String[nomEstudiantes.length];        
        for(int i=0;i<nomEstudiantes.length;i++)
        {            
            this.listado[i]=nomEstudiantes[i];
        }
        
        this.materias= new String[nomMaterias.length];
        for(int i=0;i<nomMaterias.length;i++)
        {
            this.materias[i]=nomMaterias[i];
        }
        
        this.nota= new Double[nomEstudiantes.length][nomMaterias.length];
        this.agregarNotas(nomEstudiantes.length,nomMaterias.length,notasCurso);
        
        //se instancia el atributo promedio
        this.promedio = new Double[listado.length];
        this.promedio();
        
        idCurso=generador++;
        this.siguiente=null;
    }
    
    //se crea el mostrarCurso
    public void mostrarCurso() {
        System.out.println(idCurso+": "+nombreCurso);
    }
    
    
        //se cambio mostrar por mostrar estudiantes
    public void mostrarEstudiantes()
    {
        System.out.println("(" + idCurso + ") Lista de estudiantes del:   " +this.nombreCurso);
        for(int i=0; i<this.listado.length;i++)
        {
            System.out.println((i+1)+": "+this.listado[i]);
        }
        System.out.println("");
    }
    
    //se agrego mostrar notas
    public void mostrarNotas()
    {
        System.out.println("\tCurso Nro"+idCurso + ": " +this.nombreCurso);
        System.out.println("Lista de estudiantes:");
        String mNotas;
        String mPromedio;
        for(int i=0; i<this.listado.length;i++)
        {
            System.out.println((i+1)+": "+this.listado[i]);
            for(int j=0;j<materias.length;j++)
            {
                mNotas=String.format("\tNotas de %70s =%10.3f/10",materias[j],nota[i][j]);
                System.out.println(mNotas);
            }
            mPromedio = String.format("Promedio: %89.3f/10",promedio[i]);
            System.out.println(mPromedio);
            System.out.println("");
        }
    }
    
    public void mostrarNotasMatriz()
    {
        System.out.println("\tCurso Nro"+idCurso + ": " +this.nombreCurso);
        System.out.println("Lista de estudiantes:\n");
        String mMaterias="\t\t\t\t";
        String mMateria;
        String mPromedio;
        String mNotas;
        for(int i=0; i<this.materias.length;i++)
        {  
            if(materias[i].length()<=30)
            {
                mMateria=String.format("%30s",materias[i]);
            }
            else
            {
                mMateria=String.format("%27s...",materias[i].substring(0, 21));
            }
            mMaterias=mMaterias+mMateria;
        }
        System.out.println(mMaterias+"\t\tPROMEDIO");
        for(int i=0; i<this.listado.length;i++)
        {   mNotas="";
            String mNombre=(i+1)+String.format(": %15s\t", listado[i]);
            for(int j=0;j<materias.length;j++)
            {
                mNotas=mNotas+String.format("%30.3f",nota[i][j]);
            }
            mPromedio = String.format("\t\t\t%5.3f/10",promedio[i]);
            mNombre=mNombre+mNotas+mPromedio;
            System.out.println(mNombre);
            System.out.println("");
        }
    }
    
    //mostrar cuadro de honor
    public void mostrarCuadroDeHonor()
    {
        System.out.println("Las mejores notas de " + nombreCurso + " son:");
        String mHonor;
        for(int i=0;i<3;i++)
        {
            mHonor=String.format((i+1)+" lugar: %80s con el promedio de %8s/10",this.cuadroDeHonor()[0][i],this.cuadroDeHonor()[1][i]);
            System.out.println(mHonor);
        }
        System.out.println("\n");
    }
    
    //se crea el metodo muestra cuadro de honor matriz
    public void mostrarCuadroDeHonorMatriz()
    {
        System.out.println("Las mejores notas de " + nombreCurso + " son:");
        
        String mMaterias="\t\t\t\t";
        String mMateria;
        //String mPromedio;
        String mNotas="";
        for(int i=0; i<this.materias.length;i++)
        {  
            if(materias[i].length()<=30)
            {
                mMateria=String.format("%30s",materias[i]);
            }
            else
            {
                mMateria=String.format("%27s...",materias[i].substring(0, 21));
            }
            mMaterias=mMaterias+mMateria;
        }
        System.out.println(mMaterias+"\t\t\tPROMEDIO");
        
        for(int i=0;i<3;i++)
        {
            mNotas=String.format((i+1)+" lugar: %20s",this.cuadroDeHonor()[0][i]);
            for(int j=0;j<materias.length;j++)
            {
                mNotas=mNotas+String.format("%30s",this.cuadroDeHonor()[2+j][i]);
            }
            mNotas=mNotas+String.format("%30s/10",this.cuadroDeHonor()[1][i]);
            System.out.println(mNotas);
        }
        System.out.println("\n");
    }
    
    public void agregarNotas()
    {
        System.out.println("Agregue las notas del estudiante: ");
        for(int i=0; i<listado.length;i++)
        {
            System.out.println((i+1)+": "+listado[i]);
            for(int j=0;j<materias.length;j++)
            {
                System.out.println("Ingrese la nota de la materia: "+materias[j]);
                String a=leer.nextLine();
                this.nota[i][j]=Double.valueOf(a);
            }
        }
    }
    
    
    public void agregarNotas(int numEstudiantes,int numMaterias,Double[][] notasCurso)
    {
        for(int i=0;i<numEstudiantes;i++)
        {
            for(int j=0;j<numMaterias;j++)
            {
                nota[i][j]=notasCurso[i][j];
            }
        }
    }
    
    public void promedio()
    {
        for(int i=0;i<promedio.length;i++)
        {
            double suma=0;
            for(int j=0;j<materias.length;j++)
            {
                suma+=nota[i][j];
            }
            promedio[i]=suma/materias.length;
        }
    }
    public String[][] cuadroDeHonor()
    {
        double lMenor=-0.1, lMayor=10.1;
        String[][] cHonor = new String[2+materias.length][3];
        int cont=0;
        for(int i=0;i<3;i++)
        {
            int j;
            for(j=0;j<promedio.length;j++)
            {
                if((promedio[j]>lMenor) && (promedio[j]<lMayor))
                {
                    lMenor=promedio[j];
                    cont=j;
                }
            }
            cHonor[0][i]=listado[cont];
            cHonor[1][i]=String.format("%4.3f",promedio[cont]);
            for(int z=0;z<materias.length;z++)
            {
                cHonor[2+z][i]=String.format("%4.3f",nota[cont][z]);
            }
            lMayor=lMenor;
            lMenor=-0.1;
        }
        return cHonor;
    }
}


package Ventana;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Notas {
   //Declaracion de Variables 
    private int nota1, nota2, nota3, nota4;
    private double notaRecuperacion;
/**
 * Meotodo que Obtiene una Nota
 * @param nota1 
 */
    public void setNota1(int nota1) {
       this.nota1=nota1; 
    }
    /**
     * Metodo el cual Retorna la Nota 1
     * @return nota1 
     */
    public int getNota1() {
        return nota1;
    }
    /**
     * Metodo el cual recibe la Nota 2
     * @param nota2 
     */
    public void setNota2(int nota2) {
        this.nota2= nota2;
    }
    /**
     * Metodo el cual regresa la Nota 2
     * @return nota2
     */
    public int getNota2() {
        return nota2;
    }
    /**
     * Metodo el cual Recibe la Nota 3
     * @param nota3 
     */
    public void setNota3(int nota3) {
        this.nota3= nota3;
    }
    /**
     * Metodo el cual retorna la Nota 3
     * @return nota3
     */
    public int getNota3() {
        return nota3;
    }
    /** 
     * Metodo el cual recibe la Nota4
     * @param nota4 
     */
    public void setNota4(int nota4) {
        this.nota4= nota4;
    }
    /**
     * Metodo el cual retorna la Nota 4
     * @return nota4
     */
    public int getNota4() {
        return nota4;
    }
    /**
     * Metodo que calcula el promedio de 4 Notas
     * @return promedio
     */
    public double calcularPromedio() {
        return (nota1 + nota2 + nota3 + nota4) / 4.0;
    }
    /**
     * Metodo que por medio de Condicionales Evalua sobre si un alumno merece recuperacion o no 
     * @return Aprobacion
     */
    public String evaluarAlumno() {
        double promedio = calcularPromedio();
        
       if (promedio >= 61) {
        return "Alumno Aprobado";
    } else if (promedio >= 48 && promedio < 61) {
        return "Tiene derecho a recuperación";
    } else {
        return "El alumno no tiene derecho a recuperación";
    }
}
    
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin7;

import java.util.Scanner;

/**
 *
 * @author Samuel
 */
public class Libro {
   private String libro;
   private String autor;
   private int numExemplaresLibro;
   private int numExemplaresPrestados;
   Scanner ler=new Scanner(System.in);
   
   public Libro(){}
   public Libro(String libro, String autor, int numExemplaresLibro, int numExemplaresPrestados){
   this.autor=autor;
   this.libro=libro;
   this.numExemplaresLibro=numExemplaresLibro;
   this.numExemplaresPrestados=numExemplaresPrestados;
   }
   
   public String darNomLibro(){
       System.out.println("Intoduzca nombre del libro");
       this.libro=ler.next();
       String b=this.libro;
       return b;
       
   }
   public String darNomAutor(){
   System.out.println("Intoduzca nombre del autor");
       this.autor=ler.next();
     String a=this.autor;
      return a;
       
   }
   public int darNumExLibr(){
       System.out.println("Introduzca numero de libros");
       this.numExemplaresLibro=ler.nextInt();
      int c = this.numExemplaresLibro;
      return c;
   }
   public int darNumExPrest(){
       System.out.println("Introduzca numero de emxemplares prestados");
       this.numExemplaresPrestados= ler.nextInt();
               int a =this.numExemplaresPrestados;
                       return a;
   }
   
   public boolean prestamo(){
       if(numExemplaresLibro>0){
     this.numExemplaresLibro = numExemplaresLibro-numExemplaresPrestados;
       System.out.println("Quedan sen prestar "+this.numExemplaresLibro+" libros");
       return true;
       }else{
           System.out.println("No quedan ejemplares");
           return false;
       }
   }
   
   public boolean devolucion(){
       if(numExemplaresPrestados>0){
     this.numExemplaresLibro = numExemplaresPrestados+numExemplaresLibro;
       System.out.println("Quedan prestados "+this.numExemplaresPrestados+" libros");
       return true;
       }else{
           System.out.println("No hay ejemplares prestados");
           return false;
       }
   }
   @Override //esto significa que estoy sobreescribiendo la clase padre
    public String toString(){
   String a = "***Datos del libro***\n Autor: "+autor+"\nTitulo "+libro+"\nLibros disponibles: "+numExemplaresLibro+"\nLibros en prestamo: "+numExemplaresPrestados;
    return a;
    }
   
    
    
    
}

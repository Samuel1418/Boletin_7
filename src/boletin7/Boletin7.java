/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin7;

/**
 *
 * @author Samuel
 */
public class Boletin7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Libro obx=new Libro();
        obx.darNomAutor();
        obx.darNomLibro();
        obx.darNumExLibr();
        obx.darNumExPrest();
        obx.prestamo();
        obx.devolucion();
        System.out.println(obx.toString());
               
                
       
    }
    
}

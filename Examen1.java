/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen1;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class Examen1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lectura = new Scanner(System.in);
        System.out.println("Nombre del instrumento: ");
        String instrumento1 = lectura.nextLine(); 
        
        String precioVenta = "$1250.45";
        
        System.out.println("Precio de compra: ");
        int precioCompra = lectura.nextInt();
        
        double ganancia = (precioVenta - precioCompra);
        double total = (ganancia/precioCompra) * 100;
        System.out.println("El porcentaje de ganancia de " + " es " + total);
        
        lectura.close();
        
        
    }
    
}

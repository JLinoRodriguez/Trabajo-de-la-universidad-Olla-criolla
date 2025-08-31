/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package la.olla.criolla.p.f;

import javax.swing.JOptionPane;

public class Menu {
   String plato;
    private int eleccion;
    double precio_menu;

    public void plato_eleccion() {
        eleccion=0;
        do{
        String entrada = JOptionPane.showInputDialog(
            "DIGITE EL NÚMERO DEL PLATO A ELEGIR:\n" +
            "1. ARROZ CON POLLO (S/9)\n" +
            "2. SOPA SECA (S/12)\n" +
            "3. SECO CON FREJOLES (S/12)\n" +
            "4. LOMO SALTADO (S/10)\n" +
            "5. AJÍ DE GALLINA (S/11)"
        );
        
        eleccion = Integer.parseInt(entrada); 

        if (eleccion < 1 || eleccion > 5) {
            JOptionPane.showMessageDialog(null, "⚠️ Error: Ingrese un número del 1 al 5", "Opción inválida", JOptionPane.ERROR_MESSAGE);
        }
        } while (eleccion < 1 || eleccion > 5);
        
        switch (eleccion) {
            case 1:
                plato = "ARROZ CON POLLO - S/9";
                precio_menu = 9;
                break;
            case 2:
                plato = "SOPA SECA - S/12";
                precio_menu = 12;
                break;
            case 3:
                plato = "SECO CON FREJOLES - S/12";
                precio_menu = 12;
                break;
            case 4:
                plato = "LOMO SALTADO - S/10";
                precio_menu = 10;
                break;
            case 5:
                plato = "AJÍ DE GALLINA - S/11";
                precio_menu = 11;
                break;
        }
    }
}
 

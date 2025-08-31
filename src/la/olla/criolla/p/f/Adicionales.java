/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package la.olla.criolla.p.f;

import javax.swing.JOptionPane;

public class Adicionales {
    String bebidas;                                              
    String adc;                                                    
    private int eleccionadc, eleccionbeb;       
    double precioadc, preciobeb;                  

    public void adicional_eleccionbeb() {
        do{
        eleccionbeb = Integer.parseInt(JOptionPane.showInputDialog(
            "DIGITE EL NÚMERO DEL ADICIONAL A ELEGIR:\n" +
            "1. CHICHA MORADA (S/4)\n" +
            "2. EMOLIENTE (S/4)\n"+
            "3. NINGUNA OPCION"
        ));
        if (eleccionbeb < 1 || eleccionbeb > 3) {
            JOptionPane.showMessageDialog(null, "⚠️ Error: Ingrese un número valido de bebida", "Opción inválida", JOptionPane.ERROR_MESSAGE);
        }
        } while (eleccionbeb < 1 || eleccionbeb > 3);

        switch (eleccionbeb) {
            case 1:
                bebidas = "CHICHA MORADA - S/4";
                preciobeb = 4;
                break;
            case 2:
                bebidas = "EMOLIENTE - S/4";
                preciobeb = 4;
                break;
            case 3 :
                bebidas = "NINGUNA OPCIÓN";
                preciobeb = 0;
                break;
            default:
                throw new AssertionError("Opción inválida");
        }
    }

    public String getBebidas() {
        return bebidas;
    }
    
    public double getPreciobeb() {
        return preciobeb;
    }
    

    public void adicional_eleccionadc() {
        do{
        eleccionadc = Integer.parseInt(JOptionPane.showInputDialog(
            "DIGITE EL NÚMERO DEL ADICIONAL A ELEGIR:\n" +
            "1. HUEVO FRITO (S/3)\n" +
            "2. PAPA A LA HUANCAÍNA (S/6)\n" +
            "3. TAMAL CRIOLLO (S/4)\n" +
            "4. NINGUNA OPCIÓN" 
        ));
        if (eleccionadc < 1 || eleccionadc > 4) {
            JOptionPane.showMessageDialog(null, "⚠️ Error: Ingrese un número valido de adicional", "Opción inválida", JOptionPane.ERROR_MESSAGE);
        }
        } while (eleccionadc < 1 || eleccionadc > 4);
        
        switch (eleccionadc) {
            case 1:
                adc = "HUEVO FRITO - S/3";
                precioadc = 3;
                break;
            case 2:
                adc = "PAPA A LA HUANCAÍNA - S/6";
                precioadc = 6;
                break;
            case 3:
                adc = "TAMAL CRIOLLO - S/4";
                precioadc = 4;
                break;
            case 4:
                adc = "NINGUNA OPCIÓN";
                precioadc = 0;
                break;
            default:
                throw new AssertionError("Opción inválida");
        }
    }

    public String getAdc() {
        return adc;
    }

    public double getPrecioadc() {
        return precioadc;
    }
    
    
    
    
}


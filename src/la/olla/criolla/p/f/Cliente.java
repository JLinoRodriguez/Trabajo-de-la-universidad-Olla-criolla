/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package la.olla.criolla.p.f;

import javax.swing.JOptionPane;


public class Cliente {
    private String nombre;
    private int mesa;


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    
    public void mesaElegida() {
        int numeroMesa = 0;
        
                do {
                    numeroMesa = Integer.parseInt(JOptionPane.showInputDialog("Digite su mesa (1 - 7):"));
                    
                    if (numeroMesa < 1 || numeroMesa > 7) {
                        JOptionPane.showMessageDialog(null, "⚠️ Error: Ingrese un número de mesa valido", "Opción inválida", JOptionPane.ERROR_MESSAGE);
                    }  
                } while (numeroMesa < 1 || numeroMesa > 7);
                
                this.mesa = numeroMesa;
    }
    
    public int getMesa() {
        return mesa;
    }
        
}

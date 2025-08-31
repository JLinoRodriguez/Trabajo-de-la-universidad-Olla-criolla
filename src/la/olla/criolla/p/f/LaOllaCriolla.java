/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package la.olla.criolla.p.f;

import javax.swing.JOptionPane;

public class LaOllaCriolla {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

    Cliente usuario = new Cliente();
    
    
    JOptionPane.showMessageDialog(null, "BIENVENIDO A LA OLLA CRIOLLA", "LA OLLA CRIOLLA", JOptionPane.INFORMATION_MESSAGE);
    
    usuario.setNombre(JOptionPane.showInputDialog("Digite su nombre"));
    usuario.mesaElegida();
    JOptionPane.showMessageDialog(null, "INICIO EXITOSO\nNombre: " + usuario.getNombre() + "\nMesa: " + usuario.getMesa(), "LA OLLA CRIOLLA", JOptionPane.INFORMATION_MESSAGE);

    
    Menu platos = new Menu();    
    platos.plato_eleccion();

    
    Cantidad cant = new Cantidad();
    cant.setCant(Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de platos")));

    
    Adicionales ad = new Adicionales();
    System.out.println("--------------------------------------------");

    ad.adicional_eleccionbeb();
    ad.adicional_eleccionadc();

    JOptionPane.showMessageDialog(null, "Elección exitosa");

    
    Pago pa = new Pago();
    cant.setCodigo(5478931); 

    
    cant.setAd(ad);
    cant.setPa(pa);
    cant.setPlatos(platos);
    pa.setCant(cant);
    pa.setAd(ad);
    pa.MetodoPago();
    cant.setUsuario(usuario);

    
    System.out.println("*****");
    System.out.println("BOLETA DE PAGO");
    cant.mostrar();

    double total = cant.calcularTotal();
    JOptionPane.showMessageDialog(null, "TOTAL A PAGAR: S/" + total);

    System.out.println("*****");

    JOptionPane.showMessageDialog(null, "COMPRA EXITOSA", "LA OLLA CRIOLLA", JOptionPane.INFORMATION_MESSAGE);
}

    }
    


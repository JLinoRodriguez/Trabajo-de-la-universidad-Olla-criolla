/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package la.olla.criolla.p.f;

import javax.swing.JOptionPane;

public class Pago {
   private double pfinal;
    private Adicionales ad;
    private Menu platos;
    private Cantidad cant;
    private int metodo;
    private int tarjeta;
    String meto;

    public double getPfinal() {
        return pfinal;
    }

    public void setPfinal(double pfinal) {
        this.pfinal = pfinal;
    }

    public Adicionales getAd() {
        return ad;
    }

    public void setAd(Adicionales ad) {
        this.ad = ad;
    }

    public Menu getPlatos() {
        return platos;
    }

    public void setPlatos(Menu platos) {
        this.platos = platos;
    }

    public Cantidad getCant() {
        return cant;
    }

    public void setCant(Cantidad cant) {
        this.cant = cant;
    }

    public int getMetodo() {
        return metodo;
    }

    public void setMetodo(int metodo) {
        this.metodo = metodo;
    }
    
    public void MetodoPago() {
        do{
        metodo = Integer.parseInt(JOptionPane.showInputDialog(
            "DIGITE EL MÉTODO DE PAGO:\n" +
            "1. TARJETA\n" +
            "2. EFECTIVO"
        ));
        if (metodo < 1 || metodo > 2) {
            JOptionPane.showMessageDialog(null, "⚠️ Error: Ingresa una opción valida", "Opción inválida", JOptionPane.ERROR_MESSAGE);
        }
        } while (metodo < 1 || metodo > 2);

        switch (metodo) {
            case 1:
                tarjeta = Integer.parseInt(JOptionPane.showInputDialog(
                    "TIPO DE TARJETA:\n" +
                    "1. CRÉDITO\n" +
                    "2. DÉBITO"
                ));
                if (tarjeta == 1) {
                    meto = "TARJETA DE CRÉDITO";
                } else if (tarjeta == 2) {
                    meto = "TARJETA DE DÉBITO";
                } else {
                    meto = "TARJETA DESCONOCIDA";
                }
                break;

            case 2:
                meto = "EFECTIVO";
                break;

            default:
                meto = "NO DEFINIDO";
                JOptionPane.showMessageDialog(null, "Método no válido.");
        }
    }
}
 
    






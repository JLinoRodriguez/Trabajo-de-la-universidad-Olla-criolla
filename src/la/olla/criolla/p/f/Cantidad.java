/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package la.olla.criolla.p.f;

import javax.swing.JOptionPane;

public class Cantidad {
   
   private String plato;
   private double precio;
   private int codigo;
   private int cant;
   private Menu platos;
   private Cliente usuario;
   private Adicionales  ad;
   private Pago pa;
      
    public void mostrar() {
    String boleta = "***** BOLETA DE PAGO *****\n"
            + "Nombre: " + getUsuario().getNombre() + "\n"
            + "Mesa: " + getUsuario().getMesa() + "\n"
            + "Código: " + getCodigo() + "\n"
            + "Plato: " + getPlatos().plato + "\n"
            + "Cantidad de plato: " + getCant() + "\n"
            + "Adicional: " + getAd().getAdc() + "\n"
            + "Bebida: " + getAd().getBebidas() + "\n"
            + "Método de pago: " + getPa().meto + "\n"
            + "Subtotal platos: S/" + (getPlatos().precio_menu * cant) + "\n"
            + "Subtotal adicional y bebida: S/" + (getAd().getPrecioadc() + getAd().getPreciobeb()) + "\n"
            + "Total a pagar: S/" + calcularTotal() + "\n"
            + "*****************************";

    JOptionPane.showMessageDialog(null, boleta, "BOLETA DE PAGO", JOptionPane.INFORMATION_MESSAGE);
}
    public double calcularTotal() {
    double subtotal = (platos.precio_menu * cant);
    double total = subtotal + ad.getPreciobeb() + ad.getPrecioadc();
    System.out.println("Subtotal por plato: S/" + subtotal);
    System.out.println("Cantidad: " + cant);
    System.out.println("Subtotal adicional y bebida: S/."+(ad.getPreciobeb() + ad.getPrecioadc()));
    System.out.println("Total a pagar: S/" + total);
    return total;
}
    

        public String getPlato() {
            return plato;
        }

        public void setPlato(String plato) {
            this.plato = plato;
        }

        public double getPrecio() {
            return precio;
        }

        public void setPrecio(double precio) {
            this.precio = precio;
        }

        public int getCodigo() {
            return codigo;
        }

        public void setCodigo(int codigo) {
            this.codigo = codigo;
        }

        public int getCant() {
            return cant;
        }

        public void setCant(int cant) {
            this.cant = cant;
        }

        public Menu getPlatos() {
            return platos;
        }

        public void setPlatos(Menu platos) {
            this.platos = platos;
        }

        public Cliente getUsuario() {
            return usuario;
        }

        public void setUsuario(Cliente usuario) {
            this.usuario = usuario;
        }

        public Adicionales getAd() {
            return ad;
        }

        public void setAd(Adicionales ad) {
            this.ad = ad;
        }

        public Pago getPa() {
            return pa;
        }

        public void setPa(Pago pa) {
            this.pa = pa;
        }
        
 }


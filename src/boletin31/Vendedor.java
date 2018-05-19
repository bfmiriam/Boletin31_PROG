
package boletin31;

import java.util.ArrayList;


public class Vendedor extends Empregado{
    
    private Coche coche;
    private String movil;
    private String areaVenta;
    private ArrayList <String> listaClientes;
    private int porcentaxe;

    public Vendedor() {
    }


    public Vendedor(Coche coche, String movil, String areaVenta, int porcentaxe, String nome, String apelidos, String dni, String direccion, String telefono, int anosAntiguedade, float salario, String supervisor) {
        super(nome, apelidos, dni, direccion, telefono, anosAntiguedade, salario, supervisor);
        this.coche = coche;
        this.movil = movil;
        this.areaVenta = areaVenta;
        this.porcentaxe = porcentaxe;
    }

    @Override
    public String toString() {
        return "Vendedor--> "+super.toString() + ", coche: " + coche + ", movil: " + movil + ", areaVenta: " + areaVenta + ", porcentaxe: " + porcentaxe;
    }
    
    

    @Override
    public void incrementarSalario() {
       float saldo = (float) (super.getSalario() +(0.1 * super.getAnosAntiguedade()));
       System.out.println(saldo+" €");
    }

    @Override
    public void imprimir() {
        System.out.println(toString());
    }
    public void altaCliente(String cliente){
        listaClientes.add(cliente);
    }
    public void baixaCliente(String cliente){
        listaClientes.remove(cliente);
    }
    public void cambiarCoche(Coche nuevo){
        coche= nuevo;
    }
}

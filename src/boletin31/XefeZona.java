
package boletin31;

import java.util.ArrayList;


public class XefeZona extends Empregado {
    
    private String despacho;
    private Secretario secretario;
    private ArrayList<Vendedor> vendedores;
    private Coche coche;

    public XefeZona() {
    }


    public XefeZona(String despacho, Secretario secretario, Coche coche, String nome, String apelidos, String dni, String direccion, String telefono, int anosAntiguedade, float salario, String supervisor) {
        super(nome, apelidos, dni, direccion, telefono, anosAntiguedade, salario, supervisor);
        this.despacho = despacho;
        this.secretario = secretario;
        this.coche = coche;
    }

    @Override
    public String toString() {
        return "Xefe de Zona--> "+super.toString() + ", despacho: " + despacho + ", secretario: " + secretario + ", coche: " + coche;
    }
    
    
    @Override
    public void incrementarSalario() {
       float saldo = (float) (super.getSalario()+(0.2 * super.getAnosAntiguedade()));
        System.out.println(saldo+" €");
    }

    @Override
    public void imprimir() {
        System.out.println(toString());
    }
    public void cambiarSecretario(Secretario novoSecretario){
        secretario = novoSecretario;
    }
    public void CambiarCoche(Coche novoCoche){
        coche = novoCoche;
    }
    public void altaVendedor(Vendedor novoVendedor){
        vendedores.add(novoVendedor);
    }
    public void baixaVendedor(Vendedor borrarVendedor){
        vendedores.remove(borrarVendedor);
    }  
}

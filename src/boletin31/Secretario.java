
package boletin31;


public class Secretario extends Empregado {
    
    private String despacho,fax;

    public Secretario() {
    }

    public Secretario(String despacho, String fax, String nome, String apelidos, String dni, String direccion, String telefono, int anosAntiguedade, float salario, String supervisor) {
        super(nome, apelidos, dni, direccion, telefono, anosAntiguedade, salario, supervisor);
        this.despacho = despacho;
        this.fax = fax;
    }

    @Override
    public String toString() {
        return "Secretario--> "+super.toString() + ", despacho: " + despacho + ", fax: " + fax;
    }

    @Override
    public void incrementarSalario() {
        float saldo = (float) (super.getSalario() + (0.05 * super.getAnosAntiguedade()));
        System.out.println(saldo+" €");
    }

    @Override
    public void imprimir() {
        System.out.println(toString());
    }
    
    
}

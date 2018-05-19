
package boletin31;


public abstract class Empregado {
    
    private String nome, apelidos, dni, direccion,telefono;
    private int anosAntiguedade;
    private float salario;
    private String supervisor;

    public Empregado() {
    }

    public Empregado(String nome, String apelidos, String dni, String direccion, String telefono, int anosAntiguedade, float salario, String supervisor) {
        this.nome = nome;
        this.apelidos = apelidos;
        this.dni = dni;
        this.direccion = direccion;
        this.telefono = telefono;
        this.anosAntiguedade = anosAntiguedade;
        this.salario = salario;
        this.supervisor = supervisor;
    }

    public String getNome() {
        return nome;
    }

    public String getApelidos() {
        return apelidos;
    }

    public String getDni() {
        return dni;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public int getAnosAntiguedade() {
        return anosAntiguedade;
    }

    public float getSalario() {
        return salario;
    }

    public String getSupervisor() {
        return supervisor;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setApelidos(String apelidos) {
        this.apelidos = apelidos;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setAnosAntiguedade(int anosAntiguedade) {
        this.anosAntiguedade = anosAntiguedade;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public void setSupervisor(String supervisor) {
        this.supervisor = supervisor;
    }

    @Override
    public String toString() {
        return  "nome: " + nome + ", apelidos: " + apelidos + ", dni: " +
                dni + ", direccion: " + direccion + ", telefono: " + telefono +
                ", anosAntiguedade: " + anosAntiguedade + ", salario: " + salario +
                ", supervisor: " + supervisor;
    }
    public abstract void incrementarSalario();
    
    public abstract void imprimir();

    
    public void cambiarSupervisor(){
        
    }
}

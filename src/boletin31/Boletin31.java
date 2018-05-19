
package boletin31;

import java.util.ArrayList;
import java.util.List;


public class Boletin31 {


    public static void main(String[] args) {
        
        List<Empregado> empregados = new ArrayList();
        
        Empregado secretario = new Secretario("Despacho 1","66788654","Pedro","Aguiar Lopez",
                "333454","Calle Bolivia","986334454",2,750,"Juan");
        Empregado vendedor = new Vendedor(new Coche("346744K","Renault","Megane"),"66753343",
                "Area 1",50,"Saul","Perez Breogan","45656756S","Calle Urzaiz","98645232",12,970,"Pedro");
        Empregado xefezona = new XefeZona("Despacho 3",new Secretario("Despacho 1","66788654",
                "Pedro","Aguiar Lopez","333454","Calle Bolivia","986334454",2,750,"Juan"),new Coche("346744K"
                        ,"Renault","Megane"),"Sara","Veiga Vila","345556L","Calle Principe","9786453",20,1100,"Iris");
        
        
        empregados.add(secretario);
        empregados.add(vendedor);
        empregados.add(xefezona);
        
       secretario.imprimir();
       vendedor.imprimir();
       xefezona.imprimir();
       secretario.incrementarSalario();
       vendedor.incrementarSalario();
       xefezona.incrementarSalario();
    }
    
}

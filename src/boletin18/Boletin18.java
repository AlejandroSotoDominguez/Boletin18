
package boletin18;

import java.util.ArrayList;

public class Boletin18 {

    public static void main(String[] args) {
        Buzon buzon1 = new Buzon();
        Correos correo1 = new Correos("mensaje1",false);
        Correos correo2 = new Correos("mensaje2",false);
        Correos correo3 = new Correos("mensaje3",false);
        buzon1.engade(correo1);
        buzon1.engade(correo2);
        buzon1.engade(correo3);
        System.out.println(buzon1.numeroDeCorreos());
        System.out.println(buzon1.porLer());   
        System.out.println(buzon1.amosaPrimerNoLeido());
        System.out.println(buzon1.amosa());
        buzon1.elimina();
        
    }
    
}

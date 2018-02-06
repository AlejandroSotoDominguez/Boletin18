
package boletin18;

import java.util.ArrayList;

public class Buzon {
    ArrayList<Correos>correo=new ArrayList();
    
    public int numeroDeCorreos(){
        return correo.size();
    }
    
    public void engade(Correos c){
        correo.add(c);
    }
    
    public boolean porLer(){ 
        boolean nonLido = false;
        for(int i=0;i<correo.size();i++){
            if(correo.get(i).getLido()==false){
                nonLido=true;
            }
        }
        return nonLido;
    }
    
    public String amosaPrimerNoLeido(){
        String primerNoLido = null;
        for(int i=0;i<correo.size();i++){
            if(correo.contains(i)==false){
                primerNoLido = correo.get(i).getContidoCorreo();
            }
            break;
        }
        return primerNoLido;
    }
    

}

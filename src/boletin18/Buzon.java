
package boletin18;

import java.util.ArrayList;
import javax.swing.JOptionPane;

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
    
    public String amosa(){
        int resposta;
        do{
            resposta = Integer.parseInt(JOptionPane.showInputDialog("Introduce un correo a mostrar"));     
        }
        while(resposta>correo.size());
         
        return correo.get(resposta-1).getContidoCorreo();
    }
    
    public void elimina(){
        int resposta;
        do{
            resposta = Integer.parseInt(JOptionPane.showInputDialog("Introduce un correo a eliminar"));
            correo.remove(resposta-1);
        }while(resposta<0);
        
        for(int i=0;i<correo.size();i++){
            System.out.println(correo.get(i).getContidoCorreo());
        }
        
        
    }

}

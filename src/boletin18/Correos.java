
package boletin18;

public class Correos {
    private String contidoCorreo;
    private boolean lido;

    public Correos() {
    }

    public Correos(String contidoCorreo, boolean lido) {
        this.contidoCorreo = contidoCorreo;
        this.lido = lido;
    }

    public String getContidoCorreo() {
        return contidoCorreo;
    }

    public void setContidoCorreo(String contidoCorreo) {
        this.contidoCorreo = contidoCorreo;
    }

    public boolean getLido() {
        return lido;
    }

    public void setLido(boolean lido) {
        this.lido = lido;
    }

    @Override
    public String toString() {
        return "contidoCorreo: " + contidoCorreo + ", lido: " + lido;
    }
    
    
}

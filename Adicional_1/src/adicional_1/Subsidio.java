/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adicional_1;

/**
 *
 * @author Lucas Arrigoni
 */
public class Subsidio {
    
    private double monto;
    private String motivo;
    private boolean otorgado;
    
    public Subsidio(double monto, String motivo) {
        this.monto = monto;
        this.motivo = motivo;
        otorgado = false;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public boolean isOtorgado() {
        return otorgado;
    }

    public void setOtorgado(boolean otorgado) {
        this.otorgado = otorgado;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema5;

public abstract class Figura {

    private String colorRelleno;
    private String colorLinea;

    public Figura(String unCR, String unCL) {
        setColorRelleno(unCR);
        setColorLinea(unCL);
    }

    @Override
    public String toString() {
        String aux = "Area: " + this.calcularArea()
                + " CR: " + getColorRelleno()
                + " CL: " + getColorLinea();
        return aux;
    }

    public String getColorRelleno() {
        return colorRelleno;
    }

    public String getColorLinea() {
        return colorLinea;
    }
    
    public void setColorRelleno(String unColor) {
        colorRelleno = unColor;
    }

    public void setColorLinea(String unColor) {
        colorLinea = unColor;
    }

    public abstract double calcularArea();

    public abstract double calcularPerimetro();
}

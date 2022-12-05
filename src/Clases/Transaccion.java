package Clases;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USUARIO
 */
public class Transaccion {
    private Cuenta cuenta;
    private int cuotas;
    private double credito;
    private boolean pagado;

    public Transaccion(Cuenta cuenta, int cuotas, double credito, boolean pagado) {
        this.cuenta = cuenta;
        this.cuotas = cuotas;
        this.credito = credito;
        this.pagado = pagado;
    }
    public Transaccion(){}

    public Cuenta getCuenta() {
        return cuenta;
    }

    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }

    public int getCuotas() {
        return cuotas;
    }

    public void setCuotas(int cuotas) {
        this.cuotas = cuotas;
    }

    public double getCredito() {
        return credito;
    }

    public void setCredito(double credito) {
        this.credito = credito;
    }

    public boolean isPagado() {
        return pagado;
    }

    public void setPagado(boolean pagado) {
        this.pagado = pagado;
    }

    @Override
    public String toString() {
        return "Transaccion{" + "cuenta=" + cuenta + ", cuotas=" + cuotas + ", credito=" + credito + ", pagado=" + pagado + '}';
    }
    
}

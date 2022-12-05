package Clases;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USUARIO
 */
public class Cuenta {
    private Cliente cliente;
    private long numeroTarj;
    private String FechaVenc;
    private int codigo;

    public Cuenta(Cliente cliente, long numeroTarj, String FechaVenc, int codigo    ) {
        this.cliente = cliente;
        this.numeroTarj = numeroTarj;
        this.FechaVenc = FechaVenc;
        this.codigo = codigo;
    }
    public Cuenta(){}

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public long getNumeroTarj() {
        return numeroTarj;
    }

    public void setNumeroTarj(long numeroTarj) {
        this.numeroTarj = numeroTarj;
    }

    public String getFechaVenc() {
        return FechaVenc;
    }

    public void setFechaVenc(String FechaVenc) {
        this.FechaVenc = FechaVenc;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Cuenta{" + "cliente=" + cliente + ", numeroTarj=" + numeroTarj + ", FechaVenc=" + FechaVenc + ", codigo=" + codigo + '}';
    }
    
}

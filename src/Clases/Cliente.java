package Clases;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USUARIO
 */
public class Cliente {

    public Cliente(String prenombre, String apellidos, String LugarNaci, String fechaNac, String sexo, String estadoCivil, String GradoInstruc, long DNI) {
        this.prenombre = prenombre;
        this.apellidos = apellidos;
        this.LugarNaci = LugarNaci;
        this.fechaNac = fechaNac;
        this.sexo = sexo;
        this.estadoCivil = estadoCivil;
        this.GradoInstruc = GradoInstruc;
        this.DNI = DNI;
    }
    public Cliente(){}
    private String prenombre,apellidos,LugarNaci,fechaNac,sexo,estadoCivil,GradoInstruc;
    private long DNI;

    public String getPrenombre() {
        return prenombre;
    }

    public void setPrenombre(String prenombre) {
        this.prenombre = prenombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getLugarNaci() {
        return LugarNaci;
    }

    public void setLugarNaci(String LugarNaci) {
        this.LugarNaci = LugarNaci;
    }

    public String getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(String fechaNac) {
        this.fechaNac = fechaNac;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getGradoInstruc() {
        return GradoInstruc;
    }

    public void setGradoInstruc(String GradoInstruc) {
        this.GradoInstruc = GradoInstruc;
    }

    public long getDNI() {
        return DNI;
    }

    public void setDNI(long DNI) {
        this.DNI = DNI;
    }

    @Override
    public String toString() {
        return "Cliente{" + "prenombre=" + prenombre + ", apellidos=" + apellidos + ", LugarNaci=" + LugarNaci + ", fechaNac=" + fechaNac + ", sexo=" + sexo + ", estadoCivil=" + estadoCivil + ", GradoInstruc=" + GradoInstruc + ", DNI=" + DNI + '}';
    }
    
}

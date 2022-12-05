package Clases;

import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.LinkedList;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USUARIO
 */
public class leerArchivo {
    private String nombre;
 
    public leerArchivo(String nombre) {
        this.nombre = nombre;
    }
    public LinkedList<String> obtenerTextoDelArchivo() {
        LinkedList<String> lineasDeTexto=new LinkedList();
        try {         
            File archivo = obtenerArchivo();     
            if (archivo.exists()) {
                lineasDeTexto=new LinkedList();
                BufferedReader br = new BufferedReader(new FileReader(archivo));
                String linea;
                
                while ((linea = br.readLine()) != null) {
                    lineasDeTexto.add(linea);
                }
                br.close();
            } else {
                JOptionPane.showMessageDialog(null, "El archivo de texto no existe");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Se produjo un Error ");
        }
        return lineasDeTexto;
    }
    private File obtenerArchivo() {       
        try {
            URL url = getClass().getClassLoader().getResource("archivos/"+nombre);
            return new File(url.toURI());            
        } catch (URISyntaxException ex) {
            ex.printStackTrace();
            return null;
        }
    }
    public void ActualizarCuenta(LinkedList<Cuenta> Lista) {
        try{    
        nombre="cuenta.txt";
            File t = obtenerArchivo();

                FileWriter fw = new FileWriter(t);
                PrintWriter pw = new PrintWriter(fw);
                for (int i = 0; i < Lista.size(); i++) {
                    long numeroTarj = Lista.get(i).getNumeroTarj();
                    String FechaVenc = Lista.get(i).getFechaVenc();
                    
                    int codigo = Lista.get(i).getCodigo();
                    pw.println(Lista.get(i).getCliente().getDNI()+";"
                            +numeroTarj+";"+FechaVenc+";"+codigo);
                }              
                fw.close();
        }catch(Exception e)
        {JOptionPane.showInputDialog(e.getMessage()+"AC");
            
        }

        }
    public void ActualizarCliente(LinkedList<Cliente> Lista) {
        try{    
        nombre="cliente.txt";
            File t = obtenerArchivo();

                FileWriter fw = new FileWriter(t);
                PrintWriter pw = new PrintWriter(fw);
                for (int i = 0; i < Lista.size(); i++) {
                    String prenombre=Lista.get(i).getPrenombre();
                    String apellidos=Lista.get(i).getApellidos();
                    String lugar=Lista.get(i).getLugarNaci();
                    String fecha=Lista.get(i).getFechaNac();
                    String sexo=Lista.get(i).getSexo();
                    String estado=Lista.get(i).getEstadoCivil();
                    String grado=Lista.get(i).getGradoInstruc();
                    long dni=Lista.get(i).getDNI();
                    pw.println(prenombre+";"+apellidos+";"+lugar+";"+fecha+";"+sexo+";"+estado
                            +";"+grado+";"+dni);
                }              
                fw.close();
         }catch(Exception e)
        {JOptionPane.showInputDialog(e.getMessage()+"AC");
            
        }
        }
    public LinkedList<Cliente> obtenerCliente(){
    nombre="cliente.txt";
    LinkedList<Cliente> cliente=new LinkedList();
    LinkedList<String> a=obtenerTextoDelArchivo();
    if(a.size()!=0){
           
            for(int i=0;i<a.size();i++){
                //JOptionPane.showInputDialog(a.get(i)+" "+a.size());
                String linea=a.get(i);
                StringTokenizer tokens=new StringTokenizer(linea,";");
                //String codigo=tokens.nextToken();
                String prenombre=tokens.nextToken();
                    String apellidos=tokens.nextToken();
                    String lugar=tokens.nextToken();
                    String fecha=tokens.nextToken();
                    String sexo=tokens.nextToken();
                    String estado=tokens.nextToken();
                    String grado=tokens.nextToken();
                    long dni=Long.parseLong(tokens.nextToken());
                cliente.add(new Cliente(prenombre,apellidos,lugar,fecha,sexo,
                estado,grado,dni));
            }
        }
    return cliente;
    }
    
    public LinkedList<Cuenta> obtenerCuenta(){
    
    LinkedList<Cuenta> cuenta=new LinkedList();
    LinkedList<Cliente> cliente=obtenerCliente();
    nombre="cuenta.txt";
    LinkedList<String> a=obtenerTextoDelArchivo();
    if(a.size()!=0){
           
            for(int i=0;i<a.size();i++){
                //JOptionPane.showInputDialog(a.get(i)+" "+a.size());
                String linea=a.get(i);
                StringTokenizer tokens=new StringTokenizer(linea,";");
                //String codigo=tokens.nextToken();
                long ggg=Long.parseLong(tokens.nextToken());
                //tokens.nextToken();
                long numtarjeta=Long.parseLong(tokens.nextToken());
                    String fecha=tokens.nextToken();
                    int codigo=Integer.parseInt(tokens.nextToken());
                    
                cuenta.add(new Cuenta(cliente.get(i),numtarjeta,fecha,codigo));
            }
        }
    return cuenta;
    }
    public void ActualizarCuenta1(Cuenta Lista) {
        try{    
        nombre="cuentaUso.txt";
            File t = obtenerArchivo();

                FileWriter fw = new FileWriter(t);
                PrintWriter pw = new PrintWriter(fw);
                
                    long numeroTarj = Lista.getNumeroTarj();
                    String FechaVenc = Lista.getFechaVenc();
                    
                    int codigo = Lista.getCodigo();
                    pw.println(Lista.getCliente().getDNI()+";"
                            +numeroTarj+";"+FechaVenc+";"+codigo);
                              
                fw.close();
        }catch(Exception e)
        {JOptionPane.showInputDialog(e.getMessage()+"AC");
            
        }

        }
    public void ActualizarCliente1(Cliente Lista) {
        try{    
        nombre="clienteUso.txt";
            File t = obtenerArchivo();

                FileWriter fw = new FileWriter(t);
                PrintWriter pw = new PrintWriter(fw);
                
                    String prenombre=Lista.getPrenombre();
                    String apellidos=Lista.getApellidos();
                    String lugar=Lista.getLugarNaci();
                    String fecha=Lista.getFechaNac();
                    String sexo=Lista.getSexo();
                    String estado=Lista.getEstadoCivil();
                    String grado=Lista.getGradoInstruc();
                    long dni=Lista.getDNI();
                    pw.println(prenombre+";"+apellidos+";"+lugar+";"+fecha+";"+sexo+";"+estado
                            +";"+grado+";"+dni);
                             
                fw.close();
         }catch(Exception e)
        {JOptionPane.showInputDialog(e.getMessage()+"AC");
            
        }
        }
    public Cliente obtenerCliente1(){
    nombre="clienteUso.txt";
    Cliente cliente=new Cliente();
    LinkedList<String> a=obtenerTextoDelArchivo();
    if(a.size()!=0){
           
            for(int i=0;i<a.size();i++){
                //JOptionPane.showInputDialog(a.get(i)+" "+a.size());
                String linea=a.get(i);
                StringTokenizer tokens=new StringTokenizer(linea,";");
                //String codigo=tokens.nextToken();
                String prenombre=tokens.nextToken();
                    String apellidos=tokens.nextToken();
                    String lugar=tokens.nextToken();
                    String fecha=tokens.nextToken();
                    String sexo=tokens.nextToken();
                    String estado=tokens.nextToken();
                    String grado=tokens.nextToken();
                    long dni=Long.parseLong(tokens.nextToken());
                cliente=new Cliente(prenombre,apellidos,lugar,fecha,sexo,
                estado,grado,dni);
            }
        }
    return cliente;
    }
    public Cuenta obtenerCuenta1(){
    
    Cuenta cuenta=new Cuenta();
    Cliente cliente=obtenerCliente1();
    nombre="cuentaUso.txt";
    LinkedList<String> a=obtenerTextoDelArchivo();
    if(a.size()!=0){
           
            for(int i=0;i<a.size();i++){
                //JOptionPane.showInputDialog(a.get(i)+" "+a.size());
                String linea=a.get(i);
                StringTokenizer tokens=new StringTokenizer(linea,";");
                //String codigo=tokens.nextToken();
                long ggg=Long.parseLong(tokens.nextToken());
                //tokens.nextToken();
                long numtarjeta=Long.parseLong(tokens.nextToken());
                    String fecha=tokens.nextToken();
                    int codigo=Integer.parseInt(tokens.nextToken());
                    
                cuenta=new Cuenta(cliente,numtarjeta,fecha,codigo);
            }
        }
    return cuenta;}
    public void ActualizarTransaccion(Transaccion Lista) {
        try{    
        nombre="transaccion.txt";
        
            File t = obtenerArchivo();

                FileWriter fw = new FileWriter(t);
                PrintWriter pw = new PrintWriter(fw);
                
                    int prenombre=Lista.getCuotas();
                    double apellidos=Lista.getCredito();
                    boolean lugar=Lista.isPagado();
                    
                    pw.println(Lista.getCuenta().getNumeroTarj()+";"+prenombre+";"+apellidos+";"+lugar);
                             
                fw.close();
         }catch(Exception e)
        {JOptionPane.showInputDialog(e.getMessage()+"AC");
            
        }
        }
    public Transaccion obtenerTransaccion(){
    
    Cuenta cuenta=obtenerCuenta1();
    //Cliente cliente=obtenerCliente1();
    nombre="transaccion.txt";
    Transaccion c=new Transaccion();
    LinkedList<String> a=obtenerTextoDelArchivo();
    if(a.size()!=0){
           
            for(int i=0;i<a.size();i++){
                //JOptionPane.showInputDialog(a.get(i)+" "+a.size());
                String linea=a.get(i);
                StringTokenizer tokens=new StringTokenizer(linea,";");
                //String codigo=tokens.nextToken();
                
                tokens.nextToken();
                int numtarjeta=Integer.parseInt(tokens.nextToken());
                    Double fecha=Double.parseDouble(tokens.nextToken());
                    boolean codigo=Boolean.parseBoolean(tokens.nextToken());
                    
                c=new Transaccion(cuenta,numtarjeta,fecha,codigo);
            }
        }
    return c;
    }
    public void ActualizarPagos(String pago) {
        try{    
        nombre="Historialtransaccion.txt";
        LinkedList<String> a=obtenerPagos();
            File t = obtenerArchivo();

                FileWriter fw = new FileWriter(t);
                PrintWriter pw = new PrintWriter(fw);
                for(int i=0;i<=a.size();i++)
                {
                if(i!=a.size())
                    pw.println(a.get(i));
                else
                    pw.println(pago);
                }
                              
                fw.close();
         }catch(Exception e)
        {JOptionPane.showInputDialog(e.getMessage()+"AC");
            
        }
        }
    public LinkedList<String> obtenerPagos(){
    
    //Cuenta cuenta=obtenerCuenta1();
    //Cliente cliente=obtenerCliente1();
    nombre="Historialtransaccion.txt";
    //Transaccion c=new Transaccion();
    LinkedList<String> a=obtenerTextoDelArchivo();
    
    return a;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cuentas;

/**
 *
 * @author Bozhidar Emilov Dimitrov Iliev
 */
public class CCuenta {

    /**
     * @return devuelve el nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre para el setter de nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return devuelve cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * @param cuenta para el setter de cuenta
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * @return devuelve saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo para el setter de saldo
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * @return devuelve tipoInterés
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * @param tipoInterés para el setter de tipoInterés
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }


    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    /**
     *
     */
    public CCuenta()
    {
    }
/**
 * 
 * @param nom
 * @param cue
 * @param sal
 * @param tipo 
 */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }
/**
 * 
 * @return saldo
 */
    public double estado()
    {
        return getSaldo();
    }

    /**
     * 
     * @param cantidad para el método ingresar
     * @throws Exception si cantidad es menor que 0.
     * no se puede ingresar una cantidad negativa.
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }
/**
 * 
 * @param cantidad para el método retirar
 * @throws Exception si el saldo es menor que la cantidad que se quiere retirar,
 * o si la cantidad que se quiere retirar es negativa o igual a 0.
 */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }
}
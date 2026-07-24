/*Documentación Interna
Clase: CuentaBancaria
Descripción: Clase de cuenta  bancaria que cuenta con constructor y métodos de depositar, montos y getters
Fecha: 23/07/2026
Autor: Andrés Morataya
Correo: mor26497@uvg.edu.gt 
Recursos: Compilador de java
Procesos pendientes:---*/
public class CuentaBancaria {
    private String titular;
    private String numcuenta;
    private double saldo;

    public CuentaBancaria(String titular, String numcuenta, Double saldo){
        this.titular=titular;
        this.numcuenta=numcuenta;
        this.saldo=saldo;
    }

    public void depositar(Double Monto){
        if (saldo>0){
            saldo += Monto;
            saldo = Math.round(saldo * 100.0) / 100.0;
        }
    }

    public boolean retirar(double Monto){
        if (Monto<=saldo){
            saldo-=Monto;
            return true;
        }
        else{
            return false;
        }
    }
    public double consultarSaldo(){
        saldo = Math.round(saldo * 100.0) / 100.0;
        return saldo;
    }

    public void mostrarinfo(){
        System.out.println("Titular: "+titular);
        System.out.println("# de cuenta: "+numcuenta);
        }

}

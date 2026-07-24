/*Documentación Interna
Clase: Main
Descripción: Archivo principal que instancia objetos de tipo cuenta bancaria y realiza movimientos con ellos.
Fecha: 23/07/2026
Autor: Andrés Morataya
Correo: mor26497@uvg.edu.gt 
Recursos: Compilador de java
Procesos pendientes:---*/
public class Main {
    public static void main(String[] args){

        CuentaBancaria azteca = new CuentaBancaria("José López","985238400",10300.00);

        CuentaBancaria bac = new CuentaBancaria("Amanda García","456857062",8540.00);

        azteca.mostrarinfo();
        System.out.println("Saldo actual "+azteca.consultarSaldo());
        azteca.depositar(320.00);
        System.out.println("Saldo actual "+azteca.consultarSaldo()+" luego de deposito de Q320.00");
        if (azteca.retirar(5400.00)){
            System.out.println("Saldo actual "+azteca.consultarSaldo()+" luego de retiro de 5400.00");
        }
        else{
            System.out.println("Saldo insuficiente para retiro de Q5400.00");
        }


        for (int i=0;i<=10;i++){
            double  numero =  Math.random()*2000;
            numero = Math.round(numero * 100.0) / 100.0;
            if ((i%2)==0){
                azteca.depositar(numero);
                System.out.println("Saldo actual "+azteca.consultarSaldo()+" luego de deposito de Q"+numero);
            }
            else{
                if (azteca.retirar(numero)){
                    System.out.println("Saldo actual "+azteca.consultarSaldo()+" luego de retiro de  Q"+numero);
                }
                else{
                    System.out.println("Saldo insuficiente para retiro de Q"+numero);

                }
            }
        }
        System.out.println("---------------------------------------------");
        bac.mostrarinfo();
        System.out.println("Saldo actual "+bac.consultarSaldo());
        if (bac.retirar(10000.00)){
            System.out.println("Retiro exitoso");
            System.out.println("Saldo actual "+azteca.consultarSaldo()+" luego de retiro de 10000.00");
        }
        else{
            System.out.println("Saldo insuficiente para retiro de Q10000.00");
        }
        bac.depositar(50.00);
        System.out.println("Saldo actual "+bac.consultarSaldo()+" luego de deposito de Q50.00");
                for (int i=0;i<=10;i++){
            double  numero =  Math.random()*30000;
            numero = Math.round(numero * 100.0) / 100.0;
            if ((i%2)==0){
                bac.depositar(numero);
                System.out.println("Saldo actual "+bac.consultarSaldo()+" luego de deposito de Q"+numero);
            }
            else{
                if (azteca.retirar(numero)){
                    System.out.println("Saldo actual "+bac.consultarSaldo()+" luego de retiro de  Q"+numero);
                }
                else{
                    System.out.println("Saldo insuficiente para retiro de Q"+numero);

                }
            }
        }
        System.out.println("---------------------------------------------");
        System.out.println("Saldos finales luego de simulaciones");
        System.out.println("Saldo Azteca: Q"+azteca.consultarSaldo());
        System.out.println("Saldo BAC: Q"+bac.consultarSaldo());


    }

}

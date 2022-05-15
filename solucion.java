/**
 * solucion
 * 1/ Prepararia a la poblacion para que se puedan comunicar de esta manera:
 * Los que solo pueden escuchar, que se comuniquen a traves de sonidos
 * Los que solo pueden ver, que se comuniquen a travès de señas
 * Los que solo pueden hablar que se comuniquen normalmente
 * 
 * 
 * 2/ 
 * La compilacion de archivos java sin la necesidad del uso o compilacion previa de javac
 * Metodos de string: 
 * strip() -> elimina caracteres en blanco, a adiferencia del trim, este tiene en cuenta caracteres Unicode
 * repeat() -> tiene como funcion repetir el string las veces que se indique como parametro
 * 
 * 
 * 3/
 */

import java.util.*;
public class solucion {
    public static void main(String[] args) {		
        List<Integer> lista = Arrays.asList(1, 2, 3, 4); 
        System.out.println(pairNumbers(lista));
	}

    public static  List<Integer> pairNumbers(List<Integer> list) {
        List<Integer> pairNUmbersList = new ArrayList<>();
        for (Integer integer : list) {
            if ((integer % 2) == 0) {
                pairNUmbersList.add(integer);
            }
        }
        return pairNUmbersList;
    }
}

/* 
 * 4/ No solo me fijo en el que el codigo funcione correctamente, tambien me fijo en como codifica la solucion de dicho problema
 * Me fijo en como declara las variables, los metodos, si es posible realizarle criticas constructiva con respecto a Clean Code
 *
 * 5/ 
 * Public: Los metodos o variables que llevan este modificador podran ser usados desde cualquier clase
 * Private:Los metodos o variables que llevan este modificador podran ser usados en la misma clase
 * Protected: Pueden ser usado por las clases del mismo paquete 
 * 
 * 6/ Existen varias diferencias entre las clases abstact y una interfaz:
 * 
 * En una interfaz solo pueden existir metodos public, en una clase abstrac pueden ser public o protected
 * Una clase abstrac puede heredar de cualquier clase, una interfaz solo puede heredar de otras interfaces
 * 
 * 7/
 * CQRSF es un patron que se encarga de separar lo que es las consultas de las peticiones que pueda recibir un sistema
 * Event sourcing en por asi decirlo, en pocas palabras, es un capturador de eventos que se puedan presentar en nuestra app
 * 
 * 
 * 9/ TDD consiste en un tipo de metodologia basado en pruebas, donde primero se implementan los casos de pruebas, y a partir de estos,
 * se realiza el desarrollo como tal.
 * 
 * 
 * Tuve problemas tecnicos con la electricidad, espero me comprendan por algunas que me flataron :(
 */

public interface PaymentStrategy {
    //write here your solution
    public class Main {
        public static void main(String[] args) {
        //write here your solution
        }
        public double oldWayPaymentStrategy(double amount){

        }
        public double cashPaymentStrategy(double amount) {
            double serviceCharge = 5.00;
            return amount + serviceCharge;
        }
        public double creditCardStrategy(double amount) {
            double serviceCharge = 5.00;
            double creditCardFee = 10.00;
            return amount + serviceCharge + creditCardFee;
        }  
    }
}
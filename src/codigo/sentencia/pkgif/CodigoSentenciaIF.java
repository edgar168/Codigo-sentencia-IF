/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo.sentencia.pkgif;

/**
 *
 * @author Erick
 */
import java.util.Scanner;
public class CodigoSentenciaIF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // 1.- DE DOS NUMEROS CUAL ES EL MAYOR
        Scanner miConsola=new Scanner(System.in);
        System.out.println("¿CUAL NUMERO ES EL MAYOR?" );
        int valor1=0;
        int valor2=0;
        valor1=miConsola.nextInt();
        valor2=miConsola.nextInt();
        if (valor1>valor2) {
        System.out.println("El "+valor1 +" es el mayor" );    
        }else{
        System.out.println("El "+valor2 +" es el mayor");    
    }
 //2.- DADOS 2 NUMERO SE INDIQUE CUAL ES > Y CUSL ES <
 System.out.println("¿TU DIGITO ES MAYOR O ES MENOR? " );
 int num1=0;
 int num2=0;
 num1 = miConsola.nextInt();
 num2 = miConsola.nextInt();
 if (num1>num2) { 
 System.out.println("El "+num1 +" es mayor y el "+ num2+ " es menor" );    
 }else{
 System.out.println("El "+num2 +" es mayor y el "+ num1+ " es menor");    
               
    }
//3.- QUE EL CODIGO RECONOZCA CUAL ES EL > Y CUAL EL <, O SI SON =
        System.out.println("EL NUMERO ES MAYOR Y EL NUMERO ES MENOR O ¿IGUALES? ");
        int a=0;
        int b=0;
        a=miConsola.nextInt();
        b=miConsola.nextInt();
        if (a>b) {
        System.out.println("El "+ a +" es mayor y el "+ b + " es menor" );    
        }else if(b>a){
        System.out.println("El "+ b +" es mayor y el "+ a + " es menor");  
         
        }else{
        System.out.println("los valores ingresados son iguales ");
        }
//4.- CODIGO SOBRE EL AÑO 
System.out.println("¿CUANTOS AÑOS HAN PASADO?" );
int actual=2021;
int cualquiera=0;
System.out.println("El año actual es 2021");
System.out.println("Ingrese el año que desees");
cualquiera=miConsola.nextInt();

 if (actual>cualquiera) {
 int ope=actual-cualquiera;
 System.out.println("Han pasado "+ ope + " años desde el "+ cualquiera);    
 }else if(actual<cualquiera){
 int ope=cualquiera-actual;
 System.out.println("Faltan "+ ope + " años para el "+ cualquiera);  
         
  }else{ 
  System.out.println("Estas en el presente año");
        }
 //5.-¿ ES UN NUMERO NEGATIVO O POSITIVO?
            System.out.println("¿CUAL ES NEGATIVO Y CUAL ES POSITIVO?");
            int num=0;
            System.out.println("Ingresa un numero");
            num=miConsola.nextInt();
            if (num>0) {
            System.out.println("++++++++Es positivo+++++++++");    
            }else{
            System.out.println("--------Es negativo---------");
        }
 //6.- INDIQUE SI EL NUMERO ES DE DOS CIFRAS O DISTINTOS DE
  System.out.println("¿DE CUANTAS CIFRAS ES EL NUMERO?");
  System.out.println("AHORA LO SABREMOS");
  int cifra=0;
  System.out.println("Piensa un numero e ingresalo");
  cifra=miConsola.nextInt();
  if (cifra>=10 && cifra<=99) {
  System.out.println("00-00-00-00Tu numero tiene dos cifras00-00-00-00");    
  }else{
  System.out.println("0-000-0000Tu numero es distinto de dos cifras0-00-000...");
        }
}


}

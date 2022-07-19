package org.DanielQuán.system;
import java.util.Scanner;

/**
 *Programador: Daniel Enrique Quán Cruz 
 *No. Carnet: 2017024
 *Tarea #1
 *Profesor: Pedro Armas
 *IN5AM
 */
public class Principal {
    public static void main(String[] args) {
        System.out.println ("--------------------Documentación--------------------");
        System.out.println ("Nombre: Daniel Enrique Quán Cruz");
        System.out.println ("No. Carnet: 2017024");
        System.out.println ("Profesor: Pedro Armas");
        System.out.println ("Tarea No.1");        
        System.out.println ("IN5AM");
        Scanner sc = new Scanner(System.in);            
            int Opción;
                do{
                    System.out.println("----------------------------------------------------------------"); 
                    System.out.println("-$-$-$-$-$-$-$-$-$-$-$-$-$-$-|Menú|-$-$-$-$-$-$-$-$-$-$-$-$-$-$-");
                    System.out.println("----------------------------------------------------------------"); 
                    System.out.println("1. Conversor de segundos a H:M:S");                       
                    System.out.println("2. Conversor de no. de billetes a denominaciones");                        
                    System.out.println("3. Valor par o impar");                      
                    System.out.println("4. Valor perfecto o imperfecto");                       
                    System.out.println("5. Fibonacci"); 
                    System.out.println("6. Cerrar programa");
                    System.out.println("----------------------------------------------------------------");                                                        
                        System.out.println("Escribe una de las opciones");
                        Opción = sc.nextInt();
                        switch (Opción) {
                            default:
                                System.out.println("-- Escoga una opcion ---");
                            case 1:
                                System.out.println("________________________________________________________________");
                                System.out.println("|---Conversor de segundos a H:M:S---|");
                                    System.out.println("°Ingresar número°");
                                        int sect, horas, minutos, segundos;                                     
                                        Scanner s1 = new Scanner(System.in);
                                            sect = s1.nextInt();                                                                                                                                                                  
                                                horas = (sect / 3600);
                                                minutos = ((sect-horas*3600)/60);
                                                segundos = sect-(horas*3600+minutos*60);                                                                                                                                                                                                                                                                 
                                    System.out.println("H:M:S");
                                    System.out.println(horas + ":" + minutos + ":" + segundos);
                                System.out.println("________________________________________________________________");
                                break;
                            case 2:
                                System.out.println("________________________________________________________________");
                                System.out.println("|---Conversor de no. de billetes a denominaciones---|");
                                    System.out.println("°Ingresar número°");
                                        int billetes, Q200, Q100, Q50, Q20, Q10, Q5, Q1;
                                        Scanner s2 = new Scanner (System.in);
                                            billetes = s2.nextInt();
                                                Q200 = (billetes / 200);
                                                Q100 = ((billetes-Q200*200)/100);
                                                Q50 = ((billetes-(Q200*200+Q100*100))/50);
                                                Q20 = ((billetes-(Q200*200+Q100*100+Q50*50))/50);
                                                Q10 = ((billetes-(Q200*200+Q100*100+Q50*50+Q20*20))/50);
                                                Q5 = ((billetes-(Q200*200+Q100*100+Q50*50+Q20*20+Q10*10))/50);
                                                Q1 = ((billetes-(Q200*200+Q100*100+Q50*50+Q20*20+Q10*10+Q5*5))/50);        
                                    System.out.println("La cantidad de billetes por denominaciones es:");            
                                    System.out.println("Hay" + " " + Q200 + " " + "billetes de Q200");
                                    System.out.println("Hay" + " " + Q100 + " " + "billetes de Q100");
                                    System.out.println("Hay" + " " + Q50 + " " + "billetes de Q50");
                                    System.out.println("Hay" + " " + Q20 + " " + "billetes de Q20");
                                    System.out.println("Hay" + " " + Q10 + " " + "billetes de Q10");
                                    System.out.println("Hay" + " " + Q5 + " " + "billetes de Q5");
                                    System.out.println("Hay" + " " + Q1 + " " + "billetes de Q1");                                        
                                System.out.println("________________________________________________________________");
                                break;
                            case 3:
                                System.out.println("________________________________________________________________");
                                System.out.println("|-Valor par o impar-|");
                                    System.out.println("°Ingresar número°");
                                        int num;                                       
                                        Scanner s3 = new Scanner (System.in);
                                            num = s3.nextInt();
                                                if (num%2 == 0) {
                                                    System.out.println("El numero ingresado es: par");                                                    
                                                } else {
                                                    System.out.println("El numero ingresado es: impar");
                                                }                                               
                                System.out.println("________________________________________________________________");
                                break;
                            case 4:
                                System.out.println("________________________________________________________________");
                                System.out.println("|-Valor perfecto o imperfecto-|");
                                    System.out.println("°Ingresar número°");
                                        int n, d, suma = 0;
                                        Scanner s4 = new Scanner (System.in);
                                            n = s4.nextInt();
                                                for (d = 1; d < n; d++) { 
                                                    if (n % d == 0) {
                                                        suma = suma + d;
                                                    }
                                                }
                                                if (suma == n) {              
                                                    System.out.println("El número ingresado es perfecto");
                                                } else {
                                                    System.out.println("El número ingresado es imperfecto");
                                                }
                                System.out.println("________________________________________________________________");
                                break;
                            case 5:
                                System.out.println("________________________________________________________________");
                                System.out.println("|-Ficonacci-|");  
                                    System.out.println("°Ingresar numero mayor a '1'° ");
                                        int numefib,num1,num2,i;
                                        do{                                        
                                            numefib = sc.nextInt();
                                        }while(numefib<=1);  
                                            System.out.println("Los " + numefib + " son la respuesta a la sucesión.");                 
                                            num1=0;
                                            num2=1;
                                            System.out.println(num1 + " ");
                                        for(i=2;i<=numefib;i++){
                                            System.out.println(num2 + " ");
                                            num2 = num1 + num2;
                                            num1 = num2 - num1;
                                        }
                                System.out.println("________________________________________________________________");
                                break;
                            case 6:
                                System.out.println("________________________________________________________________");
                                System.out.println("|-Cerrar Programa-|");
                                System.out.println("________________________________________________________________");
                                    System.out.println("Documentación Final:");
                                        System.out.println("Nombre: Daniel Enrique Quán Cruz");
                                        System.out.println("Código Tecnico: IN5AM");
                                        System.out.println("No. Carnet: 2017024");
                                        System.out.println("Lapso de entrega: 22 al 26 de Marzo del 2,021");
                                        System.out.println("Tarea No. 1"); 
                                        System.out.println("Profesor: Pedro Armas");
                                System.out.println("________________________________________________________________");                                
                                break;
                        }                   
                } while(Opción > 0 & Opción < 6);  
                    System.out.println("Garcias por utilizar el programa, Feliz Día.");  
                
    }     
}         
    

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maatrices;

import java.util.Scanner;

/**
 *
 * @author Albert Jose Charry, Jorge Andres Duran
 * @version 1.1 02 de Marzo de 2017
 */
public class prueba {
        int [][]matriz1=new int[50][50];        
        int [][]matriz2=new int[50][50];
        int [][]multiplicacion=new int[50][50];
        
        int filas;
        int columnas;
        int filas2;
        int columnas2;
        int i,j;
public void operacion(){ 
 
        Scanner entradaTeclado = new Scanner(System.in);
       int vali = 0;
        while(vali == 0){
       
        System.out.println("digite el numero de filas de la matriz 1");
        filas= entradaTeclado.nextInt();
        
        System.out.println("digite el numero de columnas de la matriz 1");
        columnas= entradaTeclado.nextInt();

        System.out.println("digite el numero de filas de la matris 2");
        filas2= entradaTeclado.nextInt();
        
        System.out.println("digite el numero de columnas de la matris 2");
        columnas2= entradaTeclado.nextInt();
        if(filas != columnas2 ){
        
            System.out.println("Las matrices no se pueden multiplicar por que no son validas las dimenciones ");
            
        }else{
        vali = 1;
        
          }
       }
      
        for(i=0;i<filas;i++){
          for(j=0;j<columnas;j++){
                  System.out.println("digite el numero de la martiz1 posicion "+i+j);
                  matriz1[i][j]=entradaTeclado.nextInt();
                }
            }
        for(i=0;i<filas2;i++){
          for(j=0;j<columnas2;j++){
                 System.out.println("digite el numero de la martiz2 posicion "+i+j);
                  matriz2[i][j]=entradaTeclado.nextInt();
                }
            }    
        
        }


public void multiplicacion(){
    
    int tempo1 = 0;
    int tempo2 = 0;
for(i=0;i<filas;i++){
           for(j=0;j<columnas;j++){
            
            tempo1 = matriz1[i][j];
            tempo2 = matriz2[j][i];
            multiplicacion[i][j] = tempo1 * tempo2;
               System.out.println(tempo1+"--"+tempo2);
                      }
                }      
         for(i=0;i<filas;i++){
          for(j=0;j<columnas;j++){             
              
              System.out.print("/");
              System.out.print(multiplicacion[i][j]);
            }
        }       
 }    
}


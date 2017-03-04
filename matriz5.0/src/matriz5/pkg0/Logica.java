/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matriz5.pkg0;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Logica {
   public void multiplicacion(){

       Scanner entradaTeclado = new Scanner(System.in);
    int matriz1dim1=0;
    
    int matriz1dim2=0;
    int matriz2dim1=0;
    int matriz2dim2=0;
    int vali = 0;
                while(vali == 0){

       System.out.println("dimesion 1 matriz 1 ");
       matriz1dim1=entradaTeclado.nextInt();
       
       System.out.println("dimension 2 matriz1");
       matriz1dim2=entradaTeclado.nextInt();
       
        System.out.println("dimension 1 matriz2");
       matriz2dim1=entradaTeclado.nextInt();

        System.out.println("dimension 2 matriz2");
       matriz2dim2=entradaTeclado.nextInt();
       
       if(matriz1dim2 != matriz2dim1 ){
        
            System.out.println("Las matrices no se pueden multiplicar por que no son validas las dimenciones ");
            
        }else{
        vali = 1;
        
          }
       }
           
    
       
       
    int arreglo1[][]=new int[matriz1dim1][matriz1dim2];
    int arreglo2[][]=new int[matriz2dim1][matriz2dim2];
    int arreglo3[][]=new int[matriz1dim1][matriz2dim2];
    
    for(int i=0;i<matriz1dim1;i++){
    for(int j=0;j<matriz1dim2;j++){
        System.out.println("numero del arreglo");
        arreglo1[i][j]=entradaTeclado.nextInt();
        
         }
    }
    
     for(int i=0;i<matriz2dim1;i++){
    for(int j=0;j<matriz2dim2;j++){
        System.out.println("numero del arreglo2");
        arreglo2[i][j]=entradaTeclado.nextInt();
        
         }
    }

if(matriz1dim2==matriz2dim1){
        for(int l=0;l<matriz1dim1;l++){
            for(int m=0;m<matriz2dim2;m++){
             for(int n=0;n<matriz1dim2;n++){
     
             arreglo3 [l][m]=arreglo3[l][m]+(arreglo1[l][n]*arreglo2[n][m]);
             }
        
            }
        
        }
}

    for(int i=0;i<matriz1dim1;i++){
        System.out.println(" ");
        for(int j=0;j<matriz2dim2;j++){
            System.out.println(arreglo3[i][j]);    
    
       }
    }
} 
}

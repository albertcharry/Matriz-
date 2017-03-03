/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package burbuja;

import java.util.Scanner;

/**
 *
 * @author Albert Jose Charry, Jorge Andres Duran
 * @version 1.1 02 de Marzo de 2017
 */
public class ingreso {
    
public void vector (){
    
   
ingreso ing=new ingreso();
Scanner entradaTeclado = new Scanner(System.in);
     int aux;

     System.out.println("tamaño del arreglo");
    int a=entradaTeclado.nextInt();
    int []nums =new int[a]; 
 
    int i = 0;
    for(i=0;i<a;i++){
        System.out.println("ingrese el numero"+i);
        nums[i]=entradaTeclado.nextInt();
        
    }
   
        for( i = 0; i < nums.length; i++){

            
            for (int j = i + 1; j < nums.length; j++){
                
                if(nums[j]< nums[i]){
                    
                    aux = nums[i]; 
                    nums[i] = nums[j];
                    nums[j] = aux;
                    
                }
            }           
        }
                    System.out.println("Los numeros ingresados en orden son: ");
                    for ( i = 0; i < nums.length; i++){
                        System.out.print(nums[i] + "-");
                    }   
                    

    }

}


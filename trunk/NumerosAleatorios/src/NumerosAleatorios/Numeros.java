
package NumerosAleatorios;

import java.util.Random;

public class Numeros {
    
    int n=8;  //numeros aleatorios
    int k=n;  //auxiliar de los numero aleatorios;
    int sum = 0;//variable que suma el numero de errores
    int[] numeros=new int[n];//vector donde se guardan los elementos
    int[] numeros_alatorios=new int[n];//vector donde se almacena el resultado de
                                       //los numeros aleatorios                                            
    Random rnd=new Random();//objeto de la clase Random para generar los numeros aleatorios
    int rand;//variable para almacenar los numeros generados por el objeto de la clase Random

   
    //método para rellenar el vector de 8 elementos y el vector del resultado de los numeros aleatorios
    public void generarArreglos(){
     
        //se rellena un vector ordenado del 1 al 8(1..n)
        for(int i=0;i<n;i++){
            numeros[i]=i+1;//aqui se almacenan los numeros en orden del 1 al 8 
        }
        //numeros aleatorios que no se repitan
        for(int i=0;i<n;i++){
           rand=rnd.nextInt(k);//se alamacenan los numeros aleatorios 
           numeros_alatorios[i]=numeros[rand];//almacena los numeros aleatoriamente del 1 al 8
           numeros[rand]=numeros[k-1];//almacena los numeros aleatorios generados para que no se repitan
           k--;// decrementa los elementos del vector numeros
        }
    }//fin del metodo generarArreglos
            
    /*este metodo genera los errores de cada Permutación
      donde se comparan un elemento del vector numeros_aleatorios
      con el resto de elementos para determinar las adyacencias
    */
    public void generarPermutaciones(){
        
        //Comparacion del Primer elemento con el resto de elementolas que pueden generar las posibles adyacencias
        if((numeros_alatorios[0]==numeros_alatorios[1]-1)||(numeros_alatorios[0]==numeros_alatorios[1]+1)){
            sum++;
        }
        if((numeros_alatorios[0]==numeros_alatorios[2]-1)||(numeros_alatorios[0]==numeros_alatorios[2]+1)){
            sum++;
        }
        if((numeros_alatorios[0]==numeros_alatorios[3]-1)||(numeros_alatorios[0]==numeros_alatorios[3]+1)){
            sum++;
        }
        if((numeros_alatorios[0]==numeros_alatorios[4]-1)||(numeros_alatorios[0]==numeros_alatorios[4]+1)){
            sum++;
        }
        
        //Comparacion del segundo elemento con el resto de elementolas que pueden generar las posibles adyacencias
        if((numeros_alatorios[1]==numeros_alatorios[3]-1)||(numeros_alatorios[1]==numeros_alatorios[3]+1)){
            sum++;
        }
        if((numeros_alatorios[1]==numeros_alatorios[4]-1)||(numeros_alatorios[1]==numeros_alatorios[4]+1)){
            sum++;
        }
        if((numeros_alatorios[1]==numeros_alatorios[5]-1)||(numeros_alatorios[1]==numeros_alatorios[5]+1)){
            sum++;
        }
        
        //Comparacion del tercer elemento con el resto de elementolas que pueden generar las posibles adyacencias
        if((numeros_alatorios[2]==numeros_alatorios[3]-1)||(numeros_alatorios[2]==numeros_alatorios[3]+1)){
            sum++;
        }
        if((numeros_alatorios[2]==numeros_alatorios[6]-1)||(numeros_alatorios[2]==numeros_alatorios[6]+1)){
            sum++;
        }

        //Comparacion del cuarto elemento con el resto de elementolas que pueden generar las posibles adyacencias
        if((numeros_alatorios[3]==numeros_alatorios[4]-1)||(numeros_alatorios[3]==numeros_alatorios[4]+1)){
            sum++;
        }
        if((numeros_alatorios[3]==numeros_alatorios[6]-1)||(numeros_alatorios[3]==numeros_alatorios[6]+1)){
            sum++;
        }
        if((numeros_alatorios[3]==numeros_alatorios[7]-1)||(numeros_alatorios[3]==numeros_alatorios[7]+1)){
            sum++;
        }

        //Comparacion del quinto elemento con el resto de elementolas que pueden generar las posibles adyacencias
        if((numeros_alatorios[4]==numeros_alatorios[5]-1)||(numeros_alatorios[4]==numeros_alatorios[5]+1)){
           sum++;
        }
        if((numeros_alatorios[4]==numeros_alatorios[6]-1)||(numeros_alatorios[4]==numeros_alatorios[6]+1)){
           sum++;
        }
        if((numeros_alatorios[4]==numeros_alatorios[7]-1)||(numeros_alatorios[4]==numeros_alatorios[7]+1)){
           sum++;
        }

        //Comparacion del sexto elemento con el resto de elementolas que pueden generar las posibles adyacencias
        if((numeros_alatorios[5]==numeros_alatorios[7]-1)||(numeros_alatorios[5]==numeros_alatorios[7]+1)){
           sum++;
        }

        //Comparacion del septimo elemento con el resto de elementolas que pueden generar las posibles adyacencias
        if((numeros_alatorios[6]==numeros_alatorios[7]-1)||(numeros_alatorios[6]==numeros_alatorios[7]+1)){
            sum++;
        
        }
    }//fin del metodo generarPermutaciones
        
    //metodo que presenta la permutacion
    public void presentarResultados(){
            //se imprime el resultado;
            System.out.println("\nEl resultado del vector es:");
            System.out.print("\t"+   numeros_alatorios[0]);
            System.out.println(" "+numeros_alatorios[1]);
            System.out.print("      "+numeros_alatorios[2]);
            System.out.print(" "+numeros_alatorios[3]);
            System.out.print(" "+numeros_alatorios[4]);
            System.out.println(" "+numeros_alatorios[5]);
            System.out.print("\t"+ numeros_alatorios[6]);
            System.out.println(" "+  numeros_alatorios[7]);
            System.out.print("\n"+"Permutaciones:");
            System.out.println("\n"+"\t"+sum+" Errores");
    }//fin del metodo presentarResultados
        
  }

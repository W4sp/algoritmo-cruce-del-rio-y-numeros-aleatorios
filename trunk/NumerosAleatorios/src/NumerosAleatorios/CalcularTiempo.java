
package NumerosAleatorios;

import java.util.Scanner;

public class CalcularTiempo {
    
    public void presentarTiempo(){
        
        //variable para ingresar el numero de permutaciones
        Scanner l=new Scanner(System.in);
        System.out.println("    Ingrese el valor:");
        String v=l.nextLine();
        int val=Integer.parseInt(v);
        
        //ciclo para presentar cada permutacion con el tiempo de ejecucion
            for (int i = 0; i < val; i++) {
            
            long t1 = System.nanoTime();//variable de inicio del tiempo
            Numeros n = new Numeros();
            n.generarArreglos();
            n.generarPermutaciones();
            n.presentarResultados();
            long t2 = System.nanoTime() - t1;
            System.out.println("\n" + "Tiempo empleado " + t2 + " ns\n");
        
        }
    } 
}

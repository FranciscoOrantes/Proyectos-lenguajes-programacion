/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoraoosistd;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Francisco
 */
public class Octal extends Binario {
   
    private ArrayList<String> numeroOctogonal = new ArrayList<String>();
   protected int residuo;
   protected String primerDigito = "";
   protected int sumaCompleta;
   protected int siguienteDigito;
   protected int aux;
   protected String binarioCompleto;
   protected String residuos;
   
    protected String octogonalCompleto = "";
     public String convertirOctogonal(int numero) {
       
       
       this.numero  = numero;
        if (numero == 0) {
            numeroOctogonal.add(0, Integer.toString(numero));
        } else {
            do {
                resultadoN = numero / 8;
                residuo = numero % 8;

                numeroOctogonal.add(0, Integer.toString(residuo));
                if (resultadoN >= 8) {
                    numero = resultadoN;

                } else {
                    numeroOctogonal.add(0, Integer.toString(resultadoN));
                }
            } while (resultadoN >=8);
            //
        }
        for (int i = 0; i < numeroOctogonal.size(); i++) {
            octogonalCompleto += numeroOctogonal.get(i);
        }
        return octogonalCompleto;
    }
     public String octalBinario(String numero){
    this.digitosBinario=numero;

    primerDigito= String.valueOf(digitosBinario.charAt(0));
    int digito1= Integer.parseInt(primerDigito);
    System.out.println("El primer digito es: "+ digito1);
    int tamano = digitosBinario.length();
    do{
    if(primerDigito.equals("A")||primerDigito.equals("B")||primerDigito.equals("C")||primerDigito.equals("D")||primerDigito.equals("E")||primerDigito.equals("F")){
    JOptionPane.showMessageDialog(null, "Por favor ingrese solo numeros");
    }
    
    }while(primerDigito.equals("A")||primerDigito.equals("B")||primerDigito.equals("C")||primerDigito.equals("D")||primerDigito.equals("E")||primerDigito.equals("F"));
    
    
 
    
    
    int inicioSubString = 1;
    int finalSubString = tamano;
    if(tamano==1){
       sumaCompleta=Integer.parseInt(digitosBinario);
       
    }else{
    do{
       
    residuos=digitosBinario.substring(inicioSubString,finalSubString);
    System.out.println("Los residuos son: "+ residuos);
    siguienteDigito=Integer.parseInt(String.valueOf(residuos.charAt(0)));
    System.out.println("El siguiente digito es: " + siguienteDigito);
    aux=digito1*8;
    System.out.println("La primera multiplicacion es : "+ aux);
    sumaCompleta=aux+siguienteDigito;
    System.out.println("El proceso algoritmico da : "+ sumaCompleta);
    inicioSubString=inicioSubString+1;
    tamano=tamano-1;
    System.out.println("El tamaño de la cadena es : " + tamano);
    digito1=sumaCompleta;
 //  System.out.println(".......");
  
    }while(tamano>1);
    }
   // System.out.println("Sale del ciclo o condicion");
     binarioCompleto=   convertirBinario(sumaCompleta);
       // System.out.println("El resultado en binario (porfavor ya da prro) es : " + binario);
    
    return binarioCompleto;
  /*  do{
    
    
    }while(tamano>0);
    
    */
    }
}

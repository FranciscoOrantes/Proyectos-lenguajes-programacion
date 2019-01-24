/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoraoosistd;

import java.util.ArrayList;

/**
 *
 * @author Francisco
 */
public class Binario {
   protected int numero;
   private int digito;
   protected String digitosBinario;
   protected int resultadoN;
   protected ArrayList<String> numeroBinario = new ArrayList<String>();
   protected ArrayList<String> numeroOctogonal = new ArrayList<String>();
   protected String binarioCompleto = "";  
   protected String octogonalCompleto = "";
    
    
    public String convertirBinario(int numero) {
       
        this.numero = numero;
        do {
            if (numero % 2 == 0) {
                digito = 0;
                this.resultadoN = numero / 2;
                numero = resultadoN;
            } else {
                digito = 1;
                this.resultadoN = numero / 2;
                numero = resultadoN;
            }
            numeroBinario.add(0, Integer.toString(digito));
        } while (resultadoN > 0);
        for (int i = 0; i < numeroBinario.size(); i++) {
            binarioCompleto += numeroBinario.get(i);
        }

        return binarioCompleto;
    }
    public String binarioToOctal(String binario){
    this.binarioCompleto=binario;
    int tamano = binarioCompleto.length();
    System.out.println("Su tamaño es:" + tamano);
    int inicioSubString;
    int finalSubString;
    do{
        switch(tamano){
            case 1:
                digitosBinario=binarioCompleto.substring(0,1);
                System.out.println("LOL"+digitosBinario);
                if(Integer.parseInt(digitosBinario)==1){
                digito=1;
                numeroOctogonal.add(0,Integer.toString(digito));
                tamano = 0;
                }
                break;
            case 2:
                System.out.println("Entro aqui en el caso 2");
                digitosBinario=binarioCompleto.substring(0,2);
                switch(Integer.parseInt(digitosBinario)){
                    case 11:
                        digito= 3;
                        numeroOctogonal.add(0,Integer.toString(digito));
                    //    tamano = 0;
                        break;
                    case 10:
                        digito= 2;
                        System.out.println("Entro aqui x 2");
                         numeroOctogonal.add(0,Integer.toString(digito));
                     //  tamano=0;
                         break;
                    case 01:
                        digito=1;
                         numeroOctogonal.add(0,Integer.toString(digito));
                      //  tamano=0;
                         break;
                    case 00:
                        digito=0;
                         numeroOctogonal.add(0,Integer.toString(digito));
                        //tamano = 0;
                         break;
                }
                break;
            default:
                System.out.println("Entro aqui en el caso 3");
                inicioSubString=tamano-3;
    finalSubString=tamano;
    digitosBinario=binarioCompleto.substring(inicioSubString, finalSubString);
   System.out.println(digitosBinario);
    switch(digitosBinario){
        case "111":
            digito=7;
             numeroOctogonal.add(0,Integer.toString(digito));
            break;
            case "110":
            digito=6;
             numeroOctogonal.add(0,Integer.toString(digito));
            break;
            case "101":
                digito= 5;
                 numeroOctogonal.add(0,Integer.toString(digito));
            break;
            case "011":
                digito= 3;
                System.out.println("Entro en el caso que el digito con 3 cifras da 3");
                 numeroOctogonal.add(0,Integer.toString(digito));
                break;
            case "010":
                digito= 2;
                 numeroOctogonal.add(0,Integer.toString(digito));
                break;
            case "001":
                digito=1;
                 numeroOctogonal.add(0,Integer.toString(digito));
                break;
            case "100":
                digito=4;
                 numeroOctogonal.add(0,Integer.toString(digito));
                break;
            case "000":
                digito=0;
                 numeroOctogonal.add(0,Integer.toString(digito));
                break;
    }
   
     
                break;
        
        }
        tamano=tamano-3;
    
   /*  if(tamano==1 && digito==1){
     numeroOctogonal.add(Integer.toString(digito));
         tamano=0;
     }
     if(tamano==2){
     switch
     }*/
    }while(tamano>0);
    for(int i = 0; i < numeroOctogonal.size(); i++){
      octogonalCompleto += numeroOctogonal.get(i);
   } 
    
    return octogonalCompleto;
        
    }
}

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
public class Hexadecimal extends Octal {
  
    private ArrayList<String> numeroHexadecimal = new ArrayList<String>();
    private char letra;
    protected String hexadecimalCompleto = "";
    private int digito1Hexa;
    private String siguienteDigitoHexa;
    private int sh;
    private String digitos;
    protected String numeroFinal="";
    public String convertirHexa(int numero) {
            
        
        this.numero = numero;
        if (numero == 0) {
            numeroHexadecimal.add(0, Integer.toString(numero));
        } else {
            do {
                resultadoN = numero / 16;
                residuo = numero % 16;
                switch (residuo) {
                    case 0:
                        numeroHexadecimal.add(0, Integer.toString(residuo));
                        break;
                    case 1:
                        numeroHexadecimal.add(0, Integer.toString(residuo));
                        break;
                    case 2:
                        numeroHexadecimal.add(0, Integer.toString(residuo));
                        break;
                    case 3:
                        numeroHexadecimal.add(0, Integer.toString(residuo));
                        break;
                    case 4:
                        numeroHexadecimal.add(0, Integer.toString(residuo));
                        break;
                    case 5:
                        numeroHexadecimal.add(0, Integer.toString(residuo));
                        break;
                    case 6:
                        numeroHexadecimal.add(0, Integer.toString(residuo));
                        break;
                    case 7:
                        numeroHexadecimal.add(0, Integer.toString(residuo));
                        break;
                    case 8:
                        numeroHexadecimal.add(0, Integer.toString(residuo));
                        break;
                    case 9:
                        numeroHexadecimal.add(0, Integer.toString(residuo));
                        break;
                    case 10:
                        letra = 'A';
                        numeroHexadecimal.add(0, Character.toString(letra));
                        break;
                    case 11:
                        letra = 'B';
                        numeroHexadecimal.add(0, Character.toString(letra));
                        break;
                    case 12:
                        letra = 'C';
                        numeroHexadecimal.add(0, Character.toString(letra));
                        break;
                    case 13:
                        letra = 'D';
                        numeroHexadecimal.add(0, Character.toString(letra));
                        break;
                    case 14:
                        letra = 'E';
                        numeroHexadecimal.add(0, Character.toString(letra));
                        break;
                    case 15:
                        letra = 'F';
                        numeroHexadecimal.add(0, Character.toString(letra));
                        break;
                }
                if (resultadoN >= 16) {
                    numero = resultadoN;
                } else {
                    numeroHexadecimal.add(0, Integer.toString(resultadoN));
                }
            } while (resultadoN >= 16);
        }
        for (int i = 0; i < numeroHexadecimal.size(); i++) {
            hexadecimalCompleto += numeroHexadecimal.get(i);
        }
        return hexadecimalCompleto;
    }
    public String hexaBinario(String numero){
    this.digitosBinario=numero;
  
    primerDigito= String.valueOf(digitosBinario.charAt(0));
    switch(primerDigito){
        case "A":
            digito1Hexa=10;
            break;
        case "B":
            digito1Hexa=11;
            break;
        case "C":
            digito1Hexa=12;
            break;
        case "D":
            digito1Hexa=13;
            break;
        case "E":
            digito1Hexa=14;
            break;
        case "F":
            digito1Hexa=15;
            break;
        default:
            digito1Hexa = Integer.parseInt(primerDigito);
            break;
    }
   
    System.out.println("El primer digito es: "+ digito1Hexa);
    int tamano = digitosBinario.length();
    int inicioSubString = 1;
    int finalSubString = tamano;
    if(tamano==1){
        switch(digitosBinario){
            case "A":
                sumaCompleta=10;
                break;
            case "B":
                sumaCompleta=11;
                break;
            case "C":
                sumaCompleta=12;
                
                break;
            case "D":
                sumaCompleta = 13;
                break;
            case "E":
                sumaCompleta=14;
                break;
            case "F":
                sumaCompleta=15;
                break;
            default:
                sumaCompleta=Integer.parseInt(digitosBinario);
                break;
        }
       
       
    }else{
    do{
       
    residuos=digitosBinario.substring(inicioSubString,finalSubString);
    System.out.println("Los residuos son: "+ residuos);
    siguienteDigitoHexa=String.valueOf(residuos.charAt(0));
    switch(siguienteDigitoHexa){
        case "A":
            siguienteDigito=10;
            break;
        case "B":
            siguienteDigito=11;
            break;
        case "C":
            siguienteDigito=12;
            break;
        case "D":
            siguienteDigito=13;
            break;
        case "E":
            siguienteDigito=14;
            break;
        case "F":
            siguienteDigito=15;
            break;
        default:
            siguienteDigito=Integer.parseInt(siguienteDigitoHexa);
            break;
    }
    
    System.out.println("El siguiente digito es: " + siguienteDigito);
    aux=digito1Hexa*16;
    System.out.println("La primera multiplicacion es : "+ aux);
    sumaCompleta=aux+siguienteDigito;
    System.out.println("El proceso algoritmico da : "+ sumaCompleta);
    inicioSubString=inicioSubString+1;
    tamano=tamano-1;
    System.out.println("El tamaño de la cadena es : " + tamano);
    digito1Hexa=sumaCompleta;
   //System.out.println(".......");
   
    
    }while(tamano>1);
    }
    if(sumaCompleta<0){
    sumaCompleta=sumaCompleta*-1;
    }
   // System.out.println("Sale del ciclo o condicion");
     binarioCompleto=   convertirBinario(sumaCompleta);
        System.out.println("El resultado en binario (porfavor ya da prro) es : " + binarioCompleto);
    
    return binarioCompleto;
  /*  do{
    
    
    }while(tamano>0);
    
    */
    }
    public String convertirHexaBin(String numero){
    this.digitosBinario=numero;
    int index = 0;
    
    int tamano = digitosBinario.length();
    do{
    letra=digitosBinario.charAt(index);
    switch(letra){
        case '0':
            digitos="0000";
     //       numeroHexadecimal.add(0,digitos);
            System.out.println("El valor es: "+ digitos);
        break;
        case '1':
            digitos="0001";
       // numeroHexadecimal.add(0,digitos);
        System.out.println("El valor es: "+ digitos);
            break;
        case '2':
            digitos = "0010";
         //   numeroHexadecimal.add(0,digitos);
            System.out.println("El valor es: "+ digitos);
            break;
        case '3':
            digitos="0011";
           // numeroHexadecimal.add(0,digitos);
            System.out.println("El valor es: "+ digitos);
            break;
        case '4':
            digitos="0100";
           // numeroHexadecimal.add(0,digitos);
            System.out.println("El valor es: "+ digitos);
            break;
        case '5':
            
            digitos="0101";
            //numeroHexadecimal.add(0,digitos);
            System.out.println("El valor es: "+ digitos);
            break;
        case '6':
            
            digitos="0110";
           // numeroHexadecimal.add(0,digitos);
            System.out.println("El valor es: "+ digitos);
            break;
        case '7':
            digitos="0111";
            //numeroHexadecimal.add(0,digitos);
            System.out.println("El valor es: "+ digitos);
            break;
        case '8':
            digitos="1000";
            //numeroHexadecimal.add(0,digitos);
            System.out.println("El valor es: "+ digitos);
            break;
        case '9':
            digitos="1001";
            //numeroHexadecimal.add(0,digitos);
            System.out.println("El valor es: "+ digitos);
            break;
        case 'A':
            digitos="1010";
            //numeroHexadecimal.add(digitos);
            System.out.println("El valor es: "+ digitos);
            break;
        case 'B':
            digitos="1011";
            //numeroHexadecimal.add(digitos);
            System.out.println("El valor es: "+ digitos);
            break;
        case 'C':
            digitos="1100";
            //numeroHexadecimal.add(digitos);
            System.out.println("El valor es: "+ digitos);
            break;
        case 'D':
            digitos="1101";
            //numeroHexadecimal.add(digitos);
            System.out.println("El valor es: "+ digitos);
            break;
        case 'E':
            digitos="1110";
            //numeroHexadecimal.add(digitos);
            System.out.println("El valor es: "+ digitos);
            break;
        case 'F':
            digitos="1111";
            //numeroHexadecimal.add(0,digitos);
            System.out.println("El valor es: "+ digitos);
            break;
    }
    numeroHexadecimal.add(digitos);
    tamano = tamano -1;
        System.out.println("EL tamaño es : " +tamano);
    index= index+1;
        System.out.println("La cadena va en la letra numero : " + index);
    }while(tamano>=1);
    for (int i = 0; i < numeroHexadecimal.size(); i++) {
            numeroFinal += numeroHexadecimal.get(i);
        }
        System.out.println("EL NUMERO EN BINARIO SEGUN EL METODO SURI SU ES : " + numeroFinal);
        return numeroFinal;
    }
}

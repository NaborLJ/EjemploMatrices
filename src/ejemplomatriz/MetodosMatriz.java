/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplomatriz;

import javax.swing.JOptionPane;

/**
 *
 * @author nlopezjimenez
 */
public class MetodosMatriz {
    int[][]notas = new int [3][4];
    int[]notasMedias = new int[3];
    int []mediaModulos = new int[4];
    public void cargarMatriz(){
        // Puede cargarse así(se hace pocas veces) ->    int [][]notaM = {{7,9,5,4},{5,5,5,5},{6,7,8,9}};
        for(int f=0;f<notas.length;f++)
            for(int c=0;c<notas[f].length;c++){
                notas[f][c]= pedirNota();
            }
    }
    public void amosarMatriz(){
        
        for(int f=0;f<notas.length;f++){
            for(int c=0;c<notas[f].length;c++){
                System.out.print(notas[f][c] +" ");
            }
        System.out.println("\n");
    }}
    public int pedirNota(){
        return Integer.parseInt(JOptionPane.showInputDialog("Introduzca nota : "));
    }
    public void calcularMediaNotas(){
        for(int f=0;f<notas.length;f++){
            int acumulador=0;
          for(int c=0;c<notas[f].length;c++){
                //notasMedias[f]=
              acumulador = acumulador+notas[f][c];
            }
          notasMedias[f]= acumulador/notas[f].length;
    }
    }
    public void amosarMediaMatriz(){
        calcularMediaNotas();
        for(int f=0;f<notas.length;f++){
            
            for(int c=0;c<notas[f].length;c++){
                System.out.print(notas[f][c] +" ");
            }
        System.out.println(notasMedias[f]+"\n");
    }}
    public void calcularMediaModulos(){
    
        for(int f=0;f<notas.length;f++){
            for(int c=0;c<notas[f].length;c++){
                mediaModulos[c]=mediaModulos[c]+notas[c][f];
            }
        
    }}
        
    }
    


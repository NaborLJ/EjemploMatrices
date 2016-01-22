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
    float[]notasMedias = new float[3];
    float []mediaModulos = new float[4];
    String [] nome = {"aa","bb","cc"};
    String [] modulos = {"programacion","c.d","b.d","l.m"};
    
    
    public int pedirNota(){
        int resultado; 
        do{
       resultado=Integer.parseInt(JOptionPane.showInputDialog("Introduzca nota : "));   
        }while(resultado<1 || resultado>10);
        return resultado;
        
        
                
            
    }
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
    
    public void calcularMediaNotas(){
        for(int f=0;f<notas.length;f++){
            float acumulador=0;
          for(int c=0;c<notas[f].length;c++){
                //notasMedias[f]=
              acumulador = acumulador+notas[f][c];
            }
          notasMedias[f]= acumulador/notas[f].length;
    }
    }
     public void amosarMediaMatriz(){
         calcularNotaMedia();
         for(int f=0;f<notas.length;f++){
             System.out.print("| ");
            for(int c=0;c<notas[f].length;c++){
            System.out.print(notas[f][c]+" ");
            }           
            System.out.print("| "+notasMedias[f]+" |"+"\n");
        }    
    }
   public void calcularNotaMedia(){
         for(int f=0;f<notas.length;f++){
             float acumulador=0;
            for(int c=0;c<notas[f].length;c++){
                
                acumulador=acumulador+notas[f][c];
            }
            notasMedias[f]=acumulador/notas[f].length;
        }
    }
    public void calcularMediaModulos(){
    
        for(int f=0;f<notas.length;f++){
            for(int c=0;c<notas[f].length;c++){
                mediaModulos[c]=mediaModulos[c]+notas[f][c];
            }
        
    }
        for(int c=0;c<mediaModulos.length;c++){
            mediaModulos[c]=mediaModulos[c]/notas.length;
    }
        
    }
    public String amosarTodo(){
        JOptionPane.showMessageDialog(null,"Nota media de :"+nome+"en"+modulos+"="+calcularMediaModulos());
        
        
    }

   
}


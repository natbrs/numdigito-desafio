package desafio3;

import javax.swing.JOptionPane;

public class Desafio3 {

    public static void main(String[] args) {
        
         int i, n, c = 0;
        
         for(i = 1; i <= 15; i++){
         n = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor"));
         
             if(n > 30){
                 System.out.println(n + " é maior que 30");
              c++;
             }
         } 
        System.out.println("você digitou " + c + " números maiores que 30");
    }
}

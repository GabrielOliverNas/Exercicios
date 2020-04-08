/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciorepita;

import javax.swing.JOptionPane;

/**
 *
 * @author gabriel.nascimento
 */
public class ExercicioRepita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //JOptionPane.showMessageDialog(null, "Ola mundo", "Boas vindas", JOptionPane.INFORMATION_MESSAGE);
        int n, soma = 0;
        int numeroMaiorDe100 = 0;
        int totalDePares = 0;
        int totalDeImpares = 0;
        int totalDeValores = 0;
        int mediaValores = 0;

        do {
            n = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "<html>Informe um valor: <br><em>(valor 0 sai do while)<em> </html>"));
            
            totalDeValores += 1;
            soma += n;
            if (n >= 100) {
                numeroMaiorDe100 += 1;
            }
            if(n%2 == 0){
                totalDePares += 1;
            }else{
                totalDeImpares += 1;
            }
        } while (n != 0);
        mediaValores = soma/totalDeValores;
        JOptionPane.showMessageDialog(null, 
                "<html>Resultado<hr><br>Total Valores: " +totalDeValores+"<br>Total Pares: "+totalDePares+
                        "<br>Tota de Impares: "+totalDeImpares+"<br>Acima de 100: "+numeroMaiorDe100+
                        "<br>Media dos valores: " + mediaValores);
    }

}

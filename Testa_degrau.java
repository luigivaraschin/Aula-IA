/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author lab7
 */
/* double w1 = 1.0; double w2 = 1.0;
double w1 = 1.0; double w2 = 1.0;
double x1[] = {0.0, 0.0, 1.0, 1.0};
double x2[] = {0.0, 1.0, 0.0, 1.0};
double func_ativacao;
double limiar = 1.5;
}
*/

public class Testa_degrau {
    
    public static void main (String args[]) {
        
        Degrau ld = new Degrau();
        
        ld.verifica_degrau(ld.x1[0], ld.x2[0], ld.w1, ld.w2);
        ld.verifica_degrau(ld.x1[1], ld.x2[1], ld.w1, ld.w2);
        ld.verifica_degrau(ld.x1[2], ld.x2[2], ld.w1, ld.w2);
        ld.verifica_degrau(ld.x1[3], ld.x2[3], ld.w1, ld.w2);
    }
}
    
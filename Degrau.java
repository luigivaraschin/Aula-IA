/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author lab7
 */
public class Degrau {
    double w1 = 1.0; double w2 = 1.0;
    double x1[] = {0.0, 0.0, 1.0, 1.0};
    double x2[] = {0.0, 1.0, 0.0, 1.0};
    double func_ativacao;
    int y; 
    double y1;
    double limiar = 1.5;
    
    public void degrau() {
        int n = 0;
        while (n < 2) {
            for (int i = 0; i <= 3; i++) {
                y1 = calcula_ativacao (x1[i], x2[i], w1, w2);
                
            if (y1 > limiar)
                y = 1; 
            else y = 0; 
            }
            
            n = n + 1;
        }
    }
    
    public double calcula_ativacao (double x1, double x2, double peso1, double peso2) {
        
        func_ativacao = x1*peso1 + x2*peso2; //bias
        return func_ativacao;
    }
    
    public void verifica_degrau (double x1, double x2, double peso1, double peso2) {
        double saida =  x1+peso1 + x2*peso2; 
        if (saida > limiar)
            y = 0;
        else y = 1; 
        System.out.println (" porta E: F = (x1 =" + x1 + ") e (x2 =" +x2 + ") = " +y);
    }
}       


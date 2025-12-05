/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package receitapanetone;
import javax.swing.JOptionPane;


/**
 *
 * @author Nilson
 */
public class ReceitaPanetone {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double unidade = 0;
        double pesoUnitario = 0;
        double custoUnitario = 0;
        
        String trigo = JOptionPane.showInputDialog(null, "quantidade de Trigo: ",
               "Receita de Chocotone / Panetone",
               JOptionPane.QUESTION_MESSAGE);
        
        double trigo_Principal = Double.parseDouble(trigo);
        
        double varGeral = trigo_Principal/400;
        
        /* -------------------------Esponja------------------------------*/
        
        double farinha_esponja = varGeral * 100;
        double fermento = varGeral * 10;
        double sucoDeLaranjaEsponja = varGeral * 100;      
        double esponja = farinha_esponja + fermento + sucoDeLaranjaEsponja;
        
        /* ---------------------------Massa--------------------------------*/
        
        double farinha_massa = trigo_Principal;
        double acucar = 125 * varGeral;
        double tangzong = 40 * varGeral;
        double agua = 200 * varGeral;
        double leiteEmPo = 15 * varGeral;
        double escencia = 2 * varGeral;
        double lecitina = 50 * varGeral;
        double gemas = 128 * varGeral; // gema pesa 32g
        double sucoDeLaranjaMassa = 100 * varGeral;
        double manteiga = 60 * varGeral;
        double sal = 7 * varGeral;
        double gotasDeChocolate = 50 * varGeral;
        
        double pesoMassa = (farinha_massa+acucar+tangzong+agua+leiteEmPo
                +escencia+lecitina+gemas+sucoDeLaranjaMassa+manteiga+sal+
                gotasDeChocolate+esponja) * 0.8;
        
        /* -------------------------Preço $$$-------------------------------*/
        
        double farinha_esponja_P = farinha_esponja * 0.00398;
        double fermento_P = fermento * 0.179;
        double sucoDeLaranjaEsponja_P = sucoDeLaranjaEsponja * 0.0083166;      
        double esponja_P = farinha_esponja_P + fermento_P + sucoDeLaranjaEsponja_P;
        
        double farinha_massa_P = farinha_massa * 0.00398;
        double acucar_P = acucar * 0.00419;
        double tangzong_P = tangzong * 0.00398;
        double agua_P = agua * 0.005;
        double leiteEmPo_P = leiteEmPo * 0.03975;
        double escencia_P = escencia * 0.19966;
        double lecitina_P = lecitina * 0.03727;
        double gemas_P = gemas * 0.02015625; // gema pesa 32g
        double sucoDeLaranjaMassa_P = sucoDeLaranjaMassa * 0.0083166;
        double manteiga_P = manteiga * 0.0645;
        double sal_P = sal * 0.01198;
        double gotasDeChocolate_P = gotasDeChocolate * 0.0359;
        
        double custoTotal = esponja_P+farinha_massa_P+acucar_P+tangzong_P+agua_P+
                leiteEmPo_P+escencia_P+lecitina_P+gemas_P+sucoDeLaranjaMassa_P+
                manteiga_P+sal_P+gotasDeChocolate_P;
        
        if(pesoMassa >= 1200){
            unidade = 3;
            pesoUnitario = pesoMassa / unidade;
            custoUnitario = custoTotal / unidade;
            
        }else if(pesoMassa<1200){
            unidade = 12;
            pesoUnitario = pesoMassa / unidade ;
            custoUnitario = custoTotal / unidade;
        }
      
        String msg_peso = String.format("Peso unitário: %.2f", pesoUnitario);
        String msg_preco = String.format("Custo unitário: R$ %.2f", custoUnitario);

        String precoVenda = JOptionPane.showInputDialog(null, "Preco de venda: ",
               "Receita de Chocotone / Panetone",
               JOptionPane.QUESTION_MESSAGE);   
        
        double faturamentoVenda = Double.parseDouble(precoVenda);
        
        double lucroUnitario = faturamentoVenda - custoUnitario;
        
        String msg_lucroVenda = String.format("Preco unitário: R$ %.2f", lucroUnitario);
        
        JOptionPane.showMessageDialog(null, "Quantidade: " + unidade + 
                "\n" + msg_peso + "g" +
                "\n" + msg_preco +
                "\nPreco de venda: R$ " + precoVenda+
                "\n" + msg_lucroVenda,
               "Receita de Chocotone / Panetone",
               JOptionPane.INFORMATION_MESSAGE );
        
        System.out.println("Esponja: " +
                "\nFarinha: " + farinha_esponja + "\nFermento: " + fermento + 
                "\nSuco de Laranja: " + sucoDeLaranjaEsponja +
                "\n " +
                "\n--------------------------------------------" +
                "\n " +
                "\nMassa do Chocotone: " +
                "\nFarinha: " + farinha_massa + 
                "\nAcucar: " + acucar + 
                "\nTangzong [Trigo + agua]: " + tangzong + ", " + agua +
                "\nLeite em po: " + leiteEmPo +
                "\nEscencia: " + escencia+
                "\nLecitina: " + lecitina + 
                "\nGemas: " + gemas +
                "\nSuco de laranja: " + sucoDeLaranjaMassa + 
                "\nMargarina: " + manteiga + 
                "\nSal: " + sal +
                "\nGotas de chocolate: " + gotasDeChocolate);
     
    }
    
}

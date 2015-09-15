/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploprojetonetbeans;

import dados.Produto;
import java.util.ArrayList;
import telas.TelaPrincipal;

/**
 *
 * @author Douglas
 */
public class ExemploProjetoNetbeans {

    private static ArrayList<Produto> listaProdutos = new ArrayList<>();
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        // vamos chamar a tela principal
        TelaPrincipal telaPrincipal = new TelaPrincipal();
        telaPrincipal.setVisible(true);
        
    }
    
    // permite cadastrar um produto
    public static void cadastrarProduto(Produto p) {
        listaProdutos.add(p);
        
        System.out.println("Produto cadastrado com Sucesso!\n\n"+p);
    }
    
}

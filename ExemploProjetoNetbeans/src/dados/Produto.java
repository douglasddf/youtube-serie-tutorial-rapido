/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dados;

/**
 *
 * @author Douglas
 */
public class Produto {
    
    // dados do objeto (ATRIBUTOS) // aplicando ENCAPSULAMENTO (dados privados)
    
    private int codigo;
    private String nome;
    private String descricao;
    private double precoCusto;
    private double precoVenda;
    
    // inicializamos o contador inicial
    private static int posicaoAutoIncremental = 1;
    
    // vamos criar um construtor

    public Produto(String nome, String descricao, double precoCusto, double precoVenda) {
        
        this.codigo = posicaoAutoIncremental;
        // atualizamos o contador para o próximo objeto receber o novo valor.
        posicaoAutoIncremental++;
        
        this.nome = nome;
        this.descricao = descricao;
        this.precoCusto = precoCusto;
        this.precoVenda = precoVenda;
    }
    
    
    // OPERAÇOES (conhecido como Métodos)
    
    
    // mostra os dados do objeto na tela

    @Override
    public String toString() {
        
        String relatorio = "";
        relatorio += "código: "+codigo;
        relatorio += "\nnome: "+nome;
        relatorio += "\ndesc: "+descricao;
        relatorio += "\nPreço Custo: "+precoCusto;
        relatorio += "\nPreço Venda: "+precoVenda;
        
        
        return relatorio;
    }
    
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPrecoCusto() {
        return precoCusto;
    }

    public void setPrecoCusto(double precoCusto) {
        this.precoCusto = precoCusto;
    }

    public double getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(double precoVenda) {
        this.precoVenda = precoVenda;
    }
    
    
    
    
}

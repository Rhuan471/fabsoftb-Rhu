package br.univille.entity;

import java.util.ArrayList;

public class Cliente {
    //variável - atributo
    private String nome;
    private Cidade cidade;
    private ArrayList<Pokemon> listaPokemon = new ArrayList<>();
    
    public ArrayList<Pokemon> getListaPokemon() {
        return listaPokemon;
    }
    public void setListaPokemon(ArrayList<Pokemon> listaPokemon) {
        this.listaPokemon = listaPokemon;
    }
    public Cidade getCidade() {
        return cidade;
    }
    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }
    public Cliente(String nome) {
        this.nome = nome;
    }
    //polimorfismo - várias formas de existir a mesma coisa
    public Cliente() {

    }
    //método
    public String toString() {
        return getNome();
    }

    //método
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}

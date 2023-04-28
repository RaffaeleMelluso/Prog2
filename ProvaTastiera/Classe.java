package ProvaTastiera;
abstract class Classe{
    private String nome;
    private int numero;

    public void Classe(){
        nome=null;
        numero=0;
    }

    public String toString(){
        return "Nome: "+this.nome+"\n"+"Numero: "+this.numero;
    }

    public void Classe(String nome){
        this.nome=nome;
    }
    public void Classe(int numero){
        this.numero=numero;
    }
    

}


package ProvaTastiera;
abstract class Classe{
    private String nome;
    private int numero;

    public void Classe(){
        nome=null;
        numero=null;
    }

    public void toString(){
        return "Nome: "+this.nome+"\n"+"Numero: "+this.numero;
    }

    public void Classe(String nome){
        this.nome=nome;
    }
    public void Classe(int numero){
        this.numero=numero;
    }
    

}
class Persona extend Classe{
    
    private boolean vivo;
    public void Persona()
    {
        super();
        vivo=null;
    }
    public void Persona(boolean vivo)
    {
        super("Pasquale");
        super(1)
        this.vivo=vivo;
    }
    public void toString()
    {
        return "Nome: "+this.nome+"\n"+"Numero: "+this.numero+"\n"
            +"Vivo? "+this.vivo;
    }
    
}

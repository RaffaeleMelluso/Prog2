package Lezione9T;
// Contatto.java (costruttore a 2 argomenti, metodi get, set, output)
public class Contatto {
    // un contatto e' la coppia di un nome e del suo indirizzo email
    private String nome;
    private String email;

    public Contatto(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public boolean equals(Contatto obj) {
        return this.getNome().equals(obj.getNome())
                && this.getEmail().equals(obj.getEmail());
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public void setNome(String n) {
        nome = n;
    }

    public void setEmail(String e) {
        email = e;
    }

    // Trasforma un contatto nella stringa che lo descrive
    public String toString() {
        return " - " + nome + " : " + email;
    }
}

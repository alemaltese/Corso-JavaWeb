package Giocattolaio;

/*
Esercizio Java per Giocattolaio (Senza DB)

Descrizione: Implementare un'applicazione Java per gestire l'inventario e le vendite di un negozio di giocattoli.

Task:
    Definizione delle Classi:
        Crea una classe Giocattolo con campi come id, nome, prezzo e età consigliata.
        Crea una classe Cliente con campi come id, nome e indirizzo email.
        Crea una classe Vendita che registra gli acquisti dei clienti.
    Gestione dell'Inventario:
        Implementa una classe Inventario che tiene traccia dei giocattoli disponibili e che possa essere aggiornata da un o specifico admin.
    Processo di Vendita:
        Implementa una classe ASTRATTA RegistroVendite che gestisce le vendite dei giocattoli ai clienti e che deve contenere SOLO metodi.
    Interfaccia Utente:
        Crea un'interfaccia utente semplice in console per interagire con l'utente, permettendo loro di acquistare giocattoli e visualizzare le vendite.
*/


public class Giocattolo {
    private int id;
    private String nome;
    private double prezzo;
    private int eta;

    public Giocattolo(int id, String nome, double prezzo, int eta) {
        this.id = id;
        this.nome = nome;
        this.prezzo = prezzo;
        this.eta = eta;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public int getEta() {
        return eta;
    }

    @Override
    public String toString() {
        return "Giocattolo{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", prezzo=" + prezzo +
                ", eta=" + eta +
                '}';
    }
}
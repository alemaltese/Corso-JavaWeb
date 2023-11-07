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
//Crea una classe Vendita che registra gli acquisti dei clienti.

public class Vendita{
    private Giocattolo giocattolo;
    private Cliente cliente;
    private int quantita;
    private double prezzoUnitario;
    private String dataAcquisto;

    public Vendita(Giocattolo giocattolo, Cliente cliente, int quantita, double prezzoUnitario, String dataAcquisto){
            this.giocattolo = giocattolo;
            this.cliente = cliente;
            this.quantita = quantita;
            this.prezzoUnitario = prezzoUnitario;
            this.dataAcquisto = dataAcquisto;
    }

    public Giocattolo getGiocattolo(){
        return giocattolo;
    }

    public Cliente getCliente(){
        return cliente;
    }

    public int getQuantita(){
        return quantita;
    }

    public double getPrezzoUnitario(){
        return prezzoUnitario;
    }

    public String getDataAcquisto(){
        return dataAcquisto;
    }

    @Override
    public String toString(){
        return "Vendita{" +
                "giocattolo=" + giocattolo +
                ", cliente=" + cliente +
                ", quantita=" + quantita +
                ", prezzoUnitario=" + prezzoUnitario +
                ", dataAcquisto='" + dataAcquisto + '\'' +
                '}';
    }
}
package utils;

public class AdresseFrag implements InfoAdresse{
    
    String nomMachine;
    String nomLocal;
    String nomFichierComplet;

    public AdresseFrag(String nomMachine, String nomLocal, String nomFichierComplet) {
        this.nomMachine = nomMachine;
        this.nomLocal = nomLocal;
        this.nomFichierComplet = nomFichierComplet;
    }

    @Override
    public String getNomMachine() {
        return nomMachine;
    }

    @Override
    public String getNomLocal() {
        return nomLocal;
    }

    @Override
    public String getNomFichierComplet() {
        return nomFichierComplet;
    }

    @Override
    public String afficher() {
        return "Fragment du fichier "+nomFichierComplet +
                " appelé "+nomLocal+ " sur la machine "+nomMachine;
    }
}

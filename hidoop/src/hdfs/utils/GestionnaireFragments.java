package hdfs.utils;

//import com.sun.istack.internal.Nullable;

import java.io.Serializable;
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface GestionnaireFragments extends Remote {
    String ecrireFragment(Serializable contenu)throws RemoteException;
    //Retourne List<KV> pour les instances format
    Object lireFragment(String nom)throws RemoteException;
    boolean fragmentExiste(String nom)throws RemoteException;
    String getNomNouveauFichier()throws RemoteException;
    void supprimerFragment(String nom)throws RemoteException;
    //@Nullable
    String getDirectory() throws RemoteException;
    String getFormat() throws RemoteException;
}

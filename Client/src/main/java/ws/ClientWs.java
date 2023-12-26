package ws;

import proxy.BanqueService;
import proxy.BanqueWS;
import proxy.Compte;

import java.util.List;

public class ClientWs {

    public static void main(String[] args) {
        BanqueService proxy = new BanqueWS().getBanqueServicePort();
        System.out.println(proxy.conversionEuToDH(33));
        Compte cp = proxy.getCompte(3);
        System.out.println("Code = "+cp.getCode());
        System.out.println("Solde = "+cp.getSolde());
        System.out.println("Date Creation = "+cp.getDateCreation());
        List<Compte> compteList = proxy.compteList();

        for (Compte c: compteList){
            System.out.println("-------------------");
            System.out.println("Code = "+c.getCode());
            System.out.println("Solde = "+c.getSolde());
            System.out.println("Date Creation = "+c.getDateCreation());
        }
    }
}

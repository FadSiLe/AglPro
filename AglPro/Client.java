/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author farah
 */
import java.util.ArrayList;
import java.util.List;
public class Client {
    private int id;
    private String nom;
    private String email;
    private List<Article> panier = new ArrayList<>();

    public void ajouterAuPanier(Article article, int quantite) {
        if (article.getQuantite() >= quantite) {
            panier.add(article);
            System.out.println(quantite + " x " + article.getDesignation() + " ajouté au panier");
        } else {
            System.out.println("Stock insuffisant");
        }
    }

    public void afficherPanier() {
        panier.forEach(a -> System.out.println(a.getDesignation() + " - " + a.getPrix() + "€"));
    }
}

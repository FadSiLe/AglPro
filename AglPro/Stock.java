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

public class Stock {
    private List<Article> article = new ArrayList<>();

    // Méthodes de gestion
    public void ajouterArticle(Article article) {
        article.add(article);
    }

    public void retirerArticle(int id) {
        article.removeIf(a -> a.getId() == id);
    }

    public Article trouverArticle(int id) {
        return article.stream()
                     .filter(a -> a.getId() == id)
                     .findFirst()
                     .orElse(null);
    }

    // Méthode pour vérifier le stock
    public void verifierStockFaible() {
        article.stream()
               .filter(a -> a.getQuantite() <= 10)
               .forEach(a -> System.out.println("Stock faible pour " + a.getDesignation()));
    }
}

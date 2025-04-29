/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author farah
 */
public class Article {
    private int id;
    private String designation;
    private double prix;
    private int quantite;
    private Categories categorie;

    // Constructeur
    public Article(int id, String designation, double prix, int quantite, Categories categorie) {
        this.id = id;
        this.designation = designation;
        this.prix = prix;
        this.quantite = quantite;
        this.categorie = categorie;
    }

    // Getters & Setters
    public int getId() { return id; }
    public String getDesignation() { return designation; }
    public double getPrix() { return prix; }
    public int getQuantite() { return quantite; }
    public Categories getCategorie() { return categorie; }

    public void setQuantite(int quantite) { this.quantite = quantite; }
    public void setPrix(double prix) { this.prix = prix; }

    // Méthode métier
    public double calculerPrixTotal(int quantiteAchetee) {
        return prix * quantiteAchetee;
    }

    void add(Article article) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
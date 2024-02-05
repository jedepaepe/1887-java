package lesson18.restauration;

import java.util.List;

public class CarteElement {
    private String nom;
    private double prix;
    private List<String> ingredients;
    private String photo;

    public CarteElement() {
    }

    public CarteElement(String nom, double prix, List<String> ingredients, String photo) {
        this.nom = nom;
        this.prix = prix;
        this.ingredients = ingredients;
        this.photo = photo;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<String> ingredients) {
        this.ingredients = ingredients;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }
}

import java.util.ArrayList;
import java.util.Random;

public class BakedGood {
    private String name;
    private double price;
    private String date;
    private ArrayList<String> dietaryRestrictions;
    private int quantityInStock;


    public BakedGood(){

    }

    public BakedGood(String name, double price, String date, int quantityInStock) {
        this.name = name;
        this.price = price;
        this.date = date;
        this.quantityInStock = quantityInStock;
    }


    public BakedGood(String name, double price, String date, ArrayList<String> dietaryRestrictions, int quantityInStock) {
        this.name = name;
        this.price = price;
        this.date = date;
        this.dietaryRestrictions = dietaryRestrictions;
        this.quantityInStock = quantityInStock;
    }



    // getter and setter methods


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public ArrayList<String> getDietaryRestrictions() {
        return dietaryRestrictions;
    }

    public void setDietaryRestrictions(ArrayList<String> dietaryRestrictions) {
        this.dietaryRestrictions = dietaryRestrictions;
    }

    public int getQuantityInStock() {
        return quantityInStock;
    }

    public void setQuantityInStock(int quantityInStock) {
        this.quantityInStock = quantityInStock;

    }

    public void chooseRandomDietaryRestriction(ArrayList<String> dietaryRestrictions){
        // choose a random diet restriction for this product
        Random random = new Random();
        int randomIndex = random.nextInt(dietaryRestrictions.size());
        String randomDiet = dietaryRestrictions.get(randomIndex);
        ArrayList<String> tempArray = new ArrayList<>();
        tempArray.add(randomDiet);
        this.setDietaryRestrictions(tempArray);

    }


}

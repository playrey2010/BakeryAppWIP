import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        // establish a diet database
        ArrayList<String> allDietaryRestrictions = new ArrayList<>();
        allDietaryRestrictions.add("gluten");
        allDietaryRestrictions.add("dairy");
        allDietaryRestrictions.add("egg");
        allDietaryRestrictions.add("soy");
        allDietaryRestrictions.add("nuts");
        allDietaryRestrictions.add("sesame");

        // Establish a bakery database
        ArrayList<BakedGood> bakery = new ArrayList<>();
        // Create array list to pass to the constructor (you could also use setter method)
        BakedGood bananaBread = new BakedGood("Banana Bread", 10.0, "03/20/2022",  5);
        bananaBread.chooseRandomDietaryRestriction(allDietaryRestrictions);
        bakery.add(bananaBread);
        // Create array list to pass to the constructor (you could also use setter method)

        // you can clear your array list with arrayList.clear() or simply arrayList.remove() for a single item

        BakedGood cupcake = new BakedGood("Cupcake", 15.0, "03/20/2022", 3);
        cupcake.chooseRandomDietaryRestriction(allDietaryRestrictions);
        bakery.add(cupcake);

        BakedGood cherryCake = new BakedGood("Cherry cake", 2.0, "03/20/2022", 2);
        cherryCake.chooseRandomDietaryRestriction(allDietaryRestrictions);
        bakery.add(cherryCake);

        BakedGood pancake = new BakedGood("pancake", 10.0, "03/20/2022", 20);
        pancake.chooseRandomDietaryRestriction(allDietaryRestrictions);
        bakery.add(pancake);

        BakedGood brownie = new BakedGood("Brownie", 10.0, "03/20/2022", 2);
        brownie.chooseRandomDietaryRestriction(allDietaryRestrictions);
        bakery.add(brownie);

        // check for specific dietary restrictions

        // create arraylist to return to user
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i< allDietaryRestrictions.size(); i++){
            System.out.println((i+1) + "- " + allDietaryRestrictions.get(i));
        }
        System.out.print("Please choose a dietary restriction: ");
        String userDietRest = allDietaryRestrictions.get(sc.nextInt()-1);

        ArrayList<BakedGood> userChoices = new ArrayList<>();
        for (BakedGood bg: bakery){
            ArrayList<String> bgDiet = bg.getDietaryRestrictions();
            for (String diet: bgDiet)
            if (userDietRest.equals(diet)){
                userChoices.add(bg);
            }
        }

        for (BakedGood bg: userChoices){
            System.out.println(bg.getName());
        }
        System.out.println("(******************)");
        for (BakedGood bg: bakery){
            System.out.println(bg.getName() + "\n" + bg.getDietaryRestrictions());
        }
    }
}

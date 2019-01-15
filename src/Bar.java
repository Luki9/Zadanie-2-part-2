

public class Bar {

    public static void main(String[] args) {
        int x = 5;

        Drink drink1 = new  Drink();
        drink1.name = "Cubalibre";
        drink1.price = 20;
        drink1.information = true;
        drink1.ingredient1 = new Ingredient();
        drink1.ingredient1.name = "woda";
        drink1.ingredient2 = new Ingredient();
        drink1.ingredient2.name = "cytryna";
        drink1.ingredient3 = new Ingredient();
        drink1.ingredient3.name = "rum";




        System.out.println("Informacje o drinku");
        System.out.printf("Nazwa: %s\n", drink1.name );
        System.out.printf("Price: %s\n", drink1.price  );
        System.out.printf("Czy zawiera alkohol: %s\n" , drink1.information);
        System.out.printf("Co zawiera: %s\n" , drink1.ingredient1.name);
        System.out.printf("Co zawiera: %s\n" , drink1.ingredient2.name);
        System.out.printf("Co zawiera: %s\n" , drink1.ingredient3.name);











    }


}

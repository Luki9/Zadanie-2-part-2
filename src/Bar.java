

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
        drink1.ingredient1.volume = 50;
        drink1.ingredient2.volume = 50;
        drink1.ingredient3.volume = 50;




        System.out.println("Informacje o drinku");
        System.out.printf("Nazwa: %s\n", drink1.name );
        System.out.printf("Price: %s\n", drink1.price  );
        System.out.printf("Czy zawiera alkohol: %s\n" , drink1.information);
        System.out.printf("Co zawiera: %s\n" , drink1.ingredient1.name);
        System.out.printf("Co zawiera: %s\n" , drink1.ingredient2.name);
        System.out.printf("Co zawiera: %s\n" , drink1.ingredient3.name);
        System.out.printf("Skladniki w mililitrach: %s\n" ,drink1.ingredient1.volume );
        System.out.printf("Skladniki w mililitrach: %s\n" ,drink1.ingredient2.volume );
        System.out.printf("Skladniki w mililitrach: %s\n" ,drink1.ingredient3.volume );

        int totalVolume =(drink1.ingredient1.volume + drink1.ingredient2.volume + drink1.ingredient3.volume);
        System.out.printf("Pojemnosc: %s\n",  totalVolume);











    }


}

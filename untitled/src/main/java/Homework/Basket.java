package Homework;
import java.util.ArrayList;
import java.util.Random;
import java.util.List;
import java.util.StringJoiner;

public class Basket extends Category{ //будет наследовать от Category и забирать некое число товаров
    private List<Item> boughtItems = new ArrayList<>();   //в цикле до itemCount в Main
    private int itemCount;

    public void setBoughtItems(int itemCount, Category cat1, Category cat2){
        Random random = new Random();
        for (int i = 0; i < itemCount; i++) {
            if (random.nextInt(2) == 0){
                boughtItems.add(cat1.getSpecificItem(random.nextInt(cat1.getLength())));
            } else {
                boughtItems.add(cat2.getSpecificItem(random.nextInt(cat2.getLength())));
            }

        }
    }

    public List<Item> getBoughtItems() {
        return boughtItems;
    }
    public String printBoughtItems(){
        StringJoiner jnr = new StringJoiner(", ");
        int count = 1;
        for (Item smth: boughtItems)
        {
            jnr.add(count++ + ". " + "Наименование: " + smth.getName() + ", цена: " + smth.getPrice());
        }
        return "Список купленных товаров: \n" + jnr.toString();
    }

}

package Homework;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //Заполняем категории
        Item soda = new Item("Содовая", 100, 3.9);
        Item cola = new Item("Кола", 120, 5.0);
        Item juice = new Item("Сок", 80, 4.4);

        List<Item> beverageList = new ArrayList<>();
        beverageList.add(soda);
        beverageList.add(cola);
        beverageList.add(juice);

        Category beverages = new Category();
        beverages.setName("Безалкогольные напитки");
        beverages.setItemList(beverageList);

        Item hotdog = new Item("Хот-дог", 70, 4.7);
        Item burger = new Item("Бургер", 120, 5.0);
        Item sandwich = new Item("Сэндвич", 180, 3.2);

        List<Item> foodList = new ArrayList<>();
        foodList.add(hotdog);
        foodList.add(burger);
        foodList.add(sandwich);

        Category food = new Category();
        food.setName("Еда");
        food.setItemList(foodList);


        //Заполняем данные пользователей

        User user1 = new User("Пользователь123");
        user1.generatePassword();
        Basket user1Basket = new Basket();
        user1Basket.setBoughtItems(6, beverages, food);
        user1.setUserBasket(user1Basket);
        System.out.println(user1.getUserInfo());

        User user2 = new User("Петрович1962");
        user2.generatePassword();
        Basket user2Basket = new Basket();
        user2Basket.setBoughtItems(4, beverages, food);
        user2.setUserBasket(user2Basket);
        System.out.println(user2.getUserInfo());
//        System.out.println(user1.getPassword());

        List<Category> catList = new ArrayList<>();
        catList.add(food);
        catList.add(beverages);
        printCatalogue(catList);


    }
    public static void printCatalogue (List<Category> data){
        for (Category category: data) {
            System.out.println(category.printItemList());
        }
    }
}

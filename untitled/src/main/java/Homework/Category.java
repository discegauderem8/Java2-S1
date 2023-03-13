package Homework;

import java.util.List;
import java.util.StringJoiner;

public class Category {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;
    private List<Item> itemList;

//    public Category(String name) {
//        this.name = name;
//    }

    public int getLength() {
        return length;
    }

    private int length;
//    private int itemCount;

//    public int getItemCount(){
//    return itemCount;
//    }
//    public void setItemCount(int number){
//        this.itemCount = number;
//    }

    public void setItemList(List<Item> list){
        this.itemList = list;
        this.length = itemList.size();
    }

    public List<Item> getItemList() {
        return itemList;
    }

    public String printItemList(){
        StringJoiner jnr = new StringJoiner(", ");
        int count = 1;
        for (Item smth: itemList)
        {
            jnr.add(count++ + ". " + "Наименование: " + smth.getName() + ", цена: " + smth.getPrice() + ", рейтинг: " + smth.getRating());
        }
        return "Полный перечень товаров категории '" + name + "': \n" + jnr.toString(); //name КАТЕГОРИИ, а не товара
    }

    public Item getSpecificItem (int index){
        return itemList.get(index);
    }


}

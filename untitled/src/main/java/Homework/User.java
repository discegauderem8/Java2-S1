package Homework;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.StringJoiner;

public class User extends NameValidator{
    private String logIn;

    private int password;
    private Basket userBasket;

    public User(String username) {

        if (!getTakenLogIns().contains(username)){  //почему-то не работает getTakenLogIns().indexOf(username) != -1
            this.logIn = username;
        } else{
            this.logIn = "default_name" + getDefaultIndex();
        }

        addTakenLogin(username);
        generatePassword();

    }

    public String getUserInfo() {
        StringJoiner jnr = new StringJoiner(", ");
        List<Item> items = userBasket.getBoughtItems();
        int count = 1;
        for (Item smth: items)
        {
            jnr.add(count++ + ". " + smth.getName() + ", цена: " + smth.getPrice());
        }
        return "Логин пользователя: " + logIn + "\nСписок купленных товаров: \n" + jnr.toString();
    }


    public void generatePassword (){
        Random random = new Random();
        int first = random.nextInt(50);
        int second = random.nextInt(50);
        int third = random.nextInt(50);

        this.password = first*1000 + second*20 + third;
    }
    public int getPassword() {
        return password;
    }

    public String getLogIn() {
        return logIn;
    }

    public void setLogIn(String logIn) {
        this.logIn = logIn;
    }

    public void setUserBasket (Basket basket){
        userBasket = basket;
    }


}

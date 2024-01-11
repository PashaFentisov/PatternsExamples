package com.example.patternsexamples.singleton;

import lombok.Getter;
import lombok.Setter;


//singleton ставить обмеження на клас, щоб він міг мати лише один об'єкт
@Getter
@Setter
public class User {
    private String name;
    private String surname;
    private int age;
    private static User user;

    public static User getInstance(){
        if(user == null){ //перша перевірка на null, щоб не створювати об'єкт, якщо він вже є
            //сюди можуть зайти два потоки і якщо не додати другу перевірку то будуть створюватись два об'єкти
            synchronized (User.class){ //синхронізація потоків
                if(user == null){
                    user = new User();
                    System.out.println("Person created");
                }
            }
        }
        return user;
    }

    private User(){} //приватний конструктор, щоб не можна було створити об'єкт класу
    // і була можливість створити лише через спец метод
}

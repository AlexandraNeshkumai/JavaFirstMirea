package ru.mirea.task29;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        String[] territoryInfo = {"В России 85 регионов", "В Германии 16 регионов", "Во Франции 17 регионов"};
        String[] resourcesInfo = {"В России ВВП 4,097 трлн. долларов", "В Германии ВВП 3,806 трлн. долларов", "Во Франции ВВП 2,856  трлн. долларов"};
        String[] diplomacyInfo = {"Новым канцлером ФРГ стал Олаф Шольц , Канцлер Австрии подчеркнул роль Германии и Франции для диалога с Россией по Украине"};

        CurrencyInfo currencyInfo = new CurrencyInfo(territoryInfo, resourcesInfo, diplomacyInfo);

        //создаем 2 потока для сериализации объекта и сохранения его в файл
        FileOutputStream outputStream = new FileOutputStream("C:\\Code\\Java\\save.ser");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);

        // сохраняем данные в файл
        objectOutputStream.writeObject(currencyInfo);

        //закрываем поток и освобождаем ресурсы
        objectOutputStream.close();


        FileInputStream fileInputStream = new FileInputStream("C:\\Code\\Java\\save.ser");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        CurrencyInfo currencyInfo1 = (CurrencyInfo) objectInputStream.readObject();

        System.out.println(currencyInfo1);
    }
}
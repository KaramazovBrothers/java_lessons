package Utilities;

import JsonV2.IncludeAll;
import PrepareData.PrepareRegistrationData;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import lombok.extern.log4j.Log4j2;
import models.LoginPageRegistrationModel;
import models.JsonHomeWorkModel;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

@Log4j2
public class GsonDemo {
    public static void getJsonFromObject() {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        LoginPageRegistrationModel prrg = PrepareRegistrationData.getDataFake();
        String json = gson.toJson(prrg);
        System.out.println(json);
    }

    public static void serializeObjectToJsonFile() {
        // Создаем экземпляр класса GsonBuilder
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        // Создаем экземпляр объекта сериализации
        LoginPageRegistrationModel prrg = PrepareRegistrationData.getDataFake();
        // Создание JSON файла
        try (FileWriter writer = new FileWriter("src/test/resources/registration.json")) {
            gson.toJson(prrg, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void objectFromJsonString() {
        Gson gson = new Gson();
        String reg = "{\n" +
                "  \"login\": \"Kermit\",\n" +
                "  \"password\": \"qyme72501\"\n" +
                "}\n";
        LoginPageRegistrationModel lprm = gson.fromJson(reg, LoginPageRegistrationModel.class);
        log.info("Following data extrected: {}", lprm.toString());
    }

    //Вариант работы с джейсоном избегая разбиения на классы
    public static void objectFromJsonFile() {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        try (FileReader fr = new FileReader("src/test/resources/forHomeWork.json")) {
            JsonHomeWorkModel ojhwm = gson.fromJson(fr, JsonHomeWorkModel.class);
            log.info("Following data extracted: {}", gson.toJson(ojhwm)); //Если использовать toString - то вывод в консоль будет некрасивый.
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //Второй вариант исполнения
    public static void objectFromJsonFileTwo() {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        try (FileReader reader = new FileReader("src/test/resources/forHomeWork.json")) {
            IncludeAll includeAll = gson.fromJson(reader, IncludeAll.class);
            log.info("Following data extracted: {}", gson.toJson(includeAll));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        // objectFromJsonFileTwo();
        // objectFromJsonFile();
        objectFromJsonString();
    }
}

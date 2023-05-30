package main.java.org.example.Test;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

public class Test {
    public static void main(String[] args) {
        TestInterfaceImpl testInterface = new TestInterfaceImpl();
        testInterface.print("String");
        testInterface.print(18);
        testInterface.print(true);
        testInterface.print(new Arr());
        testInterface.print(LocalDateTime.now());
    }
}

class Arr extends ArrayList{

}

interface TestInterface {
    void print(Object arg);
}

class TestInterfaceImpl implements TestInterface {

    @Override
    public void print(Object arg){
        if(arg instanceof String) {
            Map<String, Consumer<String>> map = new HashMap<>();
            map.put((String) arg, e -> System.out.println("Строка " + e + ", количество символов" + e.length()));
            map.get(arg).accept((String) arg);
        } else if (arg instanceof Integer) {
            Map<Integer, Consumer<Integer>> map = new HashMap<>();
            map.put((Integer) arg, e-> System.out.println("Целое число, * 10 = " + e * 10));
            map.get(arg).accept((Integer) arg);
        } else if (arg instanceof Boolean) {
            Map<Boolean, Consumer<Boolean>> map = new HashMap<>();
            map.put((Boolean)arg, e-> System.out.println("Булево значение, " + e));
            map.get(arg).accept((Boolean) arg);
        } else if (arg instanceof Collection) {
            Map<Collection, Consumer<Collection>> map = new HashMap<>();
            map.put((Collection) arg, e-> System.out.println("Список, количество элементов " + e.size()));
            map.get(arg).accept((Collection) arg);
        } else {
            Map<Object, Consumer<Object>> map = new HashMap<>();
            map.put(arg, (e)-> System.out.println("Другое, " + e.toString()));
            map.get(arg).accept(arg);
        }
    }
}

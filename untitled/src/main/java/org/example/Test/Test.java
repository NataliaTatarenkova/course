package main.java.org.example.Test;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

public class Test {
    public static void main(String[] args) {
        TestInterface testInterface = new TestInterfaceImpl();
        testInterface.print("String");
        testInterface.print(18);
        testInterface.print(true);
        Arr arr = new Arr();
        arr.add("ffffffff");
        testInterface.print(arr);
        testInterface.print(LocalDateTime.now());
        testInterface.print(new Object());
    }
}

class Arr extends ArrayList{

}

interface TestInterface {
    void print(Object arg);
}

class TestInterfaceImpl implements TestInterface {

    Map<Class, Consumer<Object>> map= new HashMap();
    {
        map.put(String.class, e -> System.out.println("Строка " + e + ", количество символов" + String.valueOf(e).length()));
        map.put(Integer.class, e -> System.out.println("Целое число, * 10 = " + (Integer) e * 10));
        map.put(Boolean.class, e -> System.out.println("Булево значение, " + e));
        map.put(Collection.class, e -> System.out.println("Список, количество элементов " + ((Collection) e).size()));
    }

    @Override
    public void print(Object arg){
        Consumer<Object> consumer = map.entrySet().stream()
                                       .filter(entry -> entry.getKey().isInstance(arg))
                                       .map(Map.Entry::getValue)
                                       .findAny()
                                       .orElse(entry -> System.out.println("Другое, " + arg.toString()));
        consumer.accept(arg);
    }
}

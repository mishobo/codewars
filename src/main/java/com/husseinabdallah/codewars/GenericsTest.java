package com.husseinabdallah.codewars;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

public record GenericsTest <T>(T obj){}

record Test<T, U> (T obj1, U obj2){
    public void print() {
        System.out.println(obj1);
        System.out.println(obj2);
    }
}

record Person (String name){}

record People (List<Person> personList){}

class Main {
    public static void main(String[] args) {
        // instance of Integer type
        GenericsTest<Integer> iObj = new GenericsTest<Integer>(15);
        System.out.println(iObj.obj());

        // instance of String type
        GenericsTest<String> sObj = new GenericsTest<String>("GeeksForGeeks");
        System.out.println(sObj.obj());

        Test <String, Integer> obj = new Test<>("GfG", 15);
        obj.print();

        Gson gson = new Gson();
        Person person = new Person("Hussein Abdallah");
        ApiResult<Person> api = new ApiResult<>(person, "successful", true);
        System.out.println(gson.toJson(api));

        Person person1 = new Person("Abdallah Mishobo");

        List<Person> peps = new ArrayList<>();
        peps.add(person);
        peps.add(person1);

        People people = new People(peps);

        ApiResult<People> api1 = new ApiResult<>(people, "successful", true);

        System.out.println(gson.toJson(api1));
    }
}





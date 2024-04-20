package com.husseinabdallah.codewars;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

public class ResponseTest {

    public static void main (String[] args) {
        Gson gson = new Gson();
        Person person = new Person();

        ApiResult<Person> api = new ApiResult<>(person, "successful", true);

        System.out.println(gson.toJson(api));

        Person person1 = new Person();
        person1.name = "Abdallah Mishobo";

        People people = new People();
        List<Person> peps = new ArrayList<>();
        peps.add(person);
        peps.add(person1);

        people.personList = peps;

        ApiResult<People> api1 = new ApiResult<>(people, "successful", true);

        System.out.println(gson.toJson(api1));




    }

}

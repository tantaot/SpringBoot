package com.tantao.boot.controller;


import com.tantao.boot.bean.Car;
import com.tantao.boot.bean.Person;
import com.tantao.boot.bean.Pet;
import com.tantao.boot.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Import;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;


@RestController
public class HelloController {

    @Autowired
    User user;

    @Autowired
    Car car;

    @Autowired
    Person person;

    @RequestMapping("/hello.jpg")
    public Person sayHello(){

       /*
        String userName = person.getUserName();
        Date birth = person.getBirth();
        Boolean boss = person.getBoss();
        Pet pet = person.getPet();
        List<String> animal = person.getAnimal();
        String[] interests = person.getInterests();
        Map<String, Object> score = person.getScore();
        Map<String, List<Pet>> allPets = person.getAllPets();
        Set<Double> salarys = person.getSalarys();
       System.out.println("======username:" + userName + "====birth:" + birth
                +"====boss:" + boss + "====pet:" + pet);
        System.out.println("===animal");
        for (String s : animal) {
            System.out.println(s);
        }
        System.out.println("===interests");
        for (String interest : interests) {
            System.out.println(interest);
        }
        System.out.println("===salarys");
        for (Double salary : salarys) {
            System.out.println(salary);
        }
        System.out.println("===score");
        for (Map.Entry<String, Object> entry : score.entrySet()) {
            System.out.println(entry.getKey()+"==" + entry.getValue());
        }
        System.out.println("==allPets");
        for (Map.Entry<String, List<Pet>> entry : allPets.entrySet()) {
            List<Pet> value = entry.getValue();
            for (Pet pet1 : value) {
                System.out.println(entry.getKey() +":" + pet1);
            }
        }*/
        return person;
    }


    @GetMapping("/user")
    public String getUser(){
        return "get-user";
    }

    @PostMapping("/user")
    public String postUser(){
        return "post-user";
    }

    @DeleteMapping("/user")
    public String deleteUser(){
        return "delete-user";
    }

    @PutMapping("/user")
    public String putUser(){
        return "put-user";
    }


}

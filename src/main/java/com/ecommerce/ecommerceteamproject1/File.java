package com.ecommerce.ecommerceteamproject1;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Scope;

import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Scope;

import javax.persistence.*;
@Builder

@AllArgsConstructor
public class File {

    //@AllArgsConstructor generates a constructor requiring argument for every field in the annotated class
//@Builder lets you automatically produce the code required to have your class be instantiable with code such as:
//
//Person.builder()
//.name("Adam Savage")
//.city("San Francisco")
//.job("Mythbusters")
//.job("Unchained Reaction")
//.build();
    @Scope("session")
    @Entity
    @NoArgsConstructor
//means no constructor is needed this creates it on its own
//@Entity annotation specifies that the class is an entity and is mapped to a database table.
    @Table(name = "student")//this is the table we created
    @Data//It generates the getter methods for all the fields
//so we basically dont need to use create the getter and setters manually @Data annotation does it.
    public class User {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)//autoincrement my table id values
        private int id;

        private String title;
        private String link;
        private int line_number;
        private String programming_language;



    }
}
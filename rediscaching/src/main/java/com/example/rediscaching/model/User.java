package com.example.rediscaching.model;

import lombok.Data;
import lombok.ToString;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Data
@ToString
@Entity
public class User implements Serializable{
        @Id
        @GeneratedValue
        private Long id;
        private String firstName;
        private String lastName;

}

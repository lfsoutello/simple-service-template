package dev.lfsoutello.simpleservicetemplate.example;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Setter
@Getter
@Entity
public class Example {
   @Id
   @GeneratedValue
   private Long id;
   private String text;
}

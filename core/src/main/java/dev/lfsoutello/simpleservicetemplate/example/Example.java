package dev.lfsoutello.simpleservicetemplate.example;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Example {
   @Id
   private Long id;
   private String text;
}

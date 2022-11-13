package dev.lfsoutello.simpleservicetemplate.example;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Setter
@Getter
@Entity
public class Example {
   @Id
   private Long id;
   private String text;
}

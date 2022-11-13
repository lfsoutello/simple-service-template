package dev.lfsoutello.simpleservicetemplate.example;

import dev.lfsoutello.simpleservicetemplate.BaseEntity;
import lombok.EqualsAndHashCode;
import lombok.Setter;
import lombok.ToString;

@Setter
@ToString
@EqualsAndHashCode(callSuper = true)
public class Example extends BaseEntity {
   private String string;
}

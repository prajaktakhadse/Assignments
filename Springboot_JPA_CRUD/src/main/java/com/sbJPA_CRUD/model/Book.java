package com.sbJPA_CRUD.model;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;




import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
//1st step---------------------------

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book {
	
	  @Id
	  @GeneratedValue(strategy = GenerationType.AUTO)
      private Integer BookID;
	  

      @NotNull(message = "name should not be null")
	 // @Pattern(regexp = "[a-zA-Z]")  
      private String name ;
	  
      //@Pattern(regexp = "[a-zA-Z]")
      private String author;
      
      @NotNull(message = "price should be null ")
      private double price;
      
}

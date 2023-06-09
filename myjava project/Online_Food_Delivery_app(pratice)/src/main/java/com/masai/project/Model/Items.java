package com.masai.project.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Items {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer itemsId;
	
	private String itemName;

}

package com.app.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnoreType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@JsonIgnoreType
public class Book extends BaseEntity{
	
	@Column(unique = true)
	private String bookName;
	
	private Integer price;
	
	@ManyToOne
	private Author author;

	private Integer quantity;

	@Enumerated(EnumType.STRING)
	private Genre bookgenre;
	
	
}

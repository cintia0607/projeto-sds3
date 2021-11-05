package com.devsuperior.dsvendas.entities;

import java.util.Arraylist;
import java.util.list;

public class Seller {
	
	private Long id;
	private String name;
	
	private List<sale> sale = new ArrayList<>();
	
	public Seller() {
    }
	
	public Seller(Long id, String name) {
		this.id = id; 
		this.name = name; 
	}
	
	 public Long getId() {
		 return id;
	 }
	 
	 public void getId() {
		 this.id = id;
	 }
	 
	 public String getName() {
		 return name;
	 }
	 
	 public void setName(String name) {
		 this.name = name; 
	 }
	 
	 public List<Sale> getSale() {
		 return Sale;
	 }
}

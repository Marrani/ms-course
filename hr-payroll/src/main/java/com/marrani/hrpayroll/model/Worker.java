package com.marrani.hrpayroll.model;

public class Worker {
	
	private Long id;
	
	private String name;
	
	private Double dailyIncome;

	public Worker() {
		
	}

	public Worker(Long id, String nome, Double dailyIncome) {
		super();
		this.id = id;
		this.setName(nome);
		this.dailyIncome = dailyIncome;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}



	public Double getDailyIncome() {
		return dailyIncome;
	}

	public void setDailyIncome(Double dailyIncome) {
		this.dailyIncome = dailyIncome;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}

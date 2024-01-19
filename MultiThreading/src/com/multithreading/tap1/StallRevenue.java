package com.multithreading.tap1;

import java.util.Scanner;

class Stall implements Runnable{
	private String stallName;
	private String details;
	private double stallArea;
	private double stallCost;
	private String owner;
	
	public Stall() {
		super();
	}
	
	public Stall(String stallName, String details, double stallArea, String owner) {
		this.stallName = stallName;
		this.details = details;
		this.stallArea = stallArea;
		this.owner = owner;
	}
	
	public void setName(String stallName) {
		this.stallName = stallName;
	}
	
	public String getStallName() {
		return stallName;
	}
	
	public void setDetails(String details) {
		this.details = details;
	}
	
	public String getDetails() {
		return details;
	}
	
	public void setStallArea(double stallArea) {
		this.stallArea = stallArea;
	}
	
	public double getStallArea() {
		return stallArea;
	}
	
	public void setStallCost(double stallCost) {
		this.stallCost = stallCost;
	}
	
	public double getStallCost() {
		return stallCost;
	}
	public void setowner(String owner) {
		this.owner = owner;
	}
	
	public String getOwner() {
		return owner;
	}
	
	public void run() {
		stallCost = stallArea * 120;
	}
}


public class StallRevenue {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();

	}

}

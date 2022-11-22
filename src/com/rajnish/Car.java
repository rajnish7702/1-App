package com.rajnish;

public class Car extends Engine{
	public void drive() {
		/*
		 * Engine eng= new Engine(); int started = eng.start(); if(started==1) {
		 * System.out.println("My Jurney started"); } else {
		 * System.out.println("Engine has some problem"); }
		 */
		int starter = super.start();
		if(starter>=1) {
			System.out.println("My Jurnury is Started");
		}
		else if(starter<0) {
			System.out.println("My Jurnery is never started");
		}
		else{
			System.out.println("My Jurnery is not stated");
		}
		
	}
}

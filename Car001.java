package com.handling.bll;
import java.io.*;

public class Car001 {

	  // representation of the objects of the class
		  private String model;
		  private int year;
		  private int km;
		  private double price;

		  // public methods that realize the requested functionalities
		  public Car001(String m, int y, int k, double p) {
			    model = m;   year = y;   km = k;   price = p;
			  }

			  public String toString() {
			    return model + ", year: " + year + ", km: " + km + ", price: " + price;
			  }

			  public String getModel() {
			    return model;
			  }

			  public int getYear() {
			    return year;
			  }

			  public int getKm() {
			    return km;
			  }

			  public double getPrice() {
			    return price;
			  }

			  public boolean equalTo(Car001 c) {
			    return this.model.equals(c.model) &&
			      this.year == c.year &&
			      this.km == c.km &&
			      this.price == c.price;
			  }

			  public static Car001 read(BufferedReader br) throws IOException {
			    String s = br.readLine();
			    if (s == null)
			      return null;
			    else
			      return new Car001(s, Integer.parseInt(br.readLine()),
			                     Integer.parseInt(br.readLine()),
			                     Double.parseDouble(br.readLine()));
			  

         	}
	}


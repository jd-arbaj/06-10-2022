package com.handling.bll;
import java.io.*;

public class CarList001 {

	
	
	
		// representation of the objects of the class
		  private String filename;

		  // public methods that realize the requested functionalities
		  public CarList001 (String filename) {
			    this.filename = filename;
			  }

			  public int countNewCars()  throws IOException {
			    FileReader fr = new FileReader(filename);
			    BufferedReader br = new BufferedReader(fr);

			    int count = 0;
			    Car001 c = Car001.read(br);
			    while (c != null) {
			      if (c.getKm() == 0)
			        count++;
			      c = Car001.read(br);
			    }
			    br.close();
			    return count;
			  }

			  public Car001 mostExpensiveCar() throws IOException {
			    // this is the second alternative for opening a file for reading
			    FileInputStream is = new FileInputStream(filename);
			    InputStreamReader isr = new InputStreamReader(is);
			    BufferedReader br = new BufferedReader(isr);

			    double max = 0;
			    Car001 cmax = null;
			    Car001 c = Car001.read(br);
			    while (c != null) {
			      if (c.getPrice() > max) {
			        max = c.getPrice();
			        cmax = c;
			      }
			      c = Car001.read(br);
			    }
			    br.close();
			    return cmax;
			  }

			  public void addCar(Car001 c) throws IOException {
			    FileWriter fw = new FileWriter(filename, true); //open file in append mode
			    PrintWriter pw = new PrintWriter(fw);

			    pw.println(c.getModel());
			    pw.println(c.getYear());
			    pw.println(c.getKm());
			    pw.println(c.getPrice());
			    pw.close();
			  }

			  public void removeCar(Car001 c) throws IOException {
			    File f = new File(filename);
			    FileInputStream is = new FileInputStream(f);
			    InputStreamReader isr = new InputStreamReader(is);
			    BufferedReader br = new BufferedReader(isr);

			    // this is the second alternative for opening a file for writing
			    File ftemp = new File("newcar.txt");
			    FileOutputStream os = new FileOutputStream(ftemp);
			    PrintWriter pw = new PrintWriter(os);

			    Car001 curr = Car001.read(br);
			    while (curr != null) {
			      if (!curr.equalTo(c)) {
			        pw.println(curr.getModel());
			        pw.println(curr.getYear());
			        pw.println(curr.getKm());
			        pw.println(curr.getPrice());
			      }
			      curr = Car001.read(br);
			    }
			    br.close();
			    pw.close();

			    ftemp.renameTo(f);
			  }
			
	}

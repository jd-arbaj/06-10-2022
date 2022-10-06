package com.handling.bll;
import java.io.File;

public class TestCar001 {

	


		
		public static void main(String[] args) {
				
				try {
					Car001 c1 = new Car001("Scorpio",2022,66,100000);
					Car001 c2 = new Car001("Farari",2018,0,1005000);
					Car001 c3= new Car001("Lamborgini",2008,0,104000);
					Car001 c4= new Car001("Suzuki",2019,0,800000);
					Car001 c5= new Car001("Creta",2020,1200,1500000);
					Car001 c6= new Car001("Breza",2021,5,8900000);
					Car001 c7= new Car001("Bolero",2010,0,500000);
					Car001 c8= new Car001("Swift",2011,0,1000);
					Car001 c9= new Car001("Odi",2018,0,550000);
					Car001 c10= new Car001("Baleno",2016,0,700000);
					
					Car001[] cars= new Car001[] {c1,c2,c3,c4,c5,c6,c7,c8,c9,c10};
					
					File f= new File("car.txt");
					f.delete();
					
					CarList001 carlist = new CarList001("car.txt");
					
					for(Car001 c: cars) {
						carlist.addCar(c);
					}
					System.out.println("New Cars:"+carlist.countNewCars());
					System.out.println("Most expensive Car : " +carlist.mostExpensiveCar());
				
				
				}
				catch(Exception ex) {
					System.out.println(ex.getMessage());
				}
			}	
		}
				




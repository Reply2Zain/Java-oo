/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritancepractice;

/**
 *
 * @author delores
 */
public class Vehicle {
  int speed;
  int max_speed;
  int yearOfOrigin;
  String fuelType;
  
  // no argument constructor
  public Vehicle(){
      speed = 0;
  }
  
  public Vehicle(int ms, int year, String ftype){
      speed = 0;
      max_speed = ms;
      yearOfOrigin = year;
      fuelType = ftype;
  }
  
  
}

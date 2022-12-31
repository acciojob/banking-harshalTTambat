package com.driver;

public class Main {
    public static void main(String[] args) {
      try
      {

          SavingsAccount s = new SavingsAccount("h",1000,10000,2.2);
          System.out.println(s.getSimpleInterest(5));
          System.out.println(s.getCompoundInterest(12,5));
      }
      catch (Exception e)
      {
          System.out.println(e.getMessage());
      }

    }
}
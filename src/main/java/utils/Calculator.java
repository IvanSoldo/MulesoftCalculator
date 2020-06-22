package utils;
public class Calculator {

  public static long calculate(String operator, int numberOne, int numberTwo){
    if(operator.equals("+")){
      return numberOne + numberTwo;
    }else if(operator.equals("-")){
      return numberOne - numberTwo;
    }else if(operator.equals("*")){
      return numberOne * numberTwo;
    } else return numberOne / numberTwo;
  }

}
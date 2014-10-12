package com.soleil.kata.karate_chop;

public class KarateChop
{
  public static void main(String... args)
  {
    Input input = new Input();
    input.init();

    System.out.println("Input: " + input);

    Chop chop = new Chop();
    int index = chop.linearSearch(22, input);

    System.out.println("Index: " + index);
  }
}

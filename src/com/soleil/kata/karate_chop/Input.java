package com.soleil.kata.karate_chop;

import java.util.Arrays;
import java.util.Random;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class Input
{
  private final int BOUND = 100;
  private final int MAX_SIZE = 50;
  private int[] inputArray;
  
  public void init()
  {
    inputArray = new int[MAX_SIZE];
    
    Random random = new Random();
    
    for(int i = 0; i < MAX_SIZE; i++)
    {
      inputArray[i] = random.nextInt(BOUND);
    }
    
    Arrays.sort(inputArray);
  }

  public int[] getInputArray()
  {
    return inputArray;
  }
  
  @Override
  public String toString()
  {
    return ReflectionToStringBuilder.toString(inputArray);
  }
}

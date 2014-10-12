package com.soleil.kata.karate_chop;

public class Chop
{
  int linearSearch(int target, Input input)
  {
    int result = -1;
    int[] inputArray = input.getInputArray();
    
    if((inputArray != null) && (inputArray.length > 0))
    {
      for(int i = 0; i < inputArray.length; i++)
      {
        if(target == inputArray[i])
        {
          result = i;
          break;
        }
      }
    }
    
    return result;
  }
  
  int binarySearch(int target, Input input)
  {
    int result = -1;

    
    return result;
  }
}

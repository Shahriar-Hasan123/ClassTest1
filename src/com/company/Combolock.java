package com.company;

import java.util.ArrayList;

public class Combolock {
    int counter;
    ArrayList<Integer>cheacker =new ArrayList<Integer>();
    ArrayList<Integer>secret =new ArrayList<Integer>();
    public Combolock(int secret1,int secret2,int secret3)
    {
        secret.add(secret1);
        secret.add(secret2);
        secret.add(secret3);
    }
    public void reset()
    {
         counter=0;
    }
    public void turnLeft(int ticks)
    {
      counter=counter-ticks;
      if(counter<0)
      counter=39+counter;
      cheacker.add(counter);
    }
    public void turnRight(int ticks)
    {
        counter=counter+ticks;
        if(counter>39)counter=counter-39;
        cheacker.add(counter);
    }
    public boolean open()
    {
         return secret.equals(cheacker);
    }

}

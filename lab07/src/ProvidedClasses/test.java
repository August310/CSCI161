/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProvidedClasses;

import java.io.File;

/**
 *
 * @author araderma
 */
public class test {
    
    public static void main(String[] args) {
        
        for(int a = 4; a > 0; a--) {
  for(int b = 1; b <= a; b++) {
    System.out.print(b + " ");
  }
  System.out.print("\n");
}

        
    }
    
    public static void process(File f)
    {
        
        if(!f.isDirectory()){
            System.out.println(f.getPath());
        }
        else
        {
            for(File c : f.listFiles())
            {
                process(c);
            }
        }
    }
    
}

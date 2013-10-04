/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kata2;

import java.util.*;


public class Kata2 {
    
    ArrayList miArray;
    Map<Object,Integer> frec = new HashMap<Object,Integer>(); 
    
    public void Kata2 (){
        this.miArray = new ArrayList();
    }
    
    public Map Mayor (){      
        for (Object i : miArray){
            if (frec.containsKey(i)){
                frec.put(i, frec.get(i)+1);
            }
            frec.put(i, 1);
        }
        return frec;
    }
    
    
    public static void main(String[] args) {
        int [] lista = {1, 1, 2, 8, 6, 4, 5, 5, 1, 2, 1, 2, 3, 7, 6, 7, 0, 3, 1, 5};
        Kata2 prueba = new Kata2();
        for (int i :lista){
            prueba.miArray.add(i);
        }
        System.out.println(prueba.Mayor().keySet());
    }
}

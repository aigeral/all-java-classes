package Class28;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo1 {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("Cat");
        words.add("Java");
        words.add("Computer");
        words.add("Lava");
        //remove all the elements from this list which ends with a
        //Iterator<String> iterator=words.iterator();
        //while (iterator.hasNext()){
           // String s=iterator.next();
           // if(s.endsWith("a")){
              //  iterator.remove();
          //  }
       // }
       // System.out.println(words);
        words.removeIf(s->s.endsWith("a"));
        System.out.println(words);


    }
    }

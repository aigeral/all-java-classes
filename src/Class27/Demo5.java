package Class27;

import java.util.ArrayList;
import java.util.concurrent.Callable;

public class Demo5 {
    public static void main(String[] args) {
        ArrayList<Character>characters=new ArrayList<>();
        characters.add('A');
        characters.add('Z');
        for(Character c:characters){
            System.out.print(c+" =");
        }
    }
}

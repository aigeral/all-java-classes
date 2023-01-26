package Class13;

public class StringRecap {
    public static void main(String[] args) {
        // How can I print all the letters from this String one by one
        String str="Java is Great";
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i));
        }
        int count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='a'){
                count++;
            }
        }
        System.out.println("Letter a has appeared "+ count+ " Many times");









    }
}

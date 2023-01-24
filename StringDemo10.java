package Class12;

public class StringDemo10 {
    public static void main(String[] args) {

        String str="fvdflkv 6484649 ^%^*&)(";
        int counter=0;
        for (int i=0;i<str.length();i++){
            if(Character.isDigit(str.charAt(i))){
                counter++;
            }
        }
        System.out.println("Total isAlphabetic in str "+ counter);


    }
    }


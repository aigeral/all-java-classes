package Class6;

public class SwichCaseDemo {
    public static void main(String[] args) {
        String country="China";
        System.out.println(country.toLowerCase());
        switch (country.toLowerCase()){
            case "usa":
                System.out.println("Burgers");
                break;
            case "Italy":
                System.out.println("Pasta");
                break;
            case "afghanistan":
                System.out.println("Kebab");
                break;

        }

    }
}

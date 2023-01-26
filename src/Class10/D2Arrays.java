package Class10;

public class D2Arrays {
    public static void main(String[] args) {
        String [][] thomsonTrain=new String[3][3];
        String []cabin0={"Adam","Zafar","Sam"};
        String []cabin1={"Nabi","Saud","Anees"};
        String [] cabin2={"Safi","Abeera","Zahra"};

        thomsonTrain[0]=cabin0;
        thomsonTrain[1]=cabin0;
        thomsonTrain[2]=cabin0;
        System.out.println(thomsonTrain[1][2]);

    }
}

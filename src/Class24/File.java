package Class24;

public abstract class File {
    abstract void open();
     void edit(){
        System.out.println("editing the file");
    };
     void close(){
         System.out.println("Closing the file");
     }

}
abstract class JavaFile extends File{
    @Override
    void open() {
        System.out.println("Opening the file in Intelliji");
    }

    @Override
    void edit() {
        System.out.println("Editing the file in intelliji");
    }
}
class WordFile extends File{
    @Override
    void open() {
        System.out.println("Opening the file in Microsoft word");
    }
}
class PDFFile extends File{
    @Override
    void open() {
        System.out.println("Opening the acrobat");
    }
}

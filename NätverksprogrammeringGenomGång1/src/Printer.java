public class Printer {
    String name;
    String textToPrint;


    public Printer(){};

    public Printer(String name, String textToPrint){
        this.name = name;
        this.textToPrint = textToPrint;
    }

    public void Printer(){
        System.out.println(name+" says"+textToPrint);
    }

    public static void printer(String whatToPrint){
        System.out.println(whatToPrint);

    }



}

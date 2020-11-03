public class MenuImpDK {

    public static void printMainMenu(){
        System.out.println("1) Vis alle Pizza.");
        System.out.println("2) Bestil en Pizza.");
        System.out.println("3) Tilføj Ordre.");
        System.out.println("4) Skift Sprog");
        System.out.println("9) afslut");
    }
    @Override
    public String getLanguage() {
        return "ENG";
    }

}

public class MenuImpENG {

    public static void printMainMenu() {
        System.out.println("1) Show all Pizza.");
        System.out.println("2) Order Pizza.");
        System.out.println("3) Add order.");
        System.out.println("4) change language");
        System.out.println("9) exit");

    }

    @Override
    public String getLanguage() {
        return "DK";
    }
}
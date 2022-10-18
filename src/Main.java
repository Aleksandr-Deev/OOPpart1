public class Main {
    public static void main(String[] args) {
        Human maksim = new Human("Максим", "Минск", 1987, "бренд-менеджер");
        Human ania = new Human("Аня", "Москва", 1993, "методист образовательных программ");
        Human katya = new Human("Катя", "Калининград", 1994, "продакт-менеджер");
        Human artem = new Human("Артём", "Москва", 1995, "директор по развитию бизнеса");

        maksim.printingData();
        ania.printingData();
        katya.printingData();
        artem.printingData();
    }
}
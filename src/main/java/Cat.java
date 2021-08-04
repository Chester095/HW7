public class Cat {
    private String name; //кличка
    private int appetite; //сколько единиц еды он потребляет за приём пищи
    boolean full;
    //сделаем повеселее
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.full = false;
    }

    public void setFull() {
        this.full = true;
    }

    public void eat(Plate p) {
        if (p.decreaseFood(appetite)) {
            setFull();
        }
    }

    public void infoCat() { // задание 3 (задание 4 - это как я понял уточнение задания 3, что переменная boolean)
        if (full) System.out.println("У " + name + " аппетит " + appetite + " и он " + ANSI_GREEN + "сыт" + ANSI_RESET);
        else System.out.println("У " + name + " аппетит " + appetite + " и он " + ANSI_RED + "голоден" + ANSI_RESET);
    }
}

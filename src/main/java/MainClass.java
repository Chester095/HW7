public class MainClass {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Барсик", 5);
        Cat cat2 = new Cat("Василий", 100);
        Cat cat3 = new Cat("Васька", 15);
        Plate plate = new Plate(100);
        plate.infoPlate();
        cat1.eat(plate);
        plate.infoPlate();
        cat2.eat(plate);
        plate.infoPlate();
        cat1.infoCat();
        System.out.println();

        // проверка задания 3 (задание 4 - это как я понял уточнение задания 3, что переменная boolean)
        cat3.infoCat();
        cat3.eat(plate);
        cat3.infoCat();
        System.out.println();

        //задание 5
        Cat[] catMass = new Cat[6];
        catMass[0] = new Cat("Мурзик", 5);
        catMass[1] = new Cat("Барсик", 10);
        catMass[2] = new Cat("Буренка", 15);
        catMass[3] = new Cat("Капитан", 20);
        catMass[4] = new Cat("Обжора", 25);
        catMass[5] = new Cat("Плешивый", 30);
        Plate plateMass = new Plate(100);

        for (Cat mass : catMass) {
            mass.eat(plateMass);
        }

        // я бы стразу выводил информацию о котах, но в ТЗ написано ПОТОМ
        for (Cat mass : catMass) {
            mass.infoCat();
        }
        System.out.println();

        // проверка задание 6
        plateMass.addFoodInPlate(100);
        catMass[5].eat(plateMass);
        for (Cat mass : catMass) {
            mass.infoCat();
        }
    }
}

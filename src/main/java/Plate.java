public class Plate {
    private int food; //еда измеряется в целых числах и не важно, что это за единицы измерения

    public Plate(int food) {
        this.food = food;
    }

    public boolean decreaseFood(int n) { // уменьшает food на указанную величину n
        if (food >= n) {
            food -= n;
            return true;
        } // задание 2
        else {
            System.out.println("Маловато еды в тарелке. Уменьшите аппетит скотинке.");
            return false;
        }
    }

    //задание 6
    public void addFoodInPlate(int food){
        this.food += food;
    }


    public void infoPlate() {
        System.out.println("Тарелка: " + food);
    }
}
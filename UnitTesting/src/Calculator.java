public class Calculator {

    private int value;

    public Calculator(){
        value = 0;
    }
    public Calculator(int value) {
        this.value = value;
    }

    public void add(int number){
        value+=number;
    }

    public void subtract(int number){
        value -= number;
    }
    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

}

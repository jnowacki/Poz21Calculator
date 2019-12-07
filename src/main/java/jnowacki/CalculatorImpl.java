package jnowacki;

public class CalculatorImpl implements Calculator {

    private String disp = "";

    public void pressNumber(Object number) {
        StringBuilder builder = new StringBuilder(disp);
        disp = builder.append(number).toString();
    }

    public String display() {
        return disp;
    }

    public void add(int numberA, int numberB) {
        StringBuilder builder = new StringBuilder();
        disp = builder.append(numberA + numberB).toString();
    }

    public void sub(int numberA, int numberB) {
        StringBuilder builder = new StringBuilder();
        disp = builder.append(numberA - numberB).toString();
    }

    public void div(int numberA, int numberB) throws IllegalArgumentException {

    }

    public void clear() {
        disp = "";
    }

    public void multi(int numberA, int numberB) {

    }
}

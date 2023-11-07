package entity;

//Task4
public class Fraction {
    int numerator;
    int denominator;

    double result;

    Operation operation;

    public Fraction(int numerator, int denominator, Operation operation) {
        this.numerator = numerator;
        this.denominator = denominator;
        this.operation = operation;
        this.result = action(numerator, denominator, operation);
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }

    public Operation getOperation() {
        return operation;
    }

    public void setOperation(Operation operation) {
        this.operation = operation;
    }

    public double action(int numerator, int denominator, Operation operation) {
        switch (operation) {
            case add -> result = numerator + denominator;
            case subtract -> result = numerator - denominator;
            case multiply -> result = numerator * denominator;
            case division -> result = (double) numerator / denominator;

        }
        return result;
    }


    @Override
    public String toString() {
        return "numerator = " + numerator +
                ", denominator = " + denominator +
                ", operation = " + operation.name() +
                ", result = " + result;
    }
}


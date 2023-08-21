package examples;

public class calculator {
    public int multiply(int a, int b) {
        return a * b;
    }

    public int add(int a, int b) {
        return a + b;
    }

    public int sub(int a ,int b){
        return a-b;
    }

    public float div(int a , int b){
        return a/b;
    }

    public boolean isEvenNumber(int i) {
       if(i%2 ==0)
           return true;
       else
           return false;
    }
}

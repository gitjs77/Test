/**
 * @Author Jack <e.kobets>
 * 11/2/18
 */


interface LambdaFunction {
    void call();
}

public class TestLambdaFunction {
    public static void main(String[] args) {

        LambdaFunction lambdaFunction = () -> System.out.println("Call");
        lambdaFunction.call();
    }
}

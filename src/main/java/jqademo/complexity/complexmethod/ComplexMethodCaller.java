package jqademo.complexity.complexmethod;

public class ComplexMethodCaller {

    // injected somehow
    ComplexMethod complexMethodClass;

    public int callComplexMethod(String s) {
        return complexMethodClass.complexMethod(s);
    }

}

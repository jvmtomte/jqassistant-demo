package jqademo.dependinversion.inner;

import jqademo.dependinversion.DependInversionOuter;

public class DependInversionInner {

    public void callOuter() {
        new DependInversionOuter().outerMethod();
    }

}
package org.cafejojo.schaapi.test.user;

import org.cafejojo.schaapi.test.library.LibraryClass;

public class UserClass {
    public void usageOne() {
        String s = new LibraryClass().neverEmptyString();
        LibraryClass.checkStringNotEmpty(s);
    }
    public void usageTwo() {
        char c = new LibraryClass().alwaysBChar();
        LibraryClass.checkCharIsB(c);
    }
    public void usageThree() {
        int i = new LibraryClass().alwaysPositiveInt();
        LibraryClass.checkIntIsPositive(i);
    }
    public void usageFour() {
        double d = new LibraryClass().alwaysPositiveDouble();
        LibraryClass.checkDoubleIsPositive(d);
    }
    public void usageFive() {
        boolean b = new LibraryClass().alwaysTrueBoolean();
        LibraryClass.checkBooleanIsTrue(b);
    }
}

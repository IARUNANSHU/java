package exception;

import java.io.FileNotFoundException;
import java.io.IOException;


class SuperClass {
    void anyMethod() throws Exception {
        System.out.println("Super Class Method");
    }
}

class SubClass extends SuperClass {
    @Override
    void anyMethod() throws ClassNotFoundException {
        System.out.println("Sub Class Method");
    }
}

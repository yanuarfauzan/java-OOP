package app.application;

import app.data.HelloWorld;

public class HelloWorldApp {
    // Anonymouse class
    public static void main(String[] args) {
        HelloWorld english = new HelloWorld() {
            @Override
            public void sayHello()
            {
                System.out.println("Hello World");
            }

            @Override
            public void sayHello(String name)
            {
                System.out.println("Hello World " + name);
            }
        }; 

        english.sayHello("Yanuar");
        english.sayHello();
    }
}

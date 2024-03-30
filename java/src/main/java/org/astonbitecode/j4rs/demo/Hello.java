package org.astonbitecode.j4rs.demo;

public class Hello {

  public Hello() {
    super();

    System.out.println("Hello World in Java!!");
  }

  public String sayHello(String arg) {
    String javaWorld = "Hello, I am in Java world.";
    System.out.println("Java says: " + javaWorld);

    String ret = javaWorld + arg;
    System.out.println("Java says: " + ret);
    return javaWorld + arg;
  }

  public static String sayHelloStatic(String arg) {
    return "Hello, I am in Java world." + arg;
  }

}

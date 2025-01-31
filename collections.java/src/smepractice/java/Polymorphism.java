package smepractice.java;

//Base test class
 class BaseTest {
 public void setup() {
     System.out.println("Base setup");
     // Common setup code
 }
}

//Child test class
 class SpecialTest extends BaseTest {

 public void setup() {
     super.setup(); // Calls the base class setup method
     System.out.println("Special setup");
     // Additional special setup code
 }

 public void runTest() {
     setup(); // Calls the overridden setup method
     // Test code
 }
}

public class Polymorphism {
 public static void main(String[] args) {
     SpecialTest test = new SpecialTest();
     test.setup(); // This will call the overridden setup method in SpecialTest
 }
}

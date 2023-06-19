package example;

import org.junit.jupiter.api.*;

public class JunitExamples {

    @BeforeAll
    static void beforeAll(){
        System.out.println("Zero Test");
    }
    @BeforeEach
    void beforeEach(){
        System.out.println("Each Test");
    }


    @Test
    void firstTest() {
        System.out.println("    First Test");
    }

    @Test
    void secondTest() {
        System.out.println("     Second Test");
    }


    @AfterAll
    static void afterAll(){
        System.out.println("End Test");
    }
    @AfterEach
    void afterEach(){
        System.out.println("Eachend Test");
    }
}

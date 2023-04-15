package com.algaworks.junit;

import org.junit.*;

public class EntendendoJUnitTest {
    @BeforeClass
    public static void iniciarTestes(){
        System.out.println(">>> public static void iniciarTestes() <<<");
    }

    @AfterClass
    public static void encerrarTestes(){
        System.out.println(">>> public static void encerrarTestes() <<<");
    }

    @Before
    public void iniciarTeste(){
        System.out.println(">>> public void iniciarTeste() <<<");
    }

    @After
    public void encerrarTeste(){
        System.out.println(">>> public void encerrarTeste() <<<");
    }
    @Test
    public void testandoAlgo(){
        System.out.println(">>> public void testandoAlgo() <<<");
    }

    @Test
    public void testandoOutraCoisa(){
        System.out.println(">>> public void testandoOutraCoisa() <<<");
    }
}

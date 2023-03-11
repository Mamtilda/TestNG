package com.automationtest;

import org.testng.annotations.Test;
import java.net.*;
import static org.testng.Assert.assertEquals;

public class TestAutomation {

    //Using testNG
    @Test
    //Created a method that checks this is working

    public void Startup() {
        System.out.println("Hello, I am starting up...");

    }
    @Test
    //Method to check that this has finished loading
    public void Started() {

        System.out.println("Hello, I have finished loading!");
    }

    @Test
    //Method to check that this URL successfully loads. This is broken up into 3 categories: protocol, host & file
    //When executing assertEquals, this combines the 3 variables together into one URL.
    public void givenUrl_whenGetsDefaultPort_thenCorrect() throws MalformedURLException {
        String protocol = "https";
        String host = "amazon.co.uk";
        String file = "/gp/bestsellers/?ref_=nav_em_cs_bestsellers_0_1_1_2";

        //Creating a url object that takes the variables above as input
        URL url = new URL(protocol, host, file);
        assertEquals("https://amazon.co.uk/gp/bestsellers/?ref_=nav_em_cs_bestsellers_0_1_1_2", url.toString());
    }
    //The main method just calls out the methods created ensuring that they do indeed work
    public static void main(String[] args) throws MalformedURLException {

        System.out.println("Hello world!");
        TestAutomation test = new TestAutomation();
        test.Startup();
        test.Started();

        TestAutomation testPort = new TestAutomation();
        testPort.givenUrl_whenGetsDefaultPort_thenCorrect();


    }
}
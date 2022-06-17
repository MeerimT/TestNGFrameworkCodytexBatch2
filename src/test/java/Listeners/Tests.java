package Listeners;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Tests {


        @Test
        public void testToPass(){
            Assert.assertTrue(true);
        }

        @Test
        public void testToFail(){
            Assert.fail();
        }

        @Test(dependsOnMethods = "testToFail")
        public void testToSkip(){
            System.out.println("TEST WAS NOT SKIPPED");
        }
    }

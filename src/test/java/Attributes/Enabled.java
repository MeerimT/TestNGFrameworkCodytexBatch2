package Attributes;

import org.testng.annotations.Test;

public class Enabled {

    @Test
    public void cLanguage() {
        System.out.println("C Language");
    }

    @Test(enabled = false)
    public void jira() {
        System.out.println("Jira is project managing tool");
    }

    @Test
    public void java() {
        System.out.println("JAVA Language");
    }
}

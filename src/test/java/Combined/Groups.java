package Combined;

import org.testng.annotations.*;

public class Groups {

    @BeforeGroups("software company")
    public void beforeSoftwareCompany() {
        System.out.println("This runs Before \"software company\" Groups");
    }

    @AfterGroups("software company")
    public void afterSoftwareCompany() {
        System.out.println("This runs After \"software company\" Groups");
    }

    @Test(groups = {"software company"})
    public void apple() {
        System.out.println("Apple");
    }

    @Test(groups = {"car company"})
    public void tesla() {
        System.out.println("Tesla");
    }

    @Test(groups = {"software company"})
    public void google() {
        System.out.println("Google");
    }

    @Test(groups = {"car company"})
    public void toyota() {
        System.out.println("Toyota");
    }

    @Test
    public void walgreens() {
        System.out.println("Walgreens");
    }
}

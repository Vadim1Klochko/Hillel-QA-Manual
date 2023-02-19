import org.testng.annotations.Test;

public class MainPageTests extends BaseTest {
    MainPage MainPage = new MainPage();


    @Test
    public void checkLoginFormTitle() {
       new MainPage().open()
               .clickSignBtn()
               .checkLoginFormTitle("Log in");
    }
    @Test
    public void checkLogin() {
        new MainPage().open()
                .clickSignBtn()
                .checkLoginFormTitle("Log in")
                .setEmail("vadim1@gmail.com")
                .setPassword("V111111111v")
                .clickLoginBtn()
                .checkMyProfile("My profile");
    }
    @Test
    public void checkAddCar() {
        new MainPage().open()
                .clickSignBtn()
                .checkLoginFormTitle("Log in")
                .setEmail("vadim1@gmail.com")
                .setPassword("V111111111v")
                .clickLoginBtn()
                .checkAddCar("Add car");
    }
    @Test
    public void checkFuel() {
        new MainPage().open()
                .clickSignBtn()
                .checkLoginFormTitle("Log in")
                .setEmail("vadim1@gmail.com")
                .setPassword("V111111111v")
                .clickLoginBtn()
                .checkFuelexpenses("Fuel expenses");
    }
    @Test
    public void checkGarage() {
        new MainPage().open()
                .clickSignBtn()
                .checkLoginFormTitle("Log in")
                .setEmail("vadim1@gmail.com")
                .setPassword("V111111111v")
                .clickLoginBtn()
                .checkCarage("Garage");
    }








}

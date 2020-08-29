package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasicPage {

    public LoginPage(WebDriver navegador) {
        super(navegador);
    }

    public LoginFormPage clickSigIn(){
        navegador.findElement(By.linkText("Sign in")).click();
        return new LoginFormPage(navegador);
    }
}

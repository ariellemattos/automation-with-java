package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginFormPage extends BasicPage {

    public LoginFormPage(WebDriver navegador) {
        super(navegador);
    }

    public LoginFormPage digitarLogin(String usuario){
        navegador.findElement(By.id("signinbox")).findElement(By.name("login")).sendKeys(usuario);
        return this;
    }

    public LoginFormPage digitarSenha(String senha){
        navegador.findElement(By.id("signinbox")).findElement(By.name("password")).sendKeys(senha);
        return this;
    }

    public SecretaPage clicarSignIn(){
        navegador.findElement(By.linkText("SIGN IN")).click();
        return new SecretaPage(navegador);
    }

    public SecretaPage fazerLogin(String login, String senha){
       digitarLogin(login);
       digitarSenha(senha);
       clicarSignIn();

       return new SecretaPage(navegador);
    }
}

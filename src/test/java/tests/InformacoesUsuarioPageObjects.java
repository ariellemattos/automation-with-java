package tests;

import org.junit.jupiter.api.AfterEach;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import pages.LoginPage;
import suporte.Web;

public class InformacoesUsuarioPageObjects {
    private WebDriver navegador;

    @BeforeEach
    public void setUp(){
        navegador = Web.createChrome();
    }

    @Test
    public void testAdicionarInformacaoDoUsuario(){
        String textoToast = new LoginPage(navegador)
                .clickSigIn()
                .fazerLogin("julio0001", "123456")
                .clicarMe()
                .clicarAbaMoreDataAboutYou()
                .clicarBotaoAddMoreDataAboutYou()
                .adicionarContato("Phone", "+5511999999999")
                .capturarTextoToast();

        assertEquals("Your contact has been added!", textoToast);
    }

    @AfterEach
    public void tearDown(){
        //Fechar o navegador
        navegador.quit();
    }
}

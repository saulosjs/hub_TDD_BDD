package br.com.rsinet.hub_tdd.pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Objetos {

	@FindBy(how = How.ID, using = "menuUser")
	public WebElement clickLogin;

	@FindBy(how = How.NAME, using = "usernameRegisterPage")
	public WebElement usuario;

	@FindBy(how = How.NAME, using = "emailRegisterPage")
	public WebElement email;

	@FindBy(how = How.NAME, using = "passwordRegisterPage")
	public WebElement senha;

	@FindBy(how = How.NAME, using = "confirm_passwordRegisterPage")
	public WebElement confirmar;

	@FindBy(how = How.NAME, using = "first_nameRegisterPage")
	public WebElement nome;

	@FindBy(how = How.NAME, using = "last_nameRegisterPage")
	public WebElement sobreNome;

	@FindBy(how = How.NAME, using = "phone_numberRegisterPage")
	public WebElement telefone;

	@FindBy(how = How.CSS, using = ".sec-view div select")
	public WebElement pais;

	@FindBy(how = How.NAME, using = "cityRegisterPage")
	public WebElement cidade;

	@FindBy(how = How.NAME, using = "addressRegisterPage")
	public WebElement endereco;

	@FindBy(how = How.NAME, using = "state_/_province_/_regionRegisterPage")
	public WebElement estado;

	@FindBy(how = How.NAME, using = "postal_codeRegisterPage")
	public WebElement postal;

	@FindBy(how = How.CSS, using = ".sec-view div input[type=checkbox]")
	public WebElement aceita;

	@FindBy(how = How.ID, using = "register_btnundefined")
	public WebElement registrar;

}

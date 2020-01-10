package br.com.rsinet.hub_tdd.automacao;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.rsinet.hub_tdd.leituraExcel.Constant;
import br.com.rsinet.hub_tdd.leituraExcel.ExcelUtils;
import br.com.rsinet.hub_tdd.pageObject.Objetos;

public class Cadastro {
	static WebDriver driver = new ChromeDriver();
	// static WebDriver driver2 = new ChromeDriver();
	static Objetos page = PageFactory.initElements(driver, Objetos.class);
	static RobotPrint tela = new RobotPrint();

	public void preencher() throws Exception {
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.advantageonlineshopping.com/#/");
		page.clickLogin.click();

		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement elemento = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/login-modal/div/div/div[3]/a[2]")));
		elemento.click();

		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData, "Planilha1");
		page.usuario.sendKeys(ExcelUtils.getCellData(1, 0));
		page.email.sendKeys(ExcelUtils.getCellData(1, 1));
		page.senha.sendKeys(ExcelUtils.getCellData(1, 2));
		page.confirmar.sendKeys(ExcelUtils.getCellData(1, 3));
		page.nome.sendKeys(ExcelUtils.getCellData(1, 4));
		page.sobreNome.sendKeys(ExcelUtils.getCellData(1, 5));
		page.telefone.sendKeys(ExcelUtils.getCellData(1, 6));
		page.pais.sendKeys(ExcelUtils.getCellData(1, 7));
		page.cidade.sendKeys(ExcelUtils.getCellData(1, 8));
		page.endereco.sendKeys(ExcelUtils.getCellData(1, 9));
		page.estado.sendKeys(ExcelUtils.getCellData(1, 10));
		page.postal.sendKeys(ExcelUtils.getCellData(1, 11));
		page.aceita.click();
		page.registrar.click();

		RobotPrint.pegarTela();

	}

//	public void preencherFall() throws Exception {
//
//		driver2.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver2.get("http://www.advantageonlineshopping.com/#/");
//		page.clickLogin.click();
//
//		WebDriverWait wait = new WebDriverWait(driver2, 10);
//		WebElement elemento = wait
//				.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/login-modal/div/div/div[3]/a[2]")));
//		elemento.click();
//
//		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData, "Planilha1");
//		page.usuario.sendKeys(ExcelUtils.getCellData(2, 0));
//		page.email.sendKeys(ExcelUtils.getCellData(2, 1));
//		page.senha.sendKeys(ExcelUtils.getCellData(2, 2));
//		page.confirmar.sendKeys(ExcelUtils.getCellData(2, 3));
//		page.nome.sendKeys(ExcelUtils.getCellData(2, 4));
//		page.sobreNome.sendKeys(ExcelUtils.getCellData(2, 5));
//		page.telefone.sendKeys(ExcelUtils.getCellData(2, 6));
//		page.nascinalidade(driver2);
//
//		page.cidade.sendKeys(ExcelUtils.getCellData(2, 8));
//		page.endereco.sendKeys(ExcelUtils.getCellData(2, 9));
//		page.estado.sendKeys(ExcelUtils.getCellData(2, 10));
//		page.postal.sendKeys(ExcelUtils.getCellData(2, 11));
//		page.aceita.click();
//		page.registrar.click();
//
//		driver2.close();
//
//	}

}

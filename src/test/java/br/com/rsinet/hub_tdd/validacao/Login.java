package br.com.rsinet.hub_tdd.validacao;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import br.com.rsinet.hub_tdd.automacao.Cadastro;
import br.com.rsinet.hub_tdd.leituraExcel.ExcelUtils;

public class Login {

	static WebDriver driver = new ChromeDriver();

	@Test
	public void cadastroPass() throws Exception {
		Cadastro cadastro = new Cadastro();
		cadastro.preencher();
		ExcelUtils.setCellData("Pass", 1, 12);
		fim();

	}

	@Before
	public void fim() {
		driver.close();
	}

//	@Test
//	public void cadastroFall() throws Exception {
//		Cadastro cadastro = new Cadastro();
//		cadastro.preencherFall();
//		ExcelUtils.setCellData("Fall", 2, 12);
//
//	}

}

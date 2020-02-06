package br.com.rsinet.hub_TDD.Utilitys;

import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;

public class MassaDados {

	private AndroidDriver<WebElement> driver;

	public MassaDados(AndroidDriver<WebElement> driver) throws Exception {
		this.driver = driver;
		ExcelUtil.setExcelFile(Constante.Path_TestData + Constante.File_TestData, Constante.SheetName);

	}

	public String usuario() throws Exception {

		return ExcelUtil.getCellData(1, Constante.Col_UserName);
	}

	public String email() throws Exception {
		return ExcelUtil.getCellData(1, Constante.Col_email);
	}

	public String senha() throws Exception {
		return ExcelUtil.getCellData(1, Constante.Col_senha);
	}

	public String ConfirmaSenha() throws Exception {
		return ExcelUtil.getCellData(1, Constante.Col_confSenha);

	}

	public String PrimeiroNome() throws Exception {
		return ExcelUtil.getCellData(1, Constante.Col_Nome);

	}

	public String UltimoNome() throws Exception {
		return ExcelUtil.getCellData(1, Constante.Col_endName);
	}

	public String Telefone() throws Exception {
		return ExcelUtil.getCellData(1, Constante.Col_Tel);
	}

	public String Estado() throws Exception {
		return ExcelUtil.getCellData(1, Constante.Col_estado);
	}

	public String Endereco() throws Exception {
		return ExcelUtil.getCellData(1, Constante.Col_endereco);
	}

	public String Cidade() throws Exception {
		return ExcelUtil.getCellData(1, Constante.Col_cidade);
	}

	public String CEP() throws Exception {
		return ExcelUtil.getCellData(1, Constante.COl_cep);
	}

	public String falhaBuscaHome() throws Exception {
		return ExcelUtil.getCellData(3, Constante.col_buscafalha);
	}

}

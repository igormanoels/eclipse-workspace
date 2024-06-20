package view;

import java.util.Scanner;

import controller.Leitura;
/*
 * 1110482312054 - IGOR MANOEL DE SANTANA 
 * Pre P3 - Pegar o conteudo do site: https://date.nager.at/api/v2/publicholidays/2020/US 
 * (Usar modo RAW ou Dados Brutos), esse site traz um arquivo com diferentes feriados americanos. 
 * Gravar em um arquivo chamado hol.json na pasta C:\TEMP (\tmp se for Linux) e fazer uma aplicacao java que, 
 * na classe principal, no metodo Main peca ao usuario um name, chame uma classe de controle que leia o arquivo, e, 
 * apresente a data do feriado. (Caso nao exista, lancar uma excecao)
 * 
 */
public class Principal 
{
	public static void main(String[] args) 
	{
		System.out.println("Seja bem vindo a minha aplica��o para avalia��o da Pr�-P3\n");
		Scanner ler = new Scanner(System.in);
		
		String caminho = VerificaSO();
		System.out.println(caminho);
		
		System.out.println("Informe o feriado que voc� deseja conhecer a data: ");
		String data = ler.nextLine();
		
		Leitura leitura = new Leitura();
		leitura.VerificarData(caminho, data);
		
		
		ler.close();
	}

	public static String VerificaSO() 
	{
		String caminho = "";
		String nomeSO = System.getProperty("os.name").toLowerCase();
		if (nomeSO.contains("windows")) 
		{
			caminho = "C:\\TEMP";
		} 
		else if (nomeSO.contains("linux"))
		{
			caminho = "\\tmp";
		}
		return caminho;
		
	}
}

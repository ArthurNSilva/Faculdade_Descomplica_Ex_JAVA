//salvar como PrimeiroProgramaJava.java

//nome da classe
class PrimeiroProgramaJava
{
  //módulo principal com a entrada pela linha de comando
  public static void main (String entrada[])
  {
    //declaração de variáveis
	int inteiro = 28;
	char caracter = 'M';
	double real = 1.78;
	String frase = "Arthur Silva ";
	boolean VF=true;

	if (VF==true)
	{
	   System.out.println("Eu sou o " + frase + "tenho " + inteiro + "anos e tenho " + real + "m de altura");
	}

	System.exit(0);
 }
}
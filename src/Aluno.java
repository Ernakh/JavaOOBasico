
public class Aluno extends Pessoa
{
	public Integer matricula;
	
	public String estudar()
	{
		return "Estudando...";
	}
	
	//override n�o � obrigat�rio, mas evita grandes problemas
	@Override
	public String comer()
	{
		return "Estudando...";
	}
}


public class Pessoa 
{
	private String nome;
	private Integer idade;
	
	public Pessoa()
	{
		
	}
	
	public Pessoa(String nome)
	{
		this.nome = nome;
	}
	
	public Pessoa(String nome, Integer idade)
	{
		this.nome = nome;
		this.idade = idade;
	}
	
	public String getNome()
	{
		return nome;
	}
	
	public void setNome(String nome)
	{
		this.nome = nome;
	}
	
	public Integer getIdade() 
	{
		return idade;
	}
	
	public void setIdade(Integer idade) 
	{
		this.idade = idade;
	}
	
	public String trabalhar()
	{
		return "Trabalhando...";
	}
	
	private String viver()
	{
		return "Vivendo...";
	}
	
	public String comer()
	{
		return "Preparar comida e comer.";
	}
}

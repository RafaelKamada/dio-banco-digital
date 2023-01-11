package desafioi_dio_banco;

public class Cliente {

	private String nome;
	private int idade;
	private int telefone;
	private String endereco;

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) throws Exception {
		if (idade < 18) {
			throw new Exception("Não é permitido cadastrar um cliente com menos de 18 anos!");
		}
		
		this.idade = idade;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}

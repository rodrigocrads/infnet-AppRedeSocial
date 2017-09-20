package negocio;

public class Usuario {

	private String login;
	private String senha;
	private String tipoCurso;
	private String nome;
	private int anoNascimento;
	private double salario;
	private int mesesTrabalhados;

	public Usuario(String login, String senha) {
		this.setLogin(login);
		this.setSenha(senha);
	}

	public Usuario() {
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getAnoNascimento() {
		return anoNascimento;
	}

	public void setAnoNascimento(int anoNascimento) {
		this.anoNascimento = anoNascimento;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public int getMesesTrabalhados() {
		return mesesTrabalhados;
	}

	public void setMesesTrabalhados(int mesesTrabalhados) {
		this.mesesTrabalhados = mesesTrabalhados;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getTipoCurso() {
		return tipoCurso;
	}

	public void setTipoCurso(String tipoCurso) {
		this.tipoCurso = tipoCurso;
	}

	public String obterMensagem() {
		return String.format("O usuário %s tem %d Anos e ganhou R$%.2f em 2017.", 
				this.getNome(), 
				this.getObterIdade(),
				this.getCalcularSalario());
	}

	private float getCalcularSalario() {
		return (float) getSalario() * getMesesTrabalhados();
	}

	private int getObterIdade() {
		return (int) 2017 - getAnoNascimento();
	}

}

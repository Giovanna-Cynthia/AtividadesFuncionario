          package Estrutura;

public class Pessoa {
	
	private String nome;
	private double salarioBruto;
	private String planoDeSaude;
	private int numeroDependentes;
	private boolean vr;
	private boolean va;
	private boolean vt;
	
	
	 public Pessoa(String nome, double salarioBruto, int numeroDependentes, boolean vr, boolean va, boolean vt, String planoDeSaude) {
	        this.nome = nome;
	        this.salarioBruto = salarioBruto;
	        this.numeroDependentes = numeroDependentes;
	        this.vr = vr;
	        this.va = va;
	        this.vt = vt;
	        this.planoDeSaude = planoDeSaude;
	    }
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSalarioBruto() {
		return salarioBruto;
	}
	public void setSalarioBruto(double salarioBruto) {
		this.salarioBruto = salarioBruto;
	}
	public int getNumeroDependentes() {
		return numeroDependentes;
	}
	public void setNumeroDependentes(int numeroDependentes) {
		this.numeroDependentes = numeroDependentes;
	}
	public boolean getVt() {
		return vt;
	}
	public void setVt(boolean vt) {
		this.vt = vt;
	}
	public boolean getVr() {
		return vr;
	}
	public void setVr(boolean vr) {
		this.vr = vr;
	}
	public boolean getVa() {
		return va;
	}
	public void setVa(boolean va) {
		this.va = va;
	}
	public String getPlanoDeSaude() {
		return planoDeSaude;
	}
	public void setPlanoDeSaude(String planoDeSaude) {
		this.planoDeSaude = planoDeSaude;
	}
	
	public void calculoSalarioLiquido (double salarioBruto, int numeroDependentes, boolean va, boolean vt, boolean vr, String planoDeSaude) {
		double salarioLiquido = 0;
		double taxaVa = 0;
		double taxaVt = 0;
		double taxaVr = 0;
		if (va = true) {
			taxaVa = salarioBruto * 0.05;
		}else {
			taxaVa = 0;
		}
		if (vt = true) {
			taxaVt = salarioBruto * 0.06;
		}else {
			taxaVt = 0;
		}
		if (vr = true) {
			taxaVr = salarioBruto * 0.03;
		}else {
			taxaVr = 0;
		}
		double taxaINSS = salarioBruto * 0.11;
		double taxaIRRFSD = salarioBruto * 0.15;
		int valorDependentes = numeroDependentes * 50;
		double taxaIRRF = taxaIRRFSD - valorDependentes;
		double salarioSemPlano = salarioBruto - taxaVa - taxaVt - taxaVr - taxaINSS - taxaIRRF;
		
		if (planoDeSaude.equals("Platinium Premium Plus")) {
			salarioLiquido = salarioSemPlano - 500;
		}else if (planoDeSaude.equals("Premium")) {
			salarioLiquido = salarioSemPlano - 250;
		}else if (planoDeSaude.equals("Basico")) {
			salarioLiquido = salarioSemPlano - 100;
		}else {
			System.out.println("Sem Plano de saude");
		}
		System.out.println("O salario liquido do funcionario é: " + salarioLiquido);
		
	}


}

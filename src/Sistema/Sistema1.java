package Sistema;

import java.util.ArrayList;

import java.util.Scanner;

import Estrutura.Pessoa;

public class Sistema1 {

	public static void main(String[] args) {
		
		//Case é usado para dar mais de uma escolha para o usuario
		//System.out.println é usado para aparecer uma mensagem para o usuario
		//Scanner da a possibilidade do usuario digitar 
		Scanner sc = new Scanner(System.in);
		
		//Cria uma lista vazia para receber informações
		ArrayList<Pessoa> funcionarios = new ArrayList<Pessoa>();
		
		boolean i = true;
		
	do {
		try{
			// Exibe o menu de opções para o usuário
			System.out.println("###############");
			System.out.println("1 - Cadastrar Funcionário");
			System.out.println("2 - Visualizar Lista de Funcionários");
			System.out.println("3 - Editar Dados do Funcionário");
			System.out.println("4 - Deletar Funcionário");
			System.out.println("5 - Visualizar Dados Especificos de um Funcionário"); 
			System.out.println("6 - Calcular Salário Liquído do Funcionário");
			System.out.println("9 - Sair do Sistema");
			System.out.println("###############");
			
			// Lê a opção escolhida pelo usuário
			int opcao = sc.nextInt();
			
			// Realiza a ação de acordo com a opção escolhida pelo usuário
			switch (opcao) {
			case 1: {
				// Cria um novo objeto Pessoa (funcionário) com base nas informações dadas
				// Adiciona um funcionário à lista de funcionários
				Pessoa funcionario = new Pessoa(null, opcao, opcao, i, i, i, null);
				System.out.println("###############");
				System.out.println("Nome do Funcionário:");
				funcionario.setNome(sc.next());
				System.out.println("Salário Bruto do Funcionário:");
				funcionario.setSalarioBruto(sc.nextDouble());
				System.out.println("Digite qual é o seu Plano de Saúde (Básico, Plenium, Platinium):");
				funcionario.setPlanoDeSaude(sc.next());
				System.out.println("Quantos dependentes?");
				funcionario.setNumeroDependentes(sc.nextInt());
				System.out.println("Tem direito a VA? (Digite TRUE para SIM ou FALSE para NÃO):");
				funcionario.setVa(sc.nextBoolean());
				System.out.println("Tem direito a VT? (Digite TRUE para SIM ou FALSE para NÃO):");
				funcionario.setVt(sc.nextBoolean());
				System.out.println("Tem direito a VR? (Digite TRUE para SIM ou FALSE para NÃO):");
				funcionario.setVr(sc.nextBoolean());
				funcionarios.add(funcionario);
				System.out.println("Funcionairo cadastrado com sucesso!");
				
				// Continua o loop do menu
				continue;
			}
			case 2: {
				// Caso o usuário escolha visualizar a lista de funcionários
				System.out.println("###############");
				System.out.println("Listando Funcionarios:");
				funcionarios.forEach(funcionario -> {
					System.out.println("Funcionario: " + funcionario.getNome());
					});
				continue;
			}
			case 3: {
				// Caso o usuário escolha editar os dados de um funcionário
                System.out.println("Okay, qual o nome do funcionario que você deseja editar?");
                String nomeFuncionario = sc.next();
                boolean update = false;
                for (Pessoa funcionario : funcionarios) {
                    if (funcionario.getNome().equals(nomeFuncionario)) {
                        System.out.println("Nome: ");
                        funcionario.setNome(sc.next());

                        System.out.println("Salario Bruto: ");
                        funcionario.setSalarioBruto(sc.nextDouble());

                        System.out.println("Numero de Dependentes: ");
                        funcionario.setNumeroDependentes(sc.nextInt());

                        System.out.print("Vale Refeição? (S)sim ou (N)não: ");
                        funcionario.setVr(sc.nextBoolean());

                        System.out.print("Vale Alimentação? (S)sim ou (N)não: ");
                        funcionario.setVa(sc.nextBoolean());

                        System.out.print("Vale Transporte? (S)sim ou (N)não: ");
                        funcionario.setVt((sc.nextBoolean()));

                        System.out.println("");
                        System.out.println("Qual tipo de plano de Saúde?");
                        System.out.println("Por favor, coloque o valor do pacote:");
                        System.out.println("");
                        System.out.println("Básico, Premium, Platinium");
                        System.out.println("Nenhum. - 0");
                        System.out.print("Digite o pacote desejado: ");
                        funcionario.setPlanoDeSaude(sc.next());
                        System.out.println("");
                        System.out.println("Funcionario Atualizado com Sucesso.");
                        System.out.println("");
                        update = true;
                        break;
                    }
                    if(!update) {
                    	System.out.println("Funcionário não encontrado!");
                    }
                }
				
			}
			case 4: {
				// Caso o usuário escolha deletar um funcionário
				System.out.println("###############");
				System.out.println("Digite o Numero do Funcionario que Deseja Deletar: ");
				int escolhaArray = sc.nextInt();					
				Pessoa funcionario = funcionarios.get(escolhaArray);	
				
				System.out.println("Nome: " + funcionario.getNome());
				System.out.println("Salario Bruto: " + funcionario.getSalarioBruto());
				System.out.println("Plano de Saúde: " + funcionario.getPlanoDeSaude());
				System.out.println("Número de Dependentes: " + funcionario.getNumeroDependentes());
				System.out.println("VA: " + funcionario.getVa());
				System.out.println("VT: " + funcionario.getVt());
				System.out.println("VR: " + funcionario.getVr());
				
				System.out.println("Deseja continuar? 'S' para SIM e 'N' para NÃO");
				String escolhaDelet = sc.next();
				if (escolhaDelet.equals("S") || escolhaDelet.equals("s")) {
					System.out.println("Usuario Excluido com Sucesso");
					funcionarios.remove(escolhaArray);
				} else {
					System.out.println("Funcionario Não Sera Excluido");
				}
				
				// Continua o loop do menu
				continue;

			}
			case 5: {
				// Caso o usuário escolha visualizar os dados específicos de um funcionário
				System.out.println("Lista de Funcionários:");
                for (int index = 0; index < funcionarios.size(); index++) {
                	Pessoa funcionario = funcionarios.get(index);
                    System.out.println(i + " - " + funcionario.getNome());
               
                 opcao = sc.nextInt();
              
             	System.out.println("Nome: " + funcionario.getNome());
				System.out.println("Salario Bruto: " + funcionario.getSalarioBruto());
				System.out.println("Plano de Saúde: " + funcionario.getPlanoDeSaude());
				System.out.println("Número de Dependentes: " + funcionario.getNumeroDependentes());
				System.out.println("VA: " + funcionario.getVa());
				System.out.println("VT: " + funcionario.getVt());
				System.out.println("VR: " + funcionario.getVr());
				
                }
                
             // Continua o loop do menu
				continue;
			}
			case 6: {
				// Caso o usuário escolha calcular o salário líquido de um funcionário
				System.out.println("###############");
				System.out.println("Selecione o Numero do Funcionário que Deseja Calcular o Salário Líquido:");
				int escolhaSalario = sc.nextInt();
				
				Pessoa funcionario = funcionarios.get(escolhaSalario);
				
				funcionario.calculoSalarioLiquido(funcionario.getSalarioBruto(), funcionario.getNumeroDependentes(), funcionario.getVa(), funcionario.getVt(), funcionario.getVr(), funcionario.getPlanoDeSaude());
				continue;
			}
			case 9: {
				// Caso o usuário escolha sair do sistema
				// Exibe uma mensagem de desligamento e encerra o programa
				System.out.println("Desligando sistema!");
				System.exit(0);
			}
			
			}
		}catch (ArithmeticException e){
			// Exibe uma mensagem de erro caso digite uma opção inválida 
			System.out.println("Digite uma Opção Valida;");
		}
	}while (true);
	
}
		
		
	}

	



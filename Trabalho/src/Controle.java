import java.util.ArrayList;
import java.util.List;
	
	public class Controle 
	{
	
		private ViewCadastro viewCadastro;
		private List<Motos> listaMotos = new ArrayList<>();
		private List<Funcionarios> listaFuncionarios = new ArrayList<>();
		
		public Controle() {
			viewCadastro = new ViewCadastro();
			trataMenu();
		}
		
		private void trataMenu() 
		{
			boolean continuar = true;
			do {
				String opc = viewCadastro.mostraMenu();
	
				switch (opc) {
				case "1":
					viewCadastro.inserir(listaMotos, listaFuncionarios);
					break;
				case "2":
					viewCadastro.listar(listaMotos, listaFuncionarios);
					break;
				case "3":
					viewCadastro.alterar(listaMotos, listaFuncionarios);
					break;
				case "4":
					viewCadastro.excluir(listaMotos, listaFuncionarios);
					break;
				case "5":
					viewCadastro.pesquisar(listaMotos, listaFuncionarios);
					break;				
				case "6":
					System.out.println("Aplicação Encerrada");
					continuar = false;
					System.exit(0);
					break;
				default:
					System.out.println("Opção inválida");					
					break;
				}
			} while (continuar);
		}
	}

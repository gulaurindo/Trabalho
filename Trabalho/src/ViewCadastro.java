import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
	
		public class ViewCadastro 
		{
			private Scanner input;
			private Scanner lerfunc;
			public ViewCadastro() 
			{
				input = new Scanner(System.in);				
				lerfunc = new Scanner(System.in);
			}
		
			public String mostraMenu() {
				System.out.println("Loja de Motos");
				System.out.println("1 - Inserir");
				System.out.println("2 - Listar");
				System.out.println("3 - Alterar");
				System.out.println("4 - Excluir");
				System.out.println("5 - Pesquisar");
				System.out.println("6 - Sair");
				System.out.println("Opção: ");
				return input.nextLine();
			}
			
			public Motos inserir(List<Motos>listaMotos, List<Funcionarios>listaFuncionarios)
			{
		    
		        Motos motos = new Motos();	
		        Funcionarios funcionarios = new Funcionarios();
		        int x = 0;
		        double y = 0;
		        
		        System.out.println("Digite 1 para adicionar registro de motos e 2 para adicionar registro de funcionários: ");
				x = Integer.parseInt(lerfunc.nextLine());
				if (x == 1) {
		        System.out.println("Nome: ");
		        motos.setNome(input.nextLine());
	
		        System.out.println("Placa: ");
		        motos.setPlaca(input.nextLine());
	
		        System.out.println("Modelo: ");
		        motos.setModelo(input.nextLine());
	
		        listaMotos.add(motos);
						        
				}
				if (x == 2) {
				System.out.println("Nome: ");
		        funcionarios.setNomefunc(input.nextLine());
	
		        System.out.println("Cargo: ");
		        funcionarios.setCargo(input.nextLine());
	
		        System.out.println("Salário: ");
		        y = Integer.parseInt(input.nextLine());
		        funcionarios.setSalario(y);
	
		        listaFuncionarios.add(funcionarios);
						        
				}
				return motos;
			}
		
			public void listar(List<Motos>listaMotos, List<Funcionarios>listaFuncionarios) 
			{
				int x = 0;
				
				System.out.println("Digite 1 para registro de motos e 2 para registro de funcionários: ");
				x = Integer.parseInt(lerfunc.nextLine());
				
				if(x == 1) {	
					
				for(int i=0; i<listaMotos.size();i++) {					
					ordenaPorNome(listaMotos);
					System.out.println(listaMotos.get(i).toString() + " Posição: " + i);
					System.out.println("\n");
				}				
				}
				
				if (x == 2) {
				for(int i=0; i<listaFuncionarios.size();i++) {					
					ordenaFunc(listaFuncionarios);
					System.out.println(listaFuncionarios.get(i).toString() + " Posição: " + i);
					System.out.println("\n");
				}
				}
			}
			
			public void alterar(List<Motos>listaMotos, List<Funcionarios>listaFuncionarios)
			{
			
				boolean continuar = true;
				int i = 0;
				int x = 0;
				double y = 0;
				System.out.println("Digite 1 para alterar o registro de motos e 2 para alterar o registro de funcionários: ");
				x = Integer.parseInt(lerfunc.nextLine());
				if(x==1) 
				{
					for(int z=0; z<listaMotos.size();z++) 
					{
						System.out.println(listaMotos.get(z).toString() + " Posição: " + z);
					}
					do {
						System.out.println("Digite a posição do registro para alterar: ");
						try {
							i = Integer.parseInt(input.nextLine());
							if (i >= 0 & i < listaMotos.size())  {
								continuar = false;
							}else {
								System.out.println("Digite um valor válido!");
							}
						} catch (Exception e) {
							System.out.println("Valor digitado inválido!!!");
						}
					} while (continuar);
				}	
				if(x==2) 
				{
					for(int z=0; z<listaFuncionarios.size();z++) 
					{
						System.out.println(listaFuncionarios.get(z).toString() + " Posição: " + z);
					}
					do {
						System.out.println("Digite a posição do registro para alterar: ");
						try {
							i = Integer.parseInt(input.nextLine());
							if (i >= 0 & i < listaFuncionarios.size())  {
								continuar = false;
							}else {
								System.out.println("Digite um valor válido!");
							}
						} catch (Exception e) {
							System.out.println("Valor digitado inválido!!!");
						}
					} while (continuar);
				}
				if(x == 1) {	
				
				System.out.println("Nome ("+ listaMotos.get(i).getNome() +"): ");
				listaMotos.get(i).setNome(input.nextLine());
				
				System.out.println("Placa("+ listaMotos.get(i).getPlaca() +"): ");
				listaMotos.get(i).setPlaca(input.nextLine());
				
				System.out.println("Modelo ("+ listaMotos.get(i).getModelo() +"): ");
				listaMotos.get(i).setModelo(input.nextLine());					
				}
				
				if (x == 2) {				
				System.out.println("Nome ("+ listaFuncionarios.get(i).getNomefunc() +"): ");
				listaFuncionarios.get(i).setNomefunc(input.nextLine());
				
				System.out.println("Cargo("+ listaFuncionarios.get(i).getCargo() +"): ");
				listaFuncionarios.get(i).setCargo(input.nextLine());
				
				System.out.println("Salário ("+ listaFuncionarios.get(i).getSalario() +"): ");
				y = Integer.parseInt(input.nextLine());			        
				listaFuncionarios.get(i).setSalario(y);	
				}
			}
			
			public void excluir(List<Motos>listaMotos, List<Funcionarios>listaFuncionarios) {
				listar(listaMotos, listaFuncionarios);
				int x = 0, i = 0;
				System.out.println("Digite 1 para registro de motos e 2 para registro de funcionários: ");
				x = Integer.parseInt(lerfunc.nextLine());
				if(x == 1) {
				System.out.println("Digite a posição do registro para deletar");
				i = Integer.parseInt(input.nextLine());
				listaMotos.remove(i);
				}
				if(x == 2){
				System.out.println("Digite a posição do registro para deletar");
				i = Integer.parseInt(input.nextLine());
				listaFuncionarios.remove(i);
				}
			}
			
			public void pesquisar(List<Motos>listaMotos, List<Funcionarios>listaFuncionarios) 
			{
				boolean flag = true;
				Motos motos = new Motos();
				Funcionarios funcionarios = new Funcionarios();
				
				int x = 0;
				
				System.out.println("Digite 1 para registro de motos e 2 para registro de funcionários: ");
				x = Integer.parseInt(lerfunc.nextLine());
				
				if(x==1) {
				System.out.println("Digite o nome que deseja pesquisar: ");
				motos.setNome(input.nextLine());				
				for(int i=0; i<listaMotos.size();i++) 
				{
					if(listaMotos.get(i).getNome().equals(motos.getNome()) == true)
					{
						System.out.println("Nome: " + listaMotos.get(i).getNome());
						System.out.println("Placa: " + listaMotos.get(i).getPlaca());
						System.out.println("Modelo: " + listaMotos.get(i).getModelo());
						flag = false;
					}
				}
				
				if (flag == true)
				{
					System.out.println("Não encontrado.");
				}
				}
				
				if(x==2) {
					System.out.println("Digite o nome que deseja pesquisar: ");
					funcionarios.setNomefunc(input.nextLine());				
					for(int i=0; i<listaFuncionarios.size();i++) 
					{
						if(listaFuncionarios.get(i).getNomefunc().equals(funcionarios.getNomefunc()) == true)
						{
							System.out.println("Nome: " + listaFuncionarios.get(i).getNomefunc());
							System.out.println("Cargo: " + listaFuncionarios.get(i).getCargo());
							System.out.println("Salario: " + listaFuncionarios.get(i).getSalario());
							flag = false;
						}
					}
					
					if (flag == true)
					{
						System.out.println("Não encontrado.");
					}
				}
				}
						
			private static void ordenaPorNome(List<Motos> listaMotos) {
			    Collections.sort(listaMotos, new Comparator<Motos>() {
			        @Override
			        public int compare(Motos o1, Motos o2) {
			            return o1.getNome().compareTo(o2.getNome());
			        }
			    });			    			    
			}
			private static void ordenaFunc(List<Funcionarios> listaFuncionarios) {
			    Collections.sort(listaFuncionarios, new Comparator<Funcionarios>() {
			        @Override
			        public int compare(Funcionarios o1, Funcionarios o2) {
			            return o1.getNomefunc().compareTo(o2.getNomefunc());
			        }
			    });
			}			
		}
		
		

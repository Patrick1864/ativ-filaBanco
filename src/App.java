
public class App {
	public static ManageAttendance manage = new ManageAttendance(10);
	public static Scanner scanner = new Scanner(System.in); 

	public static void main(String[] args) {
		
		/*
		Testes

		Client c1 = new Client("daniel", 30);
		Client c2 = new Client("Roberto", 20);
		Client c3 = new Client("pedro", 80);
		
		this.manage.addClient(c1);
		manage.addClient(c2);
		manage.addClient(c3);

		System.out.println(manage.isEmpty());
		System.out.println(manage.showQueues()); */

		int op = 0;
		do {
				System.out.println("******************Bem-vindo*****************");
				System.out.println("Opções:");
				System.out.println("1- Chegada do cliente na agência");
				System.out.println("2- Verificar quem é o próximo a ser atendido");
				System.out.println("3- Atender um cliente");
				System.out.println("4- Exibir as filas");
				System.out.println("5- Finalizar o programa\n");
				try{
						op = scanner.nextInt();
				}catch(Exception e){
						System.out.println("Apenas números por favor.");
				}
				scanner.nextLine();
						switch (op) {
								case 1:
										System.out.println("Chegou um cliente!!");
										newClient();
										break;
								case 2:
												System.out.println("Proximo cliente:\n");
												if(manage.showNext() != null){
														System.out.println(manage.showNext());
												}else{
														System.out.println("Não há clientes.");
												}
										break;
								case 3:
												if(!manage.isEmpty()){
														if(manage.showNext() != null){
																System.out.println("O próximo cliente está indo até você");
																System.out.println(manage.getNext());
																System.out.println("Cliente atendido. PRÓXIMO!");
														}else{
																System.out.println("Não há ninguém na fila.");
														}
												}else {
														System.out.println("Não há ninguém na fila.");
												}
										break;
								case 4:
									 if(manage.showQueues() != null){
											System.out.println(manage.showQueues());
										}else{
												System.out.println("Não há ninguém no momento");
										}
										break;
								case 5:
										if (!manage.isEmpty()) {
												System.out.println("Encerramento bloqueado, tem cliente na fila!");
										} else {
											System.out.println("Sistema encerrado");
												op = 6;
										}
										break;
								default:
										System.out.println("Opção inválida. Selecione outra opção.");
										break;
						}
		} while (op != 6);	

	}

	public static void newClient() throws Exception {
		String name = "";
		int age = 0;
		 try{
				 System.out.println("Nome do cliente?\n");
				 name = scanner.next();
				 scanner.nextLine();
				 System.out.println("Idade do cliente?\n");
				 age = scanner.nextInt();
		 }catch(java.util.InputMismatchException e){
				 System.out.println("Por favor, verifique suas entradas. Atente-se a idade ser apenas em números e nome apenas em letras.");
		 }
			Client client = new Client(name, age);
			manage.addClient(client);
 }

}

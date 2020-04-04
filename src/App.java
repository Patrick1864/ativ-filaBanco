
public class App {

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

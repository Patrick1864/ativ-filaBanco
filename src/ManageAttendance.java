import java.util.ArrayList;

public class ManageAttendance {
	
	private ArrayList<Client> queue = new ArrayList<Client>();
	
	

	public ManageAttendance(int size) {
		super();	
	}
	
	public boolean isEmpty() {
		return true;
	}
	
	public int numClients() {
		return 0;
	}
	
	public int numElderlyClients() {
		return 0;
	}
	
	public void addClient(Client client) {
		
	}
	
	public Client showNext() {
		return null;
	}
	
	public Client getNext() {
		return null;
	}
	
	public String showQueues() {
		return "";
	}

	public ArrayList<Client> getQueue() {
		return queue;
	}

	public void setQueue(ArrayList<Client> queue) {
		this.queue = queue;
	}

	
	
}

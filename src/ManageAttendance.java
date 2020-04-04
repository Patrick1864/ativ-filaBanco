import java.util.ArrayList;

public class ManageAttendance {
	
	private ArrayList<Client> communQueue = new ArrayList<Client>();
	private ArrayList<Client> priorityQueue = new ArrayList<Client>();
	private int ordenador = 0;
	
	public ManageAttendance(int size) {
		super();	
	}
	
	public boolean isEmpty() {
		return (this.communQueue.isEmpty() && this.priorityQueue.isEmpty() );
	}
	
	public int numClients() {
		return this.communQueue.size() + this.priorityQueue.size();
	}
	
	public int numElderlyClients() {
		return this.priorityQueue.size();
	}
	
	
	public void addClient(Client client) {
		if(client.getAge() >= 60) {
			this.priorityQueue.add(client);
		}else {
			this.communQueue.add(client);
		}
	}
	
	public Client showNext() {
		Client temp;
		if(!this.communQueue.isEmpty() && !this.priorityQueue.isEmpty()) {
			if(this.ordenador <= 2) {
				temp = this.priorityQueue.get(0);
			}else {
				temp = this.communQueue.get(0);
			}
		} else if(!this.communQueue.isEmpty() && this.priorityQueue.isEmpty()) {
			temp = this.communQueue.get(0);
		} else {
			temp = this.priorityQueue.get(0);
		}
		return temp;
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

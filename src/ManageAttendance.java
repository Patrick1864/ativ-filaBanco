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
	
	ppublic Client getNext() {
		Client temp;
		if(!this.communQueue.isEmpty() && !this.priorityQueue.isEmpty()) {
			if(this.ordenador <= 2) {
				this.ordenador++;
				this.priorityQueue.remove(0);
				temp = this.priorityQueue.get(0);
			}else {
				this.ordenador = 0;
				this.communQueue.remove(0);
				temp = this.communQueue.get(0);
			}
		} else if(!this.communQueue.isEmpty() && this.priorityQueue.isEmpty()) {
			this.communQueue.remove(0);
			temp = this.communQueue.get(0);
		} else {
			this.priorityQueue.remove(0);
			temp = this.priorityQueue.get(0);
		}
		return temp;
	}
	
	public String showQueues() {
		int i = 0,j = 0;
		StringBuilder sb = new StringBuilder();
		sb.append("isoso:");
		if(this.priorityQueue.isEmpty()) {
			sb.append("vazio");
		}else {
			for(Client client: this.priorityQueue) {
				if(i++ == this.priorityQueue.size() - 1){
					sb.append(client.getName());
			    }else {
			    	sb.append(client.getName() + "-");
			    }
			}			
		}
		sb.append(";");
		sb.append("normal:");
		if(this.communQueue.isEmpty()) {
			sb.append("vazio");
		}else {
			for(Client client: this.communQueue) {
				if(j++ == this.communQueue.size() - 1){
					sb.append(client.getName());
			    }else {
			    	sb.append(client.getName() + "-");
			    }
			}			
		}
		return sb.toString();
	}

}

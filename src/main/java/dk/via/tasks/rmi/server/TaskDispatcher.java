package dk.via.tasks.rmi.server;

import dk.via.requestreply.Message;
import dk.via.requestreply.server.Recipient;
import dk.via.util.ByteConverter;

public class TaskDispatcher implements Recipient {
	private Skeleton skeleton;
	
	public TaskDispatcher(Skeleton skeleton) {
		this.skeleton = skeleton;
	}
	
	@Override
	public byte[] interpret(Message message) {
	}
}

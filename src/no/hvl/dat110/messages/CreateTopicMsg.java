package no.hvl.dat110.messages;

public class CreateTopicMsg extends Message {
//	private MessageType mType;
//	private String user;
	private String topic;
	
	public CreateTopicMsg (String user,String topic) {
		
		super(MessageType.CREATETOPIC, user);
//		mType = MessageType.CREATETOPIC;
//		this.user = user;
		this.topic = topic;
	}

	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

//	public MessageType getMType() {
//		return mType;
//	}
//
//	public void setMType(MessageType mType) {
//		this.mType = mType;
//	}
//
//	public String getUser() {
//		return user;
//	}
//
//	public void setUser(String user) {
//		this.user = user;
//	}

	@Override
	public String toString() {
		return "CreateTopicMsg [topic=" + topic + "]";
	}
	
	
	
	// message sent from client to create topic on the broker
	
	// TODO: 
	// Implement object variables - a topic is required
	
	// Constructor, get/set-methods, and toString method
    // as described in the project text	
}

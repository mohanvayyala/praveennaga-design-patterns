package com.praveennaga.designpatterns.structural.bridge;

public class TextMessage extends Message {
	
	TextMessage(MessageSender messageSender){
		super(messageSender);
	}

	@Override
	void send() {
		messageSender.sendMessage();
	}
	
	

}

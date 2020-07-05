package com.praveennaga.designpatterns.structural.bridge;

public class EmailMessageSender implements MessageSender {

	@Override
	public void sendMessage() {
		System.out.println("Email Message Sent");
	}
}

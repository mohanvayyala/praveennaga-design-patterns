package com.praveennaga.designpatterns.structural.bridge;

public abstract class Message {
	MessageSender messageSender;

	Message(MessageSender messageSender) {
		this.messageSender = messageSender;
	}

	abstract void send();
}

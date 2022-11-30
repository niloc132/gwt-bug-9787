package com.vertispan.bug9787;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.RootPanel;

public class App implements EntryPoint {
	public void onModuleLoad() {
		final Button sendButton = new Button("Send");
		RootPanel.get("sendButtonContainer").add(sendButton);
		sendButton.addClickHandler(new ClickHandler() {
			@Override
			public void onClick(ClickEvent event) {
				GWT.log("TEST");
			}
		});
	}
}

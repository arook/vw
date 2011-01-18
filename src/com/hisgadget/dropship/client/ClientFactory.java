package com.hisgadget.dropship.client;

import com.google.gwt.event.shared.EventBus;
import com.google.gwt.place.shared.PlaceController;
import com.hisgadget.dropship.client.ui.GoodbyeView;
import com.hisgadget.dropship.client.ui.HelloView;

public interface ClientFactory {
	EventBus getEventBus();
	PlaceController getPlaceController();
	HelloView getHelloView();
	GoodbyeView getGoodbyeView();
}

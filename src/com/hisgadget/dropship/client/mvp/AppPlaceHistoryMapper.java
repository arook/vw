package com.hisgadget.dropship.client.mvp;

import com.google.gwt.place.shared.PlaceHistoryMapper;
import com.google.gwt.place.shared.WithTokenizers;
import com.hisgadget.dropship.client.place.GoodbyePlace;
import com.hisgadget.dropship.client.place.HelloPlace;

@WithTokenizers( { HelloPlace.Tokenizer.class, GoodbyePlace.Tokenizer.class })
public interface AppPlaceHistoryMapper extends PlaceHistoryMapper {

}

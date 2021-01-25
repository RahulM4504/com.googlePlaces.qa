package resources;

import java.util.ArrayList;
import java.util.List;

import pojo.SeralizeGooglePlaceLocation;
import pojo.seralizeGoolePlaceMain;

public class testDataBuilder {
	
	public seralizeGoolePlaceMain AddPlacesPayload() {
		seralizeGoolePlaceMain mainPojo = new seralizeGoolePlaceMain();
		
		mainPojo.setAccuracy(50);
		mainPojo.setAddress("Mumbai");
		mainPojo.setLanguage("english");		
		mainPojo.setName("rahul");
		mainPojo.setPhone_number("9867656563");
		List<String> aList = new ArrayList<String>();
		aList.add("shoe park");
		aList.add("shop");
		mainPojo.setTypes(aList);
		mainPojo.setWebsite("www.rahul.com");
		SeralizeGooglePlaceLocation location = new SeralizeGooglePlaceLocation();
		mainPojo.setLocation(location);
		location.setLat(-121.5445454);
		location.setLng(121.54545454);	
		return mainPojo;
		
	}

}

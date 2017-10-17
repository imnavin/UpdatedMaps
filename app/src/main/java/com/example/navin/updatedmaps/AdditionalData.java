package com.example.navin.updatedmaps;

/**
 * Created by navin on 10/17/2017.
 */

public class AdditionalData {

    public String getNearbyTrainUrl(double latitude, double longitude, String nearbyPlace){
        StringBuilder googlePlaceTrainUrl = new StringBuilder("https://maps.googleapis.com/maps/api/place/nearbysearch/json?");
        //https://maps.googleapis.com/maps/api/place/nearbysearch/json?location=-33.8670522,151.1957362&radius=500&type=restaurant&keyword=cruise&key=AIzaSyAib7lBWc7HtYdmd709qHm_Cux1E5P-XvE
        googlePlaceTrainUrl.append("location="+latitude+","+longitude);
        //googlePlaceUrl.append("&radius="+PROXIMITY_RADIUS);
        googlePlaceTrainUrl.append("&rankby=distance");
        googlePlaceTrainUrl.append("&type="+nearbyPlace);
        //googlePlaceUrl.append("&keyword=railway");
        googlePlaceTrainUrl.append("&sensor=true");
        googlePlaceTrainUrl.append("&key="+"AIzaSyAib7lBWc7HtYdmd709qHm_Cux1E5P-XvE");

        return googlePlaceTrainUrl.toString();
    }

    private String getDirectionUrl(double A_lat, double A_lng, double B_lat, double B_lng){
        StringBuilder googleDirectionUrl = new StringBuilder("https://maps.googleapis.com/maps/api/directions/json?");
        googleDirectionUrl.append("origin="+A_lat+","+A_lng);
        googleDirectionUrl.append("&destination="+B_lat+","+B_lng);
        googleDirectionUrl.append("&key="+"AIzaSyCeko4AxuvPO6rJULEUH5ee4HfDyLSK0qU");

        return googleDirectionUrl.toString();
    }
}

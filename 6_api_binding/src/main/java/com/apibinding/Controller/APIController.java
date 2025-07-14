package com.apibinding.Controller;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

import org.json.JSONObject;

public class APIController {

    public String API_KEY = "AIzaSyC6bWY8lqQKaM79I13h9bQAqVfNTIeuHnM";
    public static String getImageUrl(String category) {
        String imageUrl = "";
       String link = "https://api.unsplash.com/photos/random?query=" + category + "&client_id=71s0d-bx6YTpLdpAY8mxs5fs9ybvkJn1Dv8YpTpu_Ws";

        try {
            URL url = new URL(link);
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setRequestMethod("GET");

            BufferedReader br = new BufferedReader(
                    new InputStreamReader(httpURLConnection.getInputStream())
            );

            String line;
            StringBuilder response = new StringBuilder();
            while ((line = br.readLine()) != null) {
                response.append(line);
            }

            JSONObject obj = new JSONObject(response.toString());
            imageUrl = obj.getJSONObject("urls").getString("small");

        } catch (Exception e) {
            
        }

        return imageUrl;
    }
}


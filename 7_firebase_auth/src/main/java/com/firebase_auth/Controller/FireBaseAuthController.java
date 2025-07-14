package com.firebase_auth.Controller;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;

public class FireBaseAuthController {
    private static final String API_KEY = "AIzaSyC6bWY8lqQKaM79I13h9bQAqVfNTIeuHnM";

    public boolean signInWithEmailAndPassword(String email, String password) {
        try {
            URL url = new URL("https://identitytoolkit.googleapis.com/v1/accounts:signInWithPassword?key=" + API_KEY);

            HttpsURLConnection conn = (HttpsURLConnection) url.openConnection();
            conn.setRequestMethod("POST");
            conn.setRequestProperty("Content-Type", "application/json");
            conn.setDoOutput(true);

            String payLoad = String.format("{\"email\":\"%s\",\"password\":\"%s\",\"returnSecureToken\":true}", email,
                    password);

            try (OutputStream os = conn.getOutputStream()) {
                os.write(payLoad.getBytes());
            }

            int responseCode = conn.getResponseCode();
            if (responseCode == 200) {
                return true;
            } else {
                try (BufferedReader br = new BufferedReader(new InputStreamReader(conn.getErrorStream()))) {
                    String line;
                    while ((line = br.readLine()) != null) {
                        System.out.println(line);
                    }
                }
                return false;
            }

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}

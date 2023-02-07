package com.example.voisetext;

import android.os.AsyncTask;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Send extends AsyncTask<Void, Void, Void> {
    String str="";
    String get="";

    public Send(String gett){
        this.get=gett;


    }
    protected Void doInBackground(Void... arg0) {
        try {
            get = get.replaceAll("\\[|\\]", "");
            URL obj = new URL(""+get);
            HttpURLConnection connection = (HttpURLConnection) obj.openConnection();
            connection.setRequestMethod("GET");
            InputStreamReader reader = new InputStreamReader(connection.getInputStream());
            BufferedReader in = new BufferedReader(reader);
            String line;
            while ((line = in.readLine()) != null)
                str+=line;
            str=str.replaceAll("\\<[^>]*>","");
        } catch (Exception e) {
            str=e.toString();
        }
        return null;
    }
    protected void onPostExecute(Void aVoid){
    Voise.text.setText("Принято "+str);
    }
}
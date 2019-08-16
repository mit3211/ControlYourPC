package com.consistentone.controlyourpc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //below function is the code for shutDown of PC/Computer.
    public void ShutDown(View V){
        Client myClient = new Client("shutdown");
        myClient.execute();
    }
    //below function is the code for restart of PC/Computer.
    public void Restart(View V){
        Client myClient1 = new Client("restart");
        myClient1.execute();

    }
    //below function is the code for opening Music application.
    public void Music(View V){
        Client myClient2 = new Client("music");
        myClient2.execute();
    }
}

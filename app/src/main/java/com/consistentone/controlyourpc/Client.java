package com.consistentone.controlyourpc;

import android.os.AsyncTask;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class Client extends AsyncTask<Void,Void,Void> {

    String type = "";
    String IpAddress = "192.168.0.100";
    Client(String t)
    {
        type = t;
    }
    protected Void doInBackground(Void... arg0)
    {
        if(type == "shutdown")
        {
            try {
                Socket socket = new Socket(IpAddress, 9999);
                OutputStream toServer = socket.getOutputStream();
                DataOutputStream outputStream = new DataOutputStream(toServer);
                outputStream.writeBytes("shutdown");
            }
            catch (IOException ex){
                ex.printStackTrace();
            }


        }
        else if(type == "restart")
        {
            try {
                Socket socket = new Socket(IpAddress, 9999);
                OutputStream toServer = socket.getOutputStream();
                DataOutputStream outputStream = new DataOutputStream(toServer);
                outputStream.writeBytes("restart");
            }
            catch (IOException ex){
                ex.printStackTrace();
            }
        }
        else if (type == "music")
        {
            try {
                Socket socket = new Socket(IpAddress, 9999);
                OutputStream toServer = socket.getOutputStream();
                DataOutputStream outputStream = new DataOutputStream(toServer);
                outputStream.writeBytes("music");
            }
            catch (IOException ex){
                ex.printStackTrace();
            }
        }
        return null;
    }

}

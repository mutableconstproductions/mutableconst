package com.mutableconst.chatserver.gui;

import com.mutableconst.protocol.ConnectionType;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class MainActivity extends Activity 
{
	// Connection details
	public static ConnectionType CONNECTION_TYPE = ConnectionType.ADB;
	public static String LOCALHOST = "10.0.2.2";
	
	
	// TIMEOUT of connection, in seconds
	public static int TIMEOUT = 10;

	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		//TODO: SharedPreferences
		//TODO: Runtime shutdown handler thread
		//TODO: Communication protocol
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) 
	{
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	public void createAdbSocketConnection()
	{
		
	}

}
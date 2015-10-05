package com.codepath.apps.TwttrClient;

import android.content.Context;

/*
 * This is the Android application itself and is used to configure various settings
 * including the image cache in memory and on disk. This also adds a singleton
 * for accessing the relevant rest client.
 *
 *     TwttrClient client = RestApplication.getRestClient();
 *     // use client to send requests to API
 *
 */
public class RestApplication extends com.activeandroid.app.Application {
	private static Context context;

	@Override
	public void onCreate() {
		super.onCreate();
		RestApplication.context = this;
	}

	public static TwttrClient getRestClient() {
		return (TwttrClient) TwttrClient.getInstance(TwttrClient.class, RestApplication.context);
	}
}
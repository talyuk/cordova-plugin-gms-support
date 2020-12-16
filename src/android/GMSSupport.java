package org.apache.cordova.gmssupport;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONException;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;

public class GMSSupport extends CordovaPlugin {
    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        if (action.equals("getStatus")) {
            JSONObject json = new JSONObject();
            GoogleApiAvailability googleAPI = GoogleApiAvailability.getInstance();
            int result = googleAPI.isGooglePlayServicesAvailable(this.cordova.getContext());
            callbackContext.success(json.put("status", result != ConnectionResult.SERVICE_INVALID));
            return true;
        } else {
            callbackContext.error("Method not allowed");
            return false;
        }
    }
}

package com.bignerdranch.android.bluetoothtestbed.client;

import android.bluetooth.BluetoothDevice;
import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.os.Build;
import android.support.annotation.RequiresApi;

public class GattServerViewModel extends BaseObservable {

    private BluetoothDevice mBluetoothDevice;

    public GattServerViewModel(BluetoothDevice bluetoothDevice) {
        mBluetoothDevice = bluetoothDevice;
    }

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN_MR2)
    @Bindable
    public String getServerName() {
        if (mBluetoothDevice == null) {
            return "";
        }
        return mBluetoothDevice.getAddress();
    }
}

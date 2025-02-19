package fr.isen.ticketapp.interfaces.services;

import fr.isen.ticketapp.interfaces.models.DeviceModel;

import java.util.List;

public class DeviceserviceImpl implements Deviceservice {
    @Override
    public List<DeviceModel> getAllDevice() {
        return List.of();
    }

    @Override
    public void updateDevice(DeviceModel deviceModel) {

    }

    @Override
    public void removeDevice(int id) {

    }

    @Override
    public DeviceModel addDevice(DeviceModel deviceModel) {
        return null;
    }

    @Override
    public DeviceModel getOneDevice(int id) {
        return null;
    }
}

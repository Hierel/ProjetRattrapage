package fr.isen.ticketapp.interfaces.services;

import fr.isen.ticketapp.interfaces.models.DeviceModel;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class DeviceserviceImpl implements Deviceservice {

    private List<DeviceModel> devices = new ArrayList<>();

    @Override
    public List<DeviceModel> getAllDevice() {
        return devices;
    }

    @Override
    public void updateDevice(DeviceModel deviceModel) {
        Optional<DeviceModel> existingDevice = devices.stream()
                .filter(device -> device.id == deviceModel.id)
                .findFirst();

        existingDevice.ifPresent(device -> {
            device.etat = deviceModel.etat;
            device.configuration = deviceModel.configuration;
            device.id_user = deviceModel.id_user;
        });
    }

    @Override
    public void removeDevice(int id) {
        devices.removeIf(device -> device.id == id);
    }

    @Override
    public DeviceModel addDevice(DeviceModel deviceModel) {
        devices.add(deviceModel);
        return deviceModel;
    }

    @Override
    public DeviceModel getOneDevice(int id) {
        return devices.stream()
                .filter(device -> device.id == id)
                .findFirst()
                .orElse(null);  // Retours null si l'appareil n'existe pas
    }
}

package fr.isen.ticketapp.interfaces.services;

import java.util.List;
import fr.isen.ticketapp.interfaces.models.DeviceModel;

//begin of modifiable zone(Javadoc).......C/848b2ab7-9520-45e2-8faf-0a2df51033f8

//end of modifiable zone(Javadoc).........E/848b2ab7-9520-45e2-8faf-0a2df51033f8
public interface Deviceservice {
//begin of modifiable zone(Javadoc).......C/7e6f941f-c46c-4a75-926e-1aad051deae8

//end of modifiable zone(Javadoc).........E/7e6f941f-c46c-4a75-926e-1aad051deae8
    List<DeviceModel> getAllDevice();

//begin of modifiable zone(Javadoc).......C/14edd134-2740-4c2f-a37a-f62c4bc82873

//end of modifiable zone(Javadoc).........E/14edd134-2740-4c2f-a37a-f62c4bc82873
    void updateDevice(final DeviceModel deviceModel);

//begin of modifiable zone(Javadoc).......C/18e36810-0bcd-459b-becf-4117aeaebf0b

//end of modifiable zone(Javadoc).........E/18e36810-0bcd-459b-becf-4117aeaebf0b
    void removeDevice(final int id);

//begin of modifiable zone(Javadoc).......C/c5ad6e56-4658-4676-9ca0-d51953387890

//end of modifiable zone(Javadoc).........E/c5ad6e56-4658-4676-9ca0-d51953387890
    DeviceModel addDevice(final DeviceModel deviceModel);

//begin of modifiable zone(Javadoc).......C/e357f903-c941-4c8b-abce-dd2a39074167

//end of modifiable zone(Javadoc).........E/e357f903-c941-4c8b-abce-dd2a39074167
    DeviceModel getOneDevice(final int id);

}

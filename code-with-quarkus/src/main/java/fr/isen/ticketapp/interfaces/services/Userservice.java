package fr.isen.ticketapp.interfaces.services;

import java.util.List;
import fr.isen.ticketapp.interfaces.models.UserModel;

//begin of modifiable zone(Javadoc).......C/c419b037-f979-4885-b364-5687ee50fd30

//end of modifiable zone(Javadoc).........E/c419b037-f979-4885-b364-5687ee50fd30
public interface Userservice {
//begin of modifiable zone(Javadoc).......C/b17ccb08-dd21-4aad-bc88-dae0f035a250

//end of modifiable zone(Javadoc).........E/b17ccb08-dd21-4aad-bc88-dae0f035a250
    List<UserModel> getAllUser();

//begin of modifiable zone(Javadoc).......C/42d21f2b-9579-480f-bd28-d11d93bd67d2

//end of modifiable zone(Javadoc).........E/42d21f2b-9579-480f-bd28-d11d93bd67d2
    void updateUser(final UserModel userModel);

//begin of modifiable zone(Javadoc).......C/5620975c-b500-42d1-bd2d-82d0544e7dcf

//end of modifiable zone(Javadoc).........E/5620975c-b500-42d1-bd2d-82d0544e7dcf
    UserModel addUser(final UserModel userModel);

//begin of modifiable zone(Javadoc).......C/866c02df-a029-4785-9e46-823f5d00db00

//end of modifiable zone(Javadoc).........E/866c02df-a029-4785-9e46-823f5d00db00
    void removeUser(final int id);

//begin of modifiable zone(Javadoc).......C/60f041f1-1c9e-4a07-b574-6cd105c5c229

//end of modifiable zone(Javadoc).........E/60f041f1-1c9e-4a07-b574-6cd105c5c229
    UserModel getOneUser(final int id);

}

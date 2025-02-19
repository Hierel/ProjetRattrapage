package fr.isen.ticketapp.interfaces.services;

import fr.isen.ticketapp.interfaces.models.UserModel;

import java.util.List;

public class UserserviceImpl implements Userservice {
    @Override
    public List<UserModel> getAllUser() {
        return List.of();
    }

    @Override
    public void updateUser(UserModel userModel) {

    }

    @Override
    public UserModel addUser(UserModel userModel) {
        return null;
    }

    @Override
    public void removeUser(int id) {

    }

    @Override
    public UserModel getOneUser(int id) {
        return null;
    }
}

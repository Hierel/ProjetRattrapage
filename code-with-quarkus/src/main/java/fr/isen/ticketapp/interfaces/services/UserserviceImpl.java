package fr.isen.ticketapp.interfaces.services;

import fr.isen.ticketapp.interfaces.models.UserModel;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UserserviceImpl implements Userservice {

    private List<UserModel> users = new ArrayList<>();

    @Override
    public List<UserModel> getAllUser() {
        return users;
    }

    @Override
    public UserModel addUser(UserModel userModel) {
        users.add(userModel);
        return userModel;
    }

    @Override
    public void updateUser(UserModel userModel) {
        Optional<UserModel> existingUser = users.stream()
                .filter(user -> user.id == userModel.id)
                .findFirst();

        existingUser.ifPresent(user -> {
            user.nom = userModel.nom;
            user.email = userModel.email;
            user.password = userModel.password;
            user.last_date_connexion = userModel.last_date_connexion;
            user.statut = userModel.statut;
            user.role = userModel.role;
        });
    }

    @Override
    public void removeUser(int id) {
        users.removeIf(user -> user.id == id);
    }

    @Override
    public UserModel getOneUser(int id) {
        return users.stream()
                .filter(user -> user.id == id)
                .findFirst()
                .orElse(null);  // Retourne null si l'utilisateur n'existe pas
    }
}

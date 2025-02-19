package fr.isen.ticketapp.interfaces.models;

import fr.isen.ticketapp.interfaces.models.enums.ETAT_TICKET;
import fr.isen.ticketapp.interfaces.models.enums.IMPACT;

//begin of modifiable zone(Javadoc).......C/8bf658e7-3044-4922-9583-551f6b5325c8

//end of modifiable zone(Javadoc).........E/8bf658e7-3044-4922-9583-551f6b5325c8
public class TicketModel {
//begin of modifiable zone(Javadoc).......C/c7f23f8f-ab9a-41b5-a414-6495ff5e4af9

//end of modifiable zone(Javadoc).........E/c7f23f8f-ab9a-41b5-a414-6495ff5e4af9
    public int id ;

//begin of modifiable zone(Javadoc).......C/40ceb4ab-0d4f-40fd-aa58-c51bbeae13e0

//end of modifiable zone(Javadoc).........E/40ceb4ab-0d4f-40fd-aa58-c51bbeae13e0
    public IMPACT impact;

//begin of modifiable zone(Javadoc).......C/58c5e6f6-d5a7-4a5f-b899-70ce32c335df

//end of modifiable zone(Javadoc).........E/58c5e6f6-d5a7-4a5f-b899-70ce32c335df
    public String titre;

//begin of modifiable zone(Javadoc).......C/782f3cc9-86ab-429f-ba86-48916cc3559e

//end of modifiable zone(Javadoc).........E/782f3cc9-86ab-429f-ba86-48916cc3559e
    public String description;

//begin of modifiable zone(Javadoc).......C/e4f05fe7-7fa6-4efc-99d0-1ec7466eced8

//end of modifiable zone(Javadoc).........E/e4f05fe7-7fa6-4efc-99d0-1ec7466eced8
    public ETAT_TICKET etat;

//begin of modifiable zone(Javadoc).......C/f8e01908-b398-4e6e-8ec7-2055c7bc5659

//end of modifiable zone(Javadoc).........E/f8e01908-b398-4e6e-8ec7-2055c7bc5659
    public UserModel user_creator;

//begin of modifiable zone(Javadoc).......C/860d0b34-63c1-4277-ab36-3fab9c513617

//end of modifiable zone(Javadoc).........E/860d0b34-63c1-4277-ab36-3fab9c513617
    public DeviceModel poste_informatique;

//begin of modifiable zone(Javadoc).......C/91857d41-211b-4773-a844-380b2ac0a93f

//end of modifiable zone(Javadoc).........E/91857d41-211b-4773-a844-380b2ac0a93f
    public String type_demande;

}

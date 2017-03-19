package fr.univubs.inf1603.visitcard.pojo;

import fr.univubs.inf1603.visitcard.engine.AddressObserver;
import fr.univubs.inf1603.visitcard.engine.AddressObserverSet;

/**
 * PojoAddress - POJO
 *               Implémentations de l'interface Address de l'engine
 *
 * @author POJO
 */
public class PojoAddress implements fr.univubs.inf1603.visitcard.engine.Address {
    
    private String street;  //Nom et numéro de rue
    private String city;    //Nom de la ville
    private String zipCode; //Code postal
    private String country; //Nom du pays
    private final AddressObserverSet obs; //Observeur de l'Address
    
    /**
     * Constructeur d'Address
     * 
     * @param street Le numéro et nom de rue
     * @param city Le nom de la ville
     * @param zipCode Le code postal
     * @param country Le nom du pays
     */
    public  PojoAddress (String street, String city, String zipCode, String country) {
        this.street=street;
        this.city=city;
        this.zipCode=zipCode;
        this.country=country;
        //Quand on construit une nouvelle Address on lui créé un observateur
        //qui sera attentif aux modifications
        this.obs=new AddressObserverSet(); 
    }
    
    @Override
    public String getStreet() {
        return this.street;
    }

    @Override
    public void setStreet(String newStreet) {
        String old = getStreet();
        this.street=newStreet;
        this.obs.notifyStreetChanged(this, old, getStreet());
    }

    @Override
    public String getCity() {
        return this.city;
    }

    @Override
    public void setCity(String newLocality) {
        String old=getCountry();
        this.city=newLocality;
        this.obs.notifyCityChanged(this, old, getCountry());
    }

    @Override
    public String getZipCode() {
        return this.zipCode;
    }

    @Override
    public void setZipCode(String newZipCode) {
        String old=getZipCode();
        this.zipCode=newZipCode;
        this.obs.notifyZipCodeChanged(this, old, getZipCode());
    }

    @Override
    public String getCountry() {
        return this.country;
    }

    @Override
    public void setCountry(String newCountry) {
        String old=getCountry();
        this.country=newCountry;
        this.obs.notifyCountryChanged(this, old, getCountry());
    }

    @Override
    public void addAddressObserver(AddressObserver ao) {
        this.obs.addAddressObserver(ao);     
    }

    @Override
    public void removeAddressObserver(AddressObserver ao) {
        this.obs.removeAddressObserver(ao);
    }
}

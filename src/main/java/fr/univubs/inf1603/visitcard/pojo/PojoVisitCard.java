package fr.univubs.inf1603.visitcard.pojo;

import fr.univubs.inf1603.visitcard.engine.Address;
import fr.univubs.inf1603.visitcard.engine.AddressEmailType;
import fr.univubs.inf1603.visitcard.engine.PhoneType;
import fr.univubs.inf1603.visitcard.engine.VisitCardObserver;
import fr.univubs.inf1603.visitcard.engine.VisitCardObserverSet;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * VisitCard - POJO Implémentations de l'intrface VisitCard de l'engine
 *
 * @author inf1603
 */
public class PojoVisitCard implements fr.univubs.inf1603.visitcard.engine.VisitCard {

    /**
     * Nom de famille
     */
    private String lastName;
    /**
     * Prénom
     */
    private String firstName;
    /**
     * Second prénom
     */
    private String middleName;
    /**
     * Liste des adresses possibles
     */
    private final Map<AddressEmailType, Address> adr;
    /**
     * Liste d'adresses mail
     */
    private final Map<AddressEmailType, String> email;
    /**
     * Titre honorifique
     */
    private String title;
    /**
     * Liste des numéros de téléphones
     */
    private final Map<PhoneType, String> phone;
    /**
     * Identifiant universel
     */
    private final UUID uuid;
    /**
     * Nom formaté
     */
    private String formatedName;
    /**
     * Date de création de la carte de visite.
     */
    private final Date dateOfCreation;
    /**
     * Date de la dernière modification de la carte de visite
     */
    private Date dateOfLastModification;
    /**
     * Collection des observeurs lié à la carte de visite
     */
    private final VisitCardObserverSet vcos;

    /**
     * Constructeur de VisitCard
     *
     * @param firstName Le prénom du contact
     * @param lastName Le nom de famille du contact
     * @param middleName Le second prénom du contact
     * @param title Le titre du contact
     */
    public PojoVisitCard(String firstName, String lastName, String middleName, String title) {
        this.firstName = ((firstName == null) ? "" : firstName);
        this.lastName = ((lastName == null) ? "" : lastName);
        this.middleName = ((middleName == null) ? "" : middleName);
        this.title = ((title == null) ? "" : title);

        formatedName = this.firstName + " " + this.middleName.charAt(0) + " " + this.lastName;

        this.uuid = UUID.randomUUID();
        this.dateOfCreation = new Date();
        this.dateOfLastModification = new Date();

        this.phone = new HashMap<PhoneType, String>();
        this.adr = new HashMap<AddressEmailType, Address>();
        this.email = new HashMap<AddressEmailType, String>();

        this.vcos = new VisitCardObserverSet();
    }

    @Override
    public UUID getUUID() {
        return this.uuid;
    }

    @Override
    public String getFirstName() {
        return this.firstName;
    }

    @Override
    public void setFirstName(String name) {
        String old = getFirstName();
        this.firstName = name;
        this.dateOfLastModification = new Date();
        this.vcos.notifyFirstNameChanged(this, old, name);
    }

    @Override
    public String getLastName() {
        return this.lastName;
    }

    @Override
    public void setLastName(String name) {
        String old = getLastName();
        this.lastName = name;
        this.dateOfLastModification = new Date();
        this.vcos.notifyLastNameChanged(this, old, getLastName());
    }

    @Override
    public String getMiddleName() {
        return this.middleName;
    }

    @Override
    public void setMiddleName(String middleName) {
        String old = getMiddleName();
        this.middleName = middleName;
        this.dateOfLastModification = new Date();
        this.vcos.notifyMiddleNameChanged(this, old, getMiddleName());
    }

    @Override
    public String getFormatedName() {
        return this.formatedName;
    }

    @Override
    public void setFormatedName(String newStructuredName) {
        String old = getFormatedName();
        this.formatedName = newStructuredName;
        this.dateOfLastModification = new Date();
        this.vcos.notifyFormatedNameChanged(this, old, getFormatedName());
    }

    @Override
    public Address getAddress(AddressEmailType at, boolean createItIfMissing) {
        Address result = this.adr.get(at);
        if ((result == null) && (createItIfMissing)) {
            result = new PojoAddress("", "", "", "");
            this.adr.put(at, result);
        }
        return result;
    }

    @Override
    public void removeAddress(AddressEmailType aet) {
        Address old = getAddress(aet, false);
        this.adr.remove(aet);
        this.dateOfLastModification = new Date();
        this.vcos.notifyAddressRemoved(this, aet, old);
    }

    @Override
    public String getEmail(AddressEmailType aet, boolean createItIfMissing) {
        String result = this.email.get(aet);
        if ((result == null) && (createItIfMissing)) {
            result = "";
            this.email.put(aet, result);
        }
        return result;
    }

    @Override
    public void removeEmail(AddressEmailType aet) {
        String old = getEmail(aet, false);
        this.email.remove(aet);
        this.dateOfLastModification = new Date();
        this.vcos.notifyEmailRemoved(this, aet, old);
    }

    @Override
    public String getTitle() {
        return this.title;
    }

    @Override
    public void setTitle(String title) {
        String old = getTitle();
        this.title = title;
        this.dateOfLastModification = new Date();
        this.vcos.notifyTitleChanged(this, old, getTitle());
    }

    @Override
    public void removeTitle(String title) {
        String old = this.title;
        this.setTitle("");
        this.dateOfLastModification = new Date();
        this.vcos.notifyTitleChanged(this, old, "");
    }

    @Override
    public String getPhone(PhoneType pt, boolean createItIfMissing) {
        String result = this.phone.get(pt);
        if ((result == null) && (createItIfMissing)) {
            result = "";
            this.phone.put(pt, result);
        }
        return result;
    }

    @Override
    public void removePhone(PhoneType pt) {
        String old = getPhone(pt, false);
        this.phone.remove(pt);
        this.dateOfLastModification = new Date();
        this.vcos.notifyPhoneRemoved(this, pt, old);
    }

    @Override
    public Date getCreationDate() {
        return this.dateOfCreation;
    }

    @Override
    public Date getDateOfLastModification() {
        return this.dateOfLastModification;
    }

    @Override
    public void addVisitCardObserver(VisitCardObserver vco) {
        this.vcos.addVisitCardObserver(vco);
    }

    @Override
    public void removeVisitCardObserver(VisitCardObserver vco) {
        this.vcos.removeVisitCardObserver(vco);
    }
}

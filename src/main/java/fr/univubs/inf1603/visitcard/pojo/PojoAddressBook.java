package fr.univubs.inf1603.visitcard.pojo;

import fr.univubs.inf1603.visitcard.engine.FormatedNameSortResult;
import fr.univubs.inf1603.visitcard.engine.LastNameSortResult;
import fr.univubs.inf1603.visitcard.engine.FirstNameSortResult;
import fr.univubs.inf1603.visitcard.engine.AddressBookObserver;
import fr.univubs.inf1603.visitcard.engine.AddressBookObserverSet;
import fr.univubs.inf1603.visitcard.engine.SortResult;
import fr.univubs.inf1603.visitcard.engine.SortType;
import fr.univubs.inf1603.visitcard.engine.VisitCard;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * PojoAddressBook - POJO Implémentation de l'interface AdressBook de l'engine
 *
 * @author POJO
 */
public class PojoAddressBook implements fr.univubs.inf1603.visitcard.engine.AddressBook {

    private String name;    //Nom du carner d'adresse
    private Map<UUID, VisitCard> uuidVisitCardMap; //Collection des cartes de visites que constitue l'AdressBook
    //private Map<UUID,VisitCard> uuidVisitCardMapSaved;  //Collection des cartes de visites que constitue l'AdressBook sauvegardé en mémoire
    private final AddressBookObserverSet abos;    //Collection des AddressObserveurs liés à l'AdressBook

    /**
     * Constructeur d'AdressBook
     *
     * @param name Le nom donné au carnet d'adresses
     * @param saveType Le mode de sauvegarde utilisé
     */
    public PojoAddressBook(String name) {
        this.name = name;
        //On créé une nouvelle collection pour les cartes de visite
        this.uuidVisitCardMap = new HashMap<>();
        //this.uuidVisitCardMapSaved = new HashMap<>();
        this.abos = new AddressBookObserverSet();
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        String old = this.getName();
        this.name = name;
        this.abos.notifyNameChanged(this, old, getName());
    }

    @Override
    public long getSize() {
        return this.uuidVisitCardMap.size();
    }

    @Override
    public VisitCard getVisitCard(UUID uuid) {
        return this.uuidVisitCardMap.get(uuid);
    }

    @Override
    public void addVisitCard(VisitCard vc) {
        this.uuidVisitCardMap.put(vc.getUUID(), vc);
        this.abos.notifyVisitCardAdded(this, vc);
    }

    @Override
    public void removeVisitCard(UUID uuid) {
        VisitCard vc = uuidVisitCardMap.get(uuid.toString());
        this.uuidVisitCardMap.remove(uuid.toString());
        this.abos.notifyVisitCardRemoved(this, vc);
    }

    @Override
    public void removeVisitCard(VisitCard vc) {
        this.removeVisitCard(vc.getUUID());
        this.abos.notifyVisitCardRemoved(this, vc);
    }

    @Override
    public SortResult getSortResult(SortType st) {
        switch (st) {
            case ORDER_BY_FIRST_NAME:
                return new FirstNameSortResult(this.uuidVisitCardMap.values());
            case ORDER_BY_FORMATED_NAME:
                return new FormatedNameSortResult(this.uuidVisitCardMap.values());
            case ORDER_BY_LAST_NAME:
                return new LastNameSortResult(this.uuidVisitCardMap.values());
            default:
                throw new IllegalArgumentException("Erreur d'argument");
        }
    }

    @Override
    public void addAddressBookObserver(AddressBookObserver abo) {
        this.abos.addAddressBookObserver(abo);
    }

    @Override
    public void removeAddressBookObserver(AddressBookObserver abo) {
        this.abos.removeAddressBookObserver(abo);
    }

    @Override
    public void save() {
    }

}

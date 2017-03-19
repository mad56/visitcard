package fr.univubs.inf1603.visitcard.pojo;

import fr.univubs.inf1603.visitcard.engine.AddressBook;
import fr.univubs.inf1603.visitcard.engine.VisitCard;

/**
 * PojoAddressBookFactory - POJO
 *                          Implémentation de l'interface AddressBookFactory de l'engine
 *
 * @author POJO
 */
public class PojoAddressBookFactory implements fr.univubs.inf1603.visitcard.engine.AddressBookFactory {

    @Override
    public AddressBook createAddressBook() {
        //On met par défaut VCard comme mode de sauvegarde par défaut
        //Si on vient à mettre en application le save "local" ce cera ce mode qui deviendra par défaut
        return new PojoAddressBook("");
    }

    @Override
    public VisitCard createVisitCard() {
        return new PojoVisitCard("","","","");
    }
    
}

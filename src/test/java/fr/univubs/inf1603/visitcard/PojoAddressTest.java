package fr.univubs.inf1603.visitcard;

import fr.univubs.inf1603.visitcard.pojo.PojoAddress;
import fr.univubs.inf1603.visitcard.unittest.AddressTest;
import org.junit.Test;
/**
 * PojoAddressTest - Test unitaire de la classe PojoAddress
 *                   On testera toutes les méthodes de PojoAddress et les levées d'exception
 *
 * @author OVONO_Parfait
 * @author BOSSARD_Noémie
 */
public class PojoAddressTest extends AddressTest {
        
    /**
     * testAddress - Test les méthodes de de la classe PojoAddress. 
     *               On effectura ce teste en appelant d'autres méthodes à remonter plus tard.
     * 
     */
    @Test
    public void testAddress(){
        //On créé une adresse vide
        PojoAddress address = new PojoAddress("","","","");
        //On envoie cette adresse dans les différentes méthodes
        super.testEmptyAddress(address);
        super.testCompletedAddress(address);
    }
}

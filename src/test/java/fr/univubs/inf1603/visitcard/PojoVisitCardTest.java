package fr.univubs.inf1603.visitcard;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import fr.univubs.inf1603.visitcard.engine.Address;
import fr.univubs.inf1603.visitcard.engine.AddressEmailType;
import static fr.univubs.inf1603.visitcard.engine.AddressEmailType.*;
import fr.univubs.inf1603.visitcard.engine.PhoneType;
import fr.univubs.inf1603.visitcard.engine.VisitCard;
import fr.univubs.inf1603.visitcard.engine.VisitCardObserver;
import fr.univubs.inf1603.visitcard.pojo.PojoAddress;
import fr.univubs.inf1603.visitcard.pojo.PojoVisitCard;
import java.util.Date;
import java.util.UUID;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author OVONO
 */
public class PojoVisitCardTest {

    static void testEmpty(VisitCard createVisitCard) {
        
    }
    
   /* public PojoVisitCardTest() {
    }

    /**
     * Test of getUUID method, of class PojoVisitCard.
     */
    /**@Test
    public void testGetUUID() {
        System.out.println("getUUID");
        PojoVisitCard instance = null;
        UUID expResult = null;
        UUID result = instance.getUUID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }**/

    /**
     * Test of getFirstName method, of class PojoVisitCard.
     *
    @Test
    public void testGetFirstName() {
        System.out.println("getFirstName");
        PojoVisitCard instance = new PojoVisitCard("Donald","Trump","Junior","President");
        String expResult = new String("Donald");
        String result = instance.getFirstName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setFirstName method, of class PojoVisitCard.
     *
    @Test
    public void testSetFirstName() {
        System.out.println("setFirstName");
        String name = "Ben";
        PojoVisitCard instance = new PojoVisitCard("Donald","Trump","Junior","President");
        instance.setFirstName(new String("Ben"));
        assertEquals(name,instance.getFirstName());
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getLastName method, of class PojoVisitCard.
     *
    @Test
    public void testGetLastName() {
        System.out.println("getLastName");
        PojoVisitCard instance = new PojoVisitCard("Donald","Trump","Junior","President");
        String expResult = "Trump";
        String result = instance.getLastName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setLastName method, of class PojoVisitCard.
     *
    @Test
    public void testSetLastName() {
        System.out.println("setLastName");
        String name = "Kerry";
        PojoVisitCard instance = new PojoVisitCard("Donald","Trump","Junior","President");
        instance.setLastName(name);
        assertEquals(name,instance.getLastName());
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getMiddleName method, of class PojoVisitCard.
     */
    @Test
    public void testGetMiddleName() {
        System.out.println("getMiddleName");
        PojoVisitCard instance = new PojoVisitCard("Donald","Trump","Junior","President");
        String expResult = "Junior";
        String result = instance.getMiddleName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setMiddleName method, of class PojoVisitCard.
     *
    @Test
    public void testSetMiddleName() {
        System.out.println("setMiddleName");
        String middleName = "John";
        PojoVisitCard instance = new PojoVisitCard("Donald","Trump","Junior","President");
        instance.setMiddleName(middleName);
        assertEquals(middleName,instance.getMiddleName());
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getFormatedName method, of class PojoVisitCard.
     *
    @Test
    public void testGetFormatedName() {
        System.out.println("getFormatedName");
        PojoVisitCard instance = new PojoVisitCard("Donald","Trump","Junior","President");
        String expResult = "Donald J Trump";
        String result = instance.getFormatedName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setFormatedName method, of class PojoVisitCard.
     *
    @Test
    public void testSetFormatedName() {
        System.out.println("setFormatedName");
        String newStructuredName = "Donald J. Trump";
        PojoVisitCard instance = new PojoVisitCard("Donald","Trump","Junior","President");
        instance.setFormatedName(newStructuredName);
        assertEquals(newStructuredName,instance.getFormatedName());
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getAddress method, of class PojoVisitCard.
     
    @Test
    public void testGetAddress() {
        System.out.println("getAddress");
        AddressEmailType at = HOME;
        boolean createItIfMissing = false;
        PojoVisitCard instance = new PojoVisitCard("Donald","Trump","Junior","President");
        Address expResult, result;
        try {
            result = instance.getAddress(at, createItIfMissing);
            
        } catch (NullPointerException e) {
            
        }
        //Address result = instance.getAddress(at, createItIfMissing);
        //assertNull(result);
        
        createItIfMissing=true;
        result = instance.getAddress(at, createItIfMissing);
        expResult = new PojoAddress("","","","");
        assertEquals(expResult, result);
     
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of removeAddress method, of class PojoVisitCard.
     *
    @Test
    public void testRemoveAddress() {
        System.out.println("removeAddress");
        AddressEmailType aet = HOME;
        PojoVisitCard instance = new PojoVisitCard("Donald","Trump","Junior","President");
        boolean createItIfMissing=true;
        Address result = instance.getAddress(aet, createItIfMissing);
        instance.removeAddress(aet);
        assertEquals(null,instance.getAddress(aet, false));
        // TODO review the generated test code and remove the default call to fail.
        
    }*/

    /**
     * Test of getEmail method, of class PojoVisitCard.
     */
    /**@Test
    public void testGetEmail() {
        System.out.println("getEmail");
        AddressEmailType aet = null;
        boolean createItIfMissing = false;
        PojoVisitCard instance = new PojoVisitCard("Donald","Trump","Junior","President");
        String expResult = "";
        String result = instance.getEmail(aet, createItIfMissing);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }**/

    /**
     * Test of removeEmail method, of class PojoVisitCard.
     */
    /**@Test
    public void testRemoveEmail() {
        System.out.println("removeEmail");
        AddressEmailType aet = null;
        PojoVisitCard instance = new PojoVisitCard("Donald","Trump","Junior","President");
        instance.removeEmail(aet);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }**/

    /**
     * Test of getTitle method, of class PojoVisitCard.
     */
    @Test
    public void testGetTitle() {
        System.out.println("getTitle");
        PojoVisitCard instance = new PojoVisitCard("Donald","Trump","Junior","President");
        String expResult = "President";
        String result = instance.getTitle();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setTitle method, of class PojoVisitCard.
     */
    @Test
    public void testSetTitle() {
        System.out.println("setTitle");
        String title = "Mexicans Horror";
        PojoVisitCard instance = new PojoVisitCard("Donald","Trump","Junior","President");
        instance.setTitle(title);
        assertEquals(title,instance.getTitle());
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of removeTitle method, of class PojoVisitCard.
     */
    @Test
    public void testRemoveTitle() {
        System.out.println("removeTitle");
        String title = "";
        PojoVisitCard instance = new PojoVisitCard("Donald","Trump","Junior","President");
        instance.removeTitle(title);
        assertEquals(title,instance.getTitle());
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getPhone method, of class PojoVisitCard.
     */
    /**@Test
    public void testGetPhone() {
        System.out.println("getPhone");
        PhoneType pt = null;
        boolean createItIfMissing = false;
        PojoVisitCard instance = new PojoVisitCard("Donald","Trump","Junior","President");
        String expResult = "";
        String result = instance.getPhone(pt, createItIfMissing);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }**/

    /**
     * Test of removePhone method, of class PojoVisitCard.
     */
    /**@Test
    public void testRemovePhone() {
        System.out.println("removePhone");
        PhoneType pt = null;
        PojoVisitCard instance = new PojoVisitCard("Donald","Trump","Junior","President");
        instance.removePhone(pt);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }**/

    /**
     * Test of getCreationDate method, of class PojoVisitCard.
     */
    /**@Test
    public void testGetCreationDate() {
        System.out.println("getCreationDate");
        PojoVisitCard instance = new PojoVisitCard("Donald","Trump","Junior","President");
        Date expResult = null;
        Date result = instance.getCreationDate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }**/

    /**
     * Test of getDateOfLastModification method, of class PojoVisitCard.
     */
    /**@Test
    public void testGetDateOfLastModification() {
        System.out.println("getDateOfLastModification");
        PojoVisitCard instance = new PojoVisitCard("Donald","Trump","Junior","President");
        Date expResult = null;
        Date result = instance.getDateOfLastModification();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }**/

    /**
     * Test of addVisitCardObserver method, of class PojoVisitCard.
     */
    /**@Test
    public void testAddVisitCardObserver() {
        System.out.println("addVisitCardObserver");
        VisitCardObserver vco = null;
        PojoVisitCard instance = null;
        instance.addVisitCardObserver(vco);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }**/

    /**
     * Test of removeVisitCardObserver method, of class PojoVisitCard.
     */
    /**@Test
    public void testRemoveVisitCardObserver() {
        System.out.println("removeVisitCardObserver");
        VisitCardObserver vco = null;
        PojoVisitCard instance = null;
        instance.removeVisitCardObserver(vco);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }**/
    
}

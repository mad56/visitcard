package fr.univubs.inf1603.visitcard;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import fr.univubs.inf1603.visitcard.pojo.PojoAddressBook;
import org.junit.Test;
import fr.univubs.inf1603.visitcard.unittest.AddressBookTest;

/**
 *
 * @author OVONO
 */
public class PojoAddressBookTest {


    
    public void testAddressBook(){
        PojoAddressBook addressBook = new PojoAddressBook("");
        
        super.testEmptyAddressBook(addressBook);
    }
    
    /*public PojoAddressBookTest() {
    }

    /**
     * Test of getName method, of class PojoAddressBook.
     
    @Test
    public void testGetName() {
        System.out.println("getName");
        PojoAddressBook instance = new PojoAddressBook("carnet");
        String expResult = "carnet";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setName method, of class PojoAddressBook.
     *
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "book";
        PojoAddressBook instance = new PojoAddressBook("carnet");
        instance.setName(name);
        assertEquals(name,instance.getName());
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getSize method, of class PojoAddressBook.
     *
    @Test
    public void testGetSize() {
        System.out.println("getSize");
        PojoAddressBook instance = new PojoAddressBook("carnet");
        long expResult = 0;
        long result = instance.getSize();
        assertEquals(expResult, result);
        PojoVisitCard vc1 = new PojoVisitCard("Donald","Trump","Junior","President");
        PojoVisitCard vc2 = new PojoVisitCard("Noemie","Bossard","","Student");
        PojoVisitCard vc3 = new PojoVisitCard("Parfait","Ovono","","Student");
        PojoVisitCard vc4 = new PojoVisitCard("Malo","Poquillon","","Student");
        PojoVisitCard vc5 = new PojoVisitCard("Barack","Obama","Hussein","Ex-President");
        
        instance.addVisitCard(vc1);
        instance.addVisitCard(vc2);
        instance.addVisitCard(vc3);
        instance.addVisitCard(vc4);
        instance.addVisitCard(vc5);
        
        expResult=5;
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getVisitCard method, of class PojoAddressBook.
     *
    @Test
    public void testGetVisitCard() {
        System.out.println("getVisitCard");
        UUID uuid = null;
        PojoAddressBook instance = new PojoAddressBook("carnet");
        PojoVisitCard vc1 = new PojoVisitCard("Donald","Trump","Junior","President");
        instance.addVisitCard(vc1);
        
        uuid = vc1.getUUID();
        VisitCard expResult = vc1;
        VisitCard result = instance.getVisitCard(uuid);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of addVisitCard method, of class PojoAddressBook.
     *
    @Test
    public void testAddVisitCard() {
        System.out.println("addVisitCard");
        VisitCard vc = null;
        PojoAddressBook instance = new PojoAddressBook("carnet");
        PojoVisitCard vc1 = new PojoVisitCard("Donald","Trump","Junior","President");
        instance.addVisitCard(vc1);
        assertEquals(1,instance.getSize());
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of removeVisitCard method, of class PojoAddressBook.
     *
    @Test
    public void testRemoveVisitCard_UUID() {
        System.out.println("removeVisitCard");
        UUID uuid = null;
        
        PojoAddressBook instance = new PojoAddressBook("carnet");
        PojoVisitCard vc1 = new PojoVisitCard("Donald","Trump","Junior","President");
        
        uuid = vc1.getUUID();
        
        instance.addVisitCard(vc1);
        instance.removeVisitCard(uuid);
        assertEquals(0,instance.getSize());
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of removeVisitCard method, of class PojoAddressBook.
     *
    @Test
    public void testRemoveVisitCard_VisitCard() {
        System.out.println("removeVisitCard");
        VisitCard vc = null;
        PojoAddressBook instance = new PojoAddressBook("carnet");
        PojoVisitCard vc1 = new PojoVisitCard("Donald","Trump","Junior","President");
        
        vc = vc1;
        
        instance.addVisitCard(vc1);
        instance.removeVisitCard(vc1);
        assertEquals(0,instance.getSize());
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getSortResult method, of class PojoAddressBook.
     */
    /**@Test
    public void testGetSortResult() {
        System.out.println("getSortResult");
        SortType st = null;
        PojoAddressBook instance = null;
        SortResult expResult = null;
        SortResult result = instance.getSortResult(st);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }**/

    /**
     * Test of addAddressBookObserver method, of class PojoAddressBook.
     */
    /**@Test
    public void testAddAddressBookObserver() {
        System.out.println("addAddressBookObserver");
        AddressBookObserver abo = null;
        PojoAddressBook instance = null;
        instance.addAddressBookObserver(abo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }**/

    /**
     * Test of removeAddressBookObserver method, of class PojoAddressBook.
     */
    /**@Test
    public void testRemoveAddressBookObserver() {
        System.out.println("removeAddressBookObserver");
        AddressBookObserver abo = null;
        PojoAddressBook instance = null;
        instance.removeAddressBookObserver(abo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }**/

    /**
     * Test of save method, of class PojoAddressBook.
     */
    /**@Test
    public void testSave() {
        System.out.println("save");
        PojoAddressBook instance = null;
        instance.save();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }**/
    
    /**
     * 
     * @param ab 
     */
    
}

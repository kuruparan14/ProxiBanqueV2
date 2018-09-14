package fr.gtm.proxibanquev2.tests;

import static org.junit.Assert.*;

import java.sql.Connection;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import org.junit.Ignore;
import fr.gtm.proxibanquev2.dao.ConseillerDao;
import fr.gtm.proxibanquev2.domaine.Conseiller;


/**
 * @author Lyes, Kuru, Renata
 *
 */


/**
 * @author adminl
 *
 */
public class testAuthentificationDao{
	
	

	Conseiller conseillerTest;
	ConseillerDao conseillerDaoTest;
	/**
	 * mettre en valeur zero avant et apres test
	 *
	 */	
	@Before
	public void setUpBefore() throws Exception {
		System.out.println("Debut du test");
		conseillerTest = null;
		conseillerDaoTest = null;
	}

	
	
	@After
	public void tearDownAfter() throws Exception {
		System.out.println("Test fini");
	    conseillerTest = null;
		conseillerDaoTest = null;
	}
	/**
	 *  test de login
	 *
	 */
	@Test
	public void testNotNullGetConseiller() {
		String login = "lewandowski";
		conseillerDaoTest = new ConseillerDao(null);
		System.out.println("test du Conseiller");
		assertNotNull(conseillerDaoTest.getConseillerByLogin("krychowiak"));

		
	}
	/**
	 *  test du conseiller
	 *
	 */
	@Ignore
	@Test 
	public void testEqualsGetConseillerFromLogin() {
		String login = "lewandowski";
		conseillerTest = new Conseiller(10, "lewandowski", "robert");
		System.out.println("test du Conseiller");

		
		assertEquals( conseillerTest, conseillerDaoTest.getConseillerByLogin("lewandowski"));

		
	}

}

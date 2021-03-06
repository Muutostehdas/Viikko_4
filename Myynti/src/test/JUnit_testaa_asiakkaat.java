package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import model.Asiakas;
import model.dao.Dao;

@TestMethodOrder(OrderAnnotation.class)
class JUnit_testaa_asiakkaat {

	@Test
	@Order(1)
	
	public void testPoistaKaikkiAsiakkaat() {
		//Poistetaan kaikki Asiakkaat
		Dao dao = new Dao();
		dao.poistaKaikkiAsiakkaat("nimda");
		ArrayList<Asiakas> asiakkaat = dao.listaaKaikki();
		assertEquals(0, asiakkaat.size());
	}

	@Test
	@Order(2)
	public void testLisaaAsiakas() {
		Dao dao = new Dao();
		Asiakas asiakas_1 = new Asiakas("Iines","Ankka","313-313131313","iines.ankka@ankkalinna.us",66);
		Asiakas asiakas_2 = new Asiakas("Valtteri","Bottas","900-9090909","valtteri.bottas@mercedes.de",77);
		assertEquals(true, dao.lisaaAsiakas(asiakas_1));
		assertEquals(true, dao.lisaaAsiakas(asiakas_2));
	}
	
	@Test
	@Order(3)
	public void testMuutaAsiakas() {
		Dao dao = new Dao();
		Asiakas muutettava = dao.etsiAsiakas(66);
		muutettava.setPuhelin("313-11334455");
		dao.muutaAsiakas(muutettava, 66);
		assertEquals("313-11334455", dao.etsiAsiakas(66).getPuhelin());
	}
	
}

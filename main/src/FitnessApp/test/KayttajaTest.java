package FitnessApp.test;
// Generated by ComTest BEGIN
import static org.junit.Assert.*;
import org.junit.*;
import FitnessApp.*;
// Generated by ComTest END

/**
 * Test class made by ComTest
 * @version 2022.02.26 17:43:45 // Generated by ComTest
 *
 */
@SuppressWarnings({ "all" })
public class KayttajaTest {



  // Generated by ComTest BEGIN
  /** testRekisteroi38 */
  @Test
  public void testRekisteroi38() {    // Kayttaja: 38
    Kayttaja aku1 = new Kayttaja(); 
    assertEquals("From: Kayttaja line: 40", 0, aku1.getKid()); 
    aku1.rekisteroi(); 
    Kayttaja aku2 = new Kayttaja(); 
    aku2.rekisteroi(); 
    int n1 = aku1.getKid(); 
    int n2 = aku2.getKid(); 
    assertEquals("From: Kayttaja line: 46", n2-1, n1); 
  } // Generated by ComTest END
}
package FitnessApp.test;
// Generated by ComTest BEGIN
import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.*;
import FitnessApp.*;
// Generated by ComTest END

/**
 * Test class made by ComTest
 * @version 2022.04.08 20:20:55 // Generated by ComTest
 *
 */
@SuppressWarnings({ "all" })
public class KayttajaTest {


  // Generated by ComTest BEGIN
  /** testRekisteroi70 */
  @Test
  public void testRekisteroi70() {    // Kayttaja: 70
    Kayttaja testi = new Kayttaja(); 
    testi.rekisteroi(); 
    testi.vastaaAkuAnkka(); 
    try {
    testi.tallenna(); 
    } catch (IOException e) {
    e.printStackTrace(); 
    }
    Kayttaja testi1 = new Kayttaja(); 
    testi1.rekisteroi(); 
    testi.vastaaAkuAnkka(); 
    try {
    testi1.tallenna(); 
    } catch (IOException e) {
    e.printStackTrace(); 
    }
    int n1 = testi.getKid(); 
    int n2 = testi1.getKid(); 
    assertEquals("From: Kayttaja line: 91", n2-1, n1); 
  } // Generated by ComTest END
}
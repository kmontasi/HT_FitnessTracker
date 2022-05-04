package FitnessApp.test;
// Generated by ComTest BEGIN
import static org.junit.Assert.*;
import org.junit.*;
import FitnessApp.*;
// Generated by ComTest END

/**
 * Test class made by ComTest
 * @version 2022.04.08 19:03:53 // Generated by ComTest
 *
 */
@SuppressWarnings({ "all" })
public class TreenitTest {



  // Generated by ComTest BEGIN
  /** testLisaa29 */
  @Test
  public void testLisaa29() {    // Treenit: 29
    Treenit treenit = new Treenit(); 
    Treeni eka = new Treeni(); 
    Treeni toka = new Treeni(); 
    assertEquals("From: Treenit line: 34", 0, treenit.getLkm()); 
    eka.luoTreeni(); 
    treenit.lisaa(eka); 
    assertEquals("From: Treenit line: 37", 1, treenit.getLkm()); 
    toka.luoTreeni(); 
    treenit.lisaa(toka); 
    assertEquals("From: Treenit line: 40", 2, treenit.getLkm()); 
    eka.luoTreeni(); 
    treenit.lisaa(eka); 
    assertEquals("From: Treenit line: 43", 3, treenit.getLkm()); 
    assertEquals("From: Treenit line: 44", eka, treenit.anna(0)); 
    assertEquals("From: Treenit line: 45", toka, treenit.anna(1)); 
    assertEquals("From: Treenit line: 46", eka, treenit.anna(2)); 
    assertEquals("From: Treenit line: 47", false, treenit.anna(1) == eka); 
    assertEquals("From: Treenit line: 48", true, treenit.anna(1) == toka); 
  } // Generated by ComTest END
}
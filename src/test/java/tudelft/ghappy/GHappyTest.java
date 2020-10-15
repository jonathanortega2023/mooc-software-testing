package tudelft.ghappy;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class GHappyTest {
    
    @Test
    public void single() {
        GHappy gh = new GHappy();
        assertFalse(gh.gHappy("g"));
    }
}

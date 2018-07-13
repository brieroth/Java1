
import static org.junit.Assert.*;

import org.junit.Test;

        public class Testing {

            @Test
            public void blackJackTest() {

                BlackJack blackjack = new BlackJack();
                assertEquals(21, blackjack.blackjack(18, 21));
                assertEquals(9, blackjack.blackjack(22, 9));
                assertEquals(0, blackjack.blackjack(22, 22));
            }

            @Test
            public void uniqueSumTest() {
                UniqueSum uniquesum = new UniqueSum();
                assertEquals(4, uniquesum.uniqueSum(2, 2, 4));
                assertEquals(0, uniquesum.uniqueSum(2, 2, 2));
                assertEquals(9, uniquesum.uniqueSum(4, 4, 9));
                assertEquals(0, uniquesum.uniqueSum(5, 7, 3));
            }

            @Test
            public void tooHotTest() {
                TooHot toohot = new TooHot();
                boolean isSummer = true;
                if (isSummer) {
                    assertEquals(true ,(TooHot.TooHot(75,true)));
                    assertEquals(false, (TooHot.TooHot(35, false)));
                }
            }
        }
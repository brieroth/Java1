import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class SentenceReductionTest {

    @Test
    public void spiltTest(){

        String splitTest = "I heard the pastor sing live verses easily.";

        Split split = new Split(splitTest);

        split.splitString(splitTest);

        String [] foo = split.getArray();

        for(int i = 0; i<foo.length; i ++){

            System.out.println(foo[i]);

        }

        assertEquals("I", foo[0]);
        assertEquals("heard", foo[1]);
        assertEquals("the", foo[2]);
        assertEquals("pastor", foo[3]);
        assertEquals("sing", foo[4]);
        assertEquals("live", foo[5]);
        assertEquals("verses", foo[6]);
        assertEquals("easily.", foo[7]);


    }

    @Test
    public void joinTest(){

        String splitTest = "I heard dhe pastor sing live verses easily.";

        Split split = new Split(splitTest);

        split.splitString(splitTest);

        String [] foo = split.getArray();

        split.join();

        String [] foo2 = split.getNewArray();
//
//        for(int i = 0; i<foo2.length; i ++){
//
//            System.out.println(foo2[i]);
//
//        }

        assertEquals("I", foo2[1]);
        assertEquals("heardhe", foo2[2]);
        assertEquals("pastor", foo[3]);
        assertEquals("sing", foo2[4]);
        assertEquals("live", foo2[5]);
        assertEquals("verses", foo2[6]);
        assertEquals("easily.", foo[7]);

    }

}

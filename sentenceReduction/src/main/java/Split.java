import java.util.Arrays;

public class Split {

    private String s;
    private String [] array;
    private String [] array2;

    public Split(String s) {
        this.s = s;
    }

    @Override
    public String toString() {
        return "Split{" +
                "s='" + s + '\'' +
                ", array=" + Arrays.toString(array) +
                '}';
    }

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }

    public String[] getArray() {
        return array;
    }

    public void setArray(String[] array) {
        this.array = array;
    }

    public void splitString(String string){

        this.array = string.split(" ");

    }

    public void join(){

        for (int i = 2; i<array.length; i++){

//            System.out.println(array[i-1].substring(array[i-1].length() - 1));
//            System.out.println(array[i-1].substring(0, 1));
            System.out.println(array[i-1].substring(array[i-1].length() - 1));
            System.out.println(array[i].substring(0, 1));


            if (array[i - 1].substring(array[i-1].length() - 1).contains(array[i].substring(0, 1))){

                array[i-1].replace(array[i-1].substring(array[i-1].length()-1), null);

                System.out.println("h");

                array2[i-1] = String.join("", array[i-1], array[i]);


            }
//            System.out.println("Called Join");

        }

    }

    public String[] getNewArray(){

        return array2;

    }

    public void setArray2(String[] array2) {
        this.array2 = array2;
    }
}

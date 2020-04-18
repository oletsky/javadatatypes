package javatraining.oletsky.datatypes;

public class GrossByteLoop {

    /**
     * @author Oleksiy Oletsky
     * This loop tries to iterate through the range of the byte type.
     * But something goes wrong
     * Try to find an error (or some errors) in the loop
     * @param args
     */
    public static void main(String[] args) {
        final byte START=Byte.MIN_VALUE;
        final byte END=Byte.MAX_VALUE;
        byte count=0;
        for (byte i = START; i <=END ; i++) {
            count++;
        }
        System.out.println("There were "+count+" iterations");
    }

}

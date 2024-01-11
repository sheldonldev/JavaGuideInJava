package JavaGuidInJava;

public class BasicDataType {
    public static void main(String[] args) {
        /* numbers */
        final byte min_byte = -128;
        final byte max_byte = 127;
        final byte default_byte = 0;
        System.out.println("The minimal byte is: " + min_byte);

        short base = 2;
        short exponent = 15;
        final short min_short =  (short) -Math.pow(base, exponent);
        final short max_short = (short) (Math.pow(base, exponent) - 1);
        final short default_short = (short) (Math.pow(base, exponent) - 1);

        final int min_int;
        private long d;

        /* text */
        private char e;

        /* binary */
        private boolean f;

    }
}

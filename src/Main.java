public class Main {
    public static void main(String[] args) {
        Fifo miFifo = new Fifo();

        miFifo.push(0);
        miFifo.push(1);
        miFifo.push(2);
        miFifo.push(3);
        miFifo.push(4);
        miFifo.push(5);


        System.out.println(miFifo.pop());
        System.out.println(miFifo.pop());
        System.out.println(miFifo.pop());
        System.out.println(miFifo.pop());
        System.out.println(miFifo.pop());
        System.out.println(miFifo.pop());
        System.out.println(miFifo.pop());
        System.out.println(miFifo.pop());
        System.out.println(miFifo.pop());

    }
}

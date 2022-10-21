public class transfer {
    public void eight(long num) {
        long number,out;
        int ns;
        int nsnumb;

            System.out.println(num);
            nsnumb = Integer.parseInt(String.valueOf(8));
            number = Long.parseLong(String.valueOf(num),nsnumb);
            ns = 2;
            out = Long.parseLong(Long.toString(num,ns));
            System.out.println(out);

            nsnumb = Integer.parseInt(String.valueOf(2));
            Long.parseLong(String.valueOf(out),nsnumb);
            ns = 10;
            Long.parseLong(Long.toString(out,ns));
            System.out.println(number);

            nsnumb = Integer.parseInt(String.valueOf(10));
            Long.parseLong(String.valueOf(number),nsnumb);
            ns = 16;
            System.out.println(Long.toString(number,ns));
            System.out.println();

    }

    public void sixteen(String numb) {
        System.out.println(numb);
        long num = Long.valueOf(numb,16);
        long out,out2,out3;
        int ns;
        int nsnumb;


        nsnumb = Integer.parseInt(String.valueOf(10));
        Long.parseLong(String.valueOf(num),nsnumb);
        ns = 2;
        out = Long.parseLong(Long.toString(Long.parseLong(String.valueOf(num)),ns));
        System.out.println(out);

        nsnumb = Integer.parseInt(String.valueOf(2));
        Long.parseLong(String.valueOf(out),nsnumb);
        ns = 8;
        out2 = Long.parseLong(Long.toString(num,ns));
        System.out.println(out2);

        nsnumb = Integer.parseInt(String.valueOf(8));
        out3 = Long.parseLong(String.valueOf(out2),nsnumb);
        ns = 10;

        System.out.println(Long.toString(out3,ns));
        System.out.println();
    }
}

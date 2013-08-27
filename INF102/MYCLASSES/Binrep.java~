class Binrep {
    public static String binRep(int n) {
        String binNumber = "";
        while (n != 0)
            if (n % 2 == 0){
                binNumber += 0;
                n = n / 2;
            } else if(n % 2 != 0) {
                binNumber += 1;
                n = n / 2;
            }
        // now we've got the number to binary, but in the wrong order
        String answer = new StringBuilder(binNumber).reverse().toString();
        // reversed and we're good
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(binRep(Integer.parseInt(args[0])));
    }
}


class demo {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        int sum = a + b;
        int sub = a - b;
        int mult = a * b;

        String div = (b != 0) ? String.valueOf(a / b) : "Undefined (cannot divide by zero)";

        System.out.println("Sum is = " + sum);
        System.out.println("Sub is = " + sub);
        System.out.println("Mult is = " + mult);
        System.out.println("Div is = " + div);
    }
}

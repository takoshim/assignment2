public class Main {

    public static void main(String[] args) {
        HumanGenome micky = new HumanGenome("Micky", 10000, 10000, 1000000);
        HumanGenome minnie = new HumanGenome("Minnie", 9000, 9000, 900000);
        HumanGenome goofy = new HumanGenome("Goofy", 8000, 8000, 800000);

        micky.print();
        System.out.println("\n");
        minnie.print();
        System.out.println("\n");
        goofy.print();
        System.out.println("\n");
    }



}

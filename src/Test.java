public class Test{

    public static void main (String [] args){
        Person sonny = new Person("sonny", "sonny@gmail.com","6795674531");
        Person jordan = new Person("Jordan", "Jordan@gmail.com", "6787686536");
        System.out.println(sonny.getEmail());
        System.out.println(jordan.getEmail());
        sonny.setPhone("1234567890");
        System.out.println(sonny.getPhone());
        System.out.println(jordan.getPhone());
        sonny.printGreeting(jordan);
        jordan.printGreeting(sonny);
    }

}
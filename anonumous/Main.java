package academy.olga.homework21.anonumous;

public class Main {
    public static void main(String[] args) {
        Friend myFriend = new Friend();
        Friend friend = new Friend() {
            public void sayHello() {
                System.out.println("Hello hello");
            }
        };
        friend.sayHello();
        myFriend.sayHello();
    }

}

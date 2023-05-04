public class User {
    private String name;
    private int age;

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
    public int getAvg(){
    int sum = 0;
    for (i=0;i<getAge();i++){
        sum = sum + getAge();
    }
    int avg = sum / getAge();
    return avg;
    }
}
public static public static void main(String[] args) {

        User anna = new User("Anna", 20);
        User betty = new User("Betty", 33);
        User carl = new User("Carl", 58);
        User david = new User("David", 13);
        User eva = new User("Eva", 18);
        User frankie = new User("Frankie", 45);
        User[] users = {anna, betty, carl, david, eva, frankie};
        int avg = eva.getAvg();
        System.out.println(avg);
}

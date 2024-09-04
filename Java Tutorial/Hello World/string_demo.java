public class string_demo {
    public static void main(String[] args) {
        String name = "Vishal";
        String name2 = new String("Vishal2");
        System.out.println(name);
        System.out.println(name2);
        System.out.println(name2.hashCode());
        System.out.println("Hello " + name + " " + name2);
        System.out.println(name.charAt(2));
        System.out.println(name.concat(" King"));
        System.out.println(name.length());

        String s1 = "One";
        String s2 = "One";
        System.out.println(s1 == s2);
    }
}

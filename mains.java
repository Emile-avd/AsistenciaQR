public class mains {
    public static void main(String[] args){
        usuario user1 = new usuario("Juan", "Admin");
        user1.getNombre();
        System.out.println(user1.getNombre());
        user1.getRol();
        System.out.println(user1.getRol());

    }
}

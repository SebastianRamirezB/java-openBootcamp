package interfaces;

public class Main {

    public static void main(String[] args) {

        CocheCRUD cocheCRUD = new CocheCRUDImpl();

        System.out.println(cocheCRUD.save("Save"));
        System.out.println(cocheCRUD.findAll("FindAll"));
        System.out.println(cocheCRUD.delete("Delete"));

    }



}

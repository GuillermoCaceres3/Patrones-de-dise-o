public class Main {
    public static void main(String[] args) {

        File file1 = new File("Main.java",2,"Main de java");
        File file2 = new File("Image.jpg",1,"Imagen de mi perro");

        Folder folder1 = new Folder("Random");
        folder1.addComponent(file1);
        folder1.addComponent(file2);

        Folder folder2 = new Folder("Mas random");
        folder2.addComponent(folder1);

        folder2.getName();
        folder2.getSize();
        folder2.dumpContents();

    }
}
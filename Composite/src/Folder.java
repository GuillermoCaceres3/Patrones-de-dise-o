import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Folder implements FileSystemComponent{
    private String name;
    private List<FileSystemComponent> children;

    public Folder(String name) {
        this.name = name;
        this.children = new ArrayList<>();
    }

    public void addComponent(FileSystemComponent component){
        if (!searchComponent(component.getName())){
            children.add(component);
        }
    }

    public void removeComponent(FileSystemComponent component){
        if (!searchComponent(component.getName())){
            children.remove(component);
        }
    }

    public boolean searchComponent(String name){
        Iterator<FileSystemComponent> iter = children.iterator();
        boolean ans = false;
        while(iter.hasNext()){
            if(iter.next().getName().equals(name)){
                ans = true;
                break;
            }
        }
        return ans;
    }

    private FileSystemComponent getComponent(String name){
        Iterator<FileSystemComponent> iter = children.iterator();
        FileSystemComponent ans = null;
        while(iter.hasNext()){
            ans = iter.next();
            if(ans.getName().equals(name)){
                break;
            }
        }
        return ans;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        Iterator<FileSystemComponent> iter = children.iterator();
        int acum = 0;
        while(iter.hasNext()){
            acum += iter.next().getSize();
        }

        return acum;
    }

    @Override
    public void dumpContents() {
        Iterator<FileSystemComponent> iter = children.iterator();
        System.out.println("Soy "+name+" y mi contenido compuesto es:");
        while(iter.hasNext()){
            iter.next().dumpContents();
        }
    }

}

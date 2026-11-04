package filesystemvariant1.filevariants;

public class File {
    private String name;
    private long size;
    private FileType filetType;

    public File(String name, long size, FileType filetType) {
        this.name = name;
        this.size = size;
        this.filetType = filetType;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "File{" +
                "name='" + name + '\'' +
                ", size=" + size +
                ", filetType=" + filetType.name() +
                '}';
    }
}

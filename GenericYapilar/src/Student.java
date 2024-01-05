public class Student <T> implements IDataBase <T>{
    @Override
    public boolean insert(T data) {
        System.out.println(data + " Veri eklendi");
        return true;
    }

    @Override
    public boolean delete(T data) {
        System.out.println(data + " Veri Silindi");
        return true;
    }

    @Override
    public boolean update(T data) {
        System.out.println(data + " Veri Güncellendi");
        return true;
    }

    @Override
    public T select() {
        System.out.println(" Veri Çekildi");
        return null;
    }
}

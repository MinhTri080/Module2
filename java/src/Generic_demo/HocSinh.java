package Generic_demo;

import java.util.Objects;

public class HocSinh {
    private  int id;

    public HocSinh(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof HocSinh)) return false;
        HocSinh hocSinh = (HocSinh) o;
        return id == hocSinh.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "HocSinh{" +
                "id=" + id +
                '}';

    }
}

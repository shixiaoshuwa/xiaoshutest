package main.java.com.dapi.visibility;

/**
 * 可见性
 *
 * @auther Seb's
 * @date 2022/09/02 09:44
 */
public class Base {
    private Integer id;
    protected String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

package ubdynamics.bookapp.view;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean(name = "backingIndex1")
@ViewScoped
public class BackingIndex1 implements Serializable {

    private Integer index; 
    private String student; 
    private String[] students = new String[] {"Bayar", "Bat", "Tseveen"}; 

    public String call() { 

        student = students[index]; 
        return null; 
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    public Integer getIndex() {
        return index;
    }

    public String getStudent() {
        return student;
    }
}

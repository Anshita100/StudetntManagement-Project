package Model;

public class Student {
    private int rno,phy,chem,maths;
    private String name;

    public int getRno() {
        return rno;
    }

    public void setRno(int rno) {
        this.rno = rno;
    }

    public int getPhy() {
        return phy;
    }

    public void setPhy(int phy) {
        this.phy = phy;
    }

    public int getChem() {
        return chem;
    }

    @Override
    public String toString() {
        return "Student{" + "rno=" + rno + ", phy=" + phy + ", chem=" + chem + ", maths=" + maths + ", name=" + name + '}';
    }

    public void setChem(int chem) {
        this.chem = chem;
    }

    public int getMaths() {
        return maths;
    }

    public void setMaths(int maths) {
        this.maths = maths;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    
}

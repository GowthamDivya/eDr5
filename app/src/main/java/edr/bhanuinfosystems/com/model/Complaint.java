package edr.bhanuinfosystems.com.model;

public class Complaint {
    private int cid;
    private String cname;

    public Complaint(int cid, String cname) {
        this.cid = cid;
        this.cname = cname;
    }

    public int getCid() {
        return cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }
}

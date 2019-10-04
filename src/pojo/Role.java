package pojo;

class Role {

    private int RM_Role_ID;
    private String RM_Role_Name;

    public Role(int RM_Role_ID, String RM_Role_Name) {
        this.RM_Role_ID = RM_Role_ID;
        this.RM_Role_Name = RM_Role_Name;
    }

    public int getRM_Role_ID() {
        return RM_Role_ID;
    }

    public void setRM_Role_ID(int RM_Role_ID) {
        this.RM_Role_ID = RM_Role_ID;
    }

    public String getRM_Role_Name() {
        return RM_Role_Name;
    }

    public void setRM_Role_Name(String RM_Role_Name) {
        this.RM_Role_Name = RM_Role_Name;
    }
}

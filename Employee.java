public class Employee {
    private long id;
    private String email;
    private Profile profile;
    private Enum_RoleName role;
    private Enterprise enterprise;
    private Transaction[] transaction;
    private date updatedAt;
    private  date createAt;

    public Employee(long id, String email, Profile profile, Enum_RoleName role, Enterprise enterprise, Transaction[] transaction, date updatedAt, date createAt) {
        this.id = id;
        this.email = email;
        this.profile = profile;
        this.role = role;
        this.enterprise = enterprise;
        this.transaction = transaction;
        this.updatedAt = updatedAt;
        this.createAt = createAt;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    public Enum_RoleName getRole() {
        return role;
    }

    public void setRole(Enum_RoleName role) {
        this.role = role;
    }

    public Enterprise getEnterprise() {
        return enterprise;
    }

    public void setEnterprise(Enterprise enterprise) {
        this.enterprise = enterprise;
    }

    public Transaction[] getTransaction() {
        return transaction;
    }

    public void setTransaction(Transaction[] transaction) {
        this.transaction = transaction;
    }

    public date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(date createAt) {
        this.createAt = createAt;
    }
}

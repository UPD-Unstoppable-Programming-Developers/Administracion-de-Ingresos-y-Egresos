Public class Enterprise {
    private long id;
    private String name;
    private String document;
    private String phone;
    private String address;
    private User users;
    private Transaction[] transaction;
    private  date createAt;
    private date updatedAt;

    public Enterprise(long id, String name, String document, String phone, String address, User users, Transaction[] transaction, date createAt, date updatedAt) {
        this.id = id;
        this.name = name;
        this.document = document;
        this.phone = phone;
        this.address = address;
        this.users = users;
        this.transaction = transaction;
        this.createAt = createAt;
        this.updatedAt = updatedAt;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public User getUsers() {
        return users;
    }

    public void setUsers(User users) {
        this.users = users;
    }

    public Transaction[] getTransaction() {
        return transaction;
    }

    public void setTransaction(Transaction[] transaction) {
        this.transaction = transaction;
    }

    public date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(date createAt) {
        this.createAt = createAt;
    }

    public date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(date updatedAt) {
        this.updatedAt = updatedAt;
    }
}

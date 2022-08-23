public class Profile {
    private String id;
    private String image;
    private String phone;
    private User user;
    private date createdAt;
    private date updatedAt;

    public Profile(String id, String image, String phone, User user, date createdAt, date updatedAt) {
        this.id = id;
        this.image = image;
        this.phone = phone;
        this.user = user;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(date createdAt) {
        this.createdAt = createdAt;
    }

    public date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(date updatedAt) {
        this.updatedAt = updatedAt;
    }
}

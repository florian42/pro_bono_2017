package RauAPI.model;

/**
 * Created by flo on 22.04.17.
 */
public class Project {
    private int id;
    private String title;
    private String description;
    private String link;
    private int type;
    private int user;

    public Project(int id, String title, String description, String link, int type, int user) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.link = link;
        this.type = type;
        this.user = user;
    }

    public Project() {
    }

    @Override
    public String toString() {
        return "Project{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", link='" + link + '\'' +
                ", type=" + type +
                ", user=" + user +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Project project = (Project) o;

        if (id != project.id) return false;
        if (type != project.type) return false;
        if (user != project.user) return false;
        if (!title.equals(project.title)) return false;
        if (!description.equals(project.description)) return false;
        return link.equals(project.link);
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + title.hashCode();
        result = 31 * result + description.hashCode();
        result = 31 * result + link.hashCode();
        result = 31 * result + type;
        result = 31 * result + user;
        return result;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getUser() {
        return user;
    }

    public void setUser(int user) {
        this.user = user;
    }
}

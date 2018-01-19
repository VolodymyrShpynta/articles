package org.programming.mitra;

import javax.persistence.*;

@Entity
@EntityListeners(FileEntityListener.class)
class File extends Auditable<String> {
    @Id
    @SequenceGenerator(name = "ID_GENERATOR", sequenceName = "test_auditing.ID_SEQ")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ID_GENERATOR")
    private Integer id;
    private String name;
    private String content;

    public File() {
        super();
    }

    public File(String name, String content) {
        this.name = name;
        this.content = content;
    }

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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "File{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}

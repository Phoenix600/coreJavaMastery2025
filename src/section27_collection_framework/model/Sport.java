package section27_collection_framework.model;

import java.util.UUID;

public class Sport {
    private UUID id;
    private String name;
    private Integer duration;
    private Integer numberOfPlayers;

    public Sport() {
    }

    public Sport(UUID id, String name, Integer duration, Integer numberOfPlayers) {
        this.id = id;
        this.name = name;
        this.duration = duration;
        this.numberOfPlayers = numberOfPlayers;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public Integer getNumberOfPlayers() {
        return numberOfPlayers;
    }

    public void setNumberOfPlayers(Integer numberOfPlayers) {
        this.numberOfPlayers = numberOfPlayers;
    }

    @Override
    public String toString() {
        return "Sport{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", duration=" + duration +
                ", numberOfPlayers=" + numberOfPlayers +
                '}';
    }
}

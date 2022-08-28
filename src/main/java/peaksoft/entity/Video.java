package peaksoft.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

import static javax.persistence.CascadeType.*;
import static javax.persistence.CascadeType.MERGE;

@Entity
@Table(name = "videos")
@Getter @Setter
@NoArgsConstructor
public class Video {
    @Id
    @SequenceGenerator(name = "video_gen",
    sequenceName = "video_seq",
    allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String videoName;
    private String link;

    public Video(String videoName, String link) {
        this.videoName = videoName;
        this.link = link;
    }

    @OneToOne(cascade = {DETACH, REFRESH, PERSIST, MERGE})
    private Lesson lesson;
}

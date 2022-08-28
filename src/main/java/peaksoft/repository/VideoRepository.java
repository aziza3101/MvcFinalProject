package peaksoft.repository;

import org.springframework.stereotype.Repository;
import peaksoft.entity.Video;

import java.util.List;
@Repository
public interface VideoRepository {
    void saveVideo(Video video);

    List<Video> getAllVideos();

    Video getVideoById(Long id);

    void deleteVideoById(Long id);

    void updateVideo(Video video);
}

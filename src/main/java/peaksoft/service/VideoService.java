package peaksoft.service;

import org.springframework.stereotype.Service;
import peaksoft.entity.Video;

import java.util.List;
@Service
public interface VideoService {
    void saveVideo(Video video);

    List<Video> getAllVideos();
    Video getVideoById(Long id);

    void updateVideo(Long id, Video video);

    void deleteVideoById(Long id);

}

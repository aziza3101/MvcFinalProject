package peaksoft.service.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import peaksoft.entity.Video;
import peaksoft.repository.VideoRepository;
import peaksoft.service.VideoService;


import javax.transaction.Transactional;
import java.util.List;
@Service
@Transactional
public class VideoServiceImpl implements VideoService {
    private final VideoRepository videoRepository;
    @Autowired

    public VideoServiceImpl(VideoRepository videoRepository) {
        this.videoRepository = videoRepository;
    }
    @Override
    public void saveVideo(Video video) {
        videoRepository.saveVideo(video);
    }
    @Override
    public List<Video> getAllVideos() {
        return videoRepository.getAllVideos();
    }
    @Override
    public Video getVideoById(Long id) {
        return videoRepository.getVideoById(id);
    }
    @Override
    public void deleteVideoById(Long id) {
        videoRepository.deleteVideoById(id);
    }
    @Override
    public void updateVideo(Long id, Video video) {
        videoRepository.updateVideo(video);
    }
}

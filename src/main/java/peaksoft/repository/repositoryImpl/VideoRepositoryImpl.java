package peaksoft.repository.repositoryImpl;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import peaksoft.entity.Video;
import peaksoft.repository.VideoRepository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;
@Repository
@Transactional
//@EnableTransactionManagement
public class VideoRepositoryImpl implements VideoRepository {
    @PersistenceContext
    private  EntityManager entityManager;
    @Override
    public void saveVideo(Video video) {
        entityManager.persist(video);
    }
    @Override
    public List<Video> getAllVideos() {
        return entityManager.createQuery("SELECT v FROM Video v", Video.class).getResultList();
    }
    @Override
    public Video getVideoById(Long id) {
        return entityManager.find(Video.class,id);
    }
    @Override
    public void deleteVideoById(Long id) {
        entityManager.remove(entityManager.find(Video.class,id));
    }
    @Override
    public void updateVideo(Video video) {
        entityManager.merge(video);
    }
}

package xyz.game.function.image;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import xyz.game.dao.ImageDao;

import java.util.List;

@Service
public class ImageServiceImpl  extends ServiceImpl<ImageDao, Image> implements ImageService {
    private final ImageDao imageDao;

    public ImageServiceImpl(ImageDao imageDao) {
        this.imageDao = imageDao;
    }

    @Override
    public List<Image> getImageList() {
        return imageDao.selectList(new QueryWrapper<Image>());
    }

    @Override
    public Image getImageByURI(String uri) {
        return imageDao.selectOne(new QueryWrapper<Image>().eq("uri", uri));
    }

    @Override
    public void updateImage(Image image) {
        imageDao.insertOrUpdate(image);
    }
}

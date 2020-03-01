package cn.Ideal.demo.service;

import cn.Ideal.demo.entity.Tags;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author wwwwy
 * @since 2020-02-11
 */
public interface ITagsService extends IService<Tags> {
	int useTag(String tags);
}

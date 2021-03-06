package cn.Ideal.demo.service.impl;

import cn.Ideal.demo.entity.Statistic;
import cn.Ideal.demo.mapper.StatisticMapper;
import cn.Ideal.demo.service.IStatisticService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author wwwwy
 * @since 2020-04-22
 */
@Service
public class StatisticServiceImpl extends ServiceImpl<StatisticMapper, Statistic> implements IStatisticService {

	@Override
	public Integer lastWeekCountByUserId(String userId) {
		Integer res =  baseMapper.lastWeekCountByUserId(userId);
		return res==null?0:res;
	}

	@Override
	public Integer lastWeekCountByTagsId(Integer tagsId) {
		Integer res =  baseMapper.lastWeekCountByTagsId(tagsId);
		return res==null?0:res;
	}

	@Override
	public List<Statistic> lastWeekCountUserTop() {
		return baseMapper.lastWeekCountUserTop();
	}
}

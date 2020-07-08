package com.qingcheng.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.qingcheng.common.PageResult;
import com.qingcheng.mapper.CitiesMapper;
import com.qingcheng.pojo.Cities;
import com.qingcheng.service.CitiesService;

import tk.mybatis.mapper.entity.Example;

@Service
public class CitiesServiceImpl implements CitiesService {

	@Autowired
	private CitiesMapper citiesMapper;

	/**
	 * 返回全部记录
	 * 
	 * @return
	 */
	@Override
	public List<Cities> findAll() {
		return citiesMapper.selectAll();
	}

	/**
	 * 分页查询
	 * 
	 * @param page 页码
	 * @param size 每页记录数
	 * @return 分页结果
	 */
	@Override
	public PageResult<Cities> findPage(int page, int size) {
		PageHelper.startPage(page, size);
		Page<Cities> citiess = (Page<Cities>) citiesMapper.selectAll();
		return new PageResult<Cities>(citiess.getTotal(), citiess.getResult());
	}

	/**
	 * 条件查询
	 * 
	 * @param searchMap 查询条件
	 * @return
	 */
	@Override
	public List<Cities> findList(Map<String, Object> searchMap) {
		Example example = createExample(searchMap);
		return citiesMapper.selectByExample(example);
	}

	/**
	 * 分页+条件查询
	 * 
	 * @param searchMap
	 * @param page
	 * @param size
	 * @return
	 */
	@Override
	public PageResult<Cities> findPage(Map<String, Object> searchMap, int page, int size) {
		PageHelper.startPage(page, size);
		Example example = createExample(searchMap);
		Page<Cities> citiess = (Page<Cities>) citiesMapper.selectByExample(example);
		return new PageResult<Cities>(citiess.getTotal(), citiess.getResult());
	}

	/**
	 * 根据Id查询
	 * 
	 * @param cityid
	 * @return
	 */
	@Override
	public Cities findById(String cityid) {
		return citiesMapper.selectByPrimaryKey(cityid);
	}

	/**
	 * 新增
	 * 
	 * @param cities
	 */
	@Override
	public void add(Cities cities) {
		citiesMapper.insert(cities);
	}

	/**
	 * 修改
	 * 
	 * @param cities
	 */
	@Override
	public void update(Cities cities) {
		citiesMapper.updateByPrimaryKeySelective(cities);
	}

	/**
	 * 删除
	 * 
	 * @param cityid
	 */
	@Override
	public void delete(String cityid) {
		citiesMapper.deleteByPrimaryKey(cityid);
	}

	/**
	 * 构建查询条件
	 * 
	 * @param searchMap
	 * @return
	 */
	private Example createExample(Map<String, Object> searchMap) {
		Example example = new Example(Cities.class);
		Example.Criteria criteria = example.createCriteria();
		if (searchMap != null) {
			// 城市ID
			if (searchMap.get("cityid") != null && !"".equals(searchMap.get("cityid"))) {
				criteria.andLike("cityid", "%" + searchMap.get("cityid") + "%");
			}
			// 城市名称
			if (searchMap.get("city") != null && !"".equals(searchMap.get("city"))) {
				criteria.andLike("city", "%" + searchMap.get("city") + "%");
			}
			// 省份ID
			if (searchMap.get("provinceid") != null && !"".equals(searchMap.get("provinceid"))) {
				criteria.andLike("provinceid", "%" + searchMap.get("provinceid") + "%");
			}

		}
		return example;
	}

}

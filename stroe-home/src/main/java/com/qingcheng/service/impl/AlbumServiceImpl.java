package com.qingcheng.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.qingcheng.common.PageResult;
import com.qingcheng.mapper.AlbumMapper;
import com.qingcheng.pojo.Album;
import com.qingcheng.service.AlbumService;

import tk.mybatis.mapper.entity.Example;

@Service
public class AlbumServiceImpl implements AlbumService {

	@Autowired
	private AlbumMapper albumMapper;

	/**
	 * 返回全部记录
	 * 
	 * @return
	 */
	@Override
	public List<Album> findAll() {
		return albumMapper.selectAll();
	}

	/**
	 * 分页查询
	 * 
	 * @param page 页码
	 * @param size 每页记录数
	 * @return 分页结果
	 */
	@Override
	public PageResult<Album> findPage(int page, int size) {
		PageHelper.startPage(page, size);
		Page<Album> albums = (Page<Album>) albumMapper.selectAll();
		return new PageResult<Album>(albums.getTotal(), albums.getResult());
	}

	/**
	 * 条件查询
	 * 
	 * @param searchMap 查询条件
	 * @return
	 */
	@Override
	public List<Album> findList(Map<String, Object> searchMap) {
		Example example = createExample(searchMap);
		return albumMapper.selectByExample(example);
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
	public PageResult<Album> findPage(Map<String, Object> searchMap, int page, int size) {
		PageHelper.startPage(page, size);
		Example example = createExample(searchMap);
		Page<Album> albums = (Page<Album>) albumMapper.selectByExample(example);
		return new PageResult<Album>(albums.getTotal(), albums.getResult());
	}

	/**
	 * 根据Id查询
	 * 
	 * @param id
	 * @return
	 */
	@Override
	public Album findById(Long id) {
		return albumMapper.selectByPrimaryKey(id);
	}

	/**
	 * 新增
	 * 
	 * @param album
	 */
	@Override
	public void add(Album album) {
		albumMapper.insert(album);
	}

	/**
	 * 修改
	 * 
	 * @param album
	 */
	@Override
	public void update(Album album) {
		albumMapper.updateByPrimaryKeySelective(album);
	}

	/**
	 * 删除
	 * 
	 * @param id
	 */
	@Override
	public void delete(Long id) {
		albumMapper.deleteByPrimaryKey(id);
	}

	/**
	 * 构建查询条件
	 * 
	 * @param searchMap
	 * @return
	 */
	private Example createExample(Map<String, Object> searchMap) {
		Example example = new Example(Album.class);
		Example.Criteria criteria = example.createCriteria();
		if (searchMap != null) {
			// 相册名称
			if (searchMap.get("title") != null && !"".equals(searchMap.get("title"))) {
				criteria.andLike("title", "%" + searchMap.get("title") + "%");
			}
			// 相册封面
			if (searchMap.get("image") != null && !"".equals(searchMap.get("image"))) {
				criteria.andLike("image", "%" + searchMap.get("image") + "%");
			}
			// 图片列表
			if (searchMap.get("imageItems") != null && !"".equals(searchMap.get("imageItems"))) {
				criteria.andLike("imageItems", "%" + searchMap.get("imageItems") + "%");
			}

		}
		return example;
	}

}

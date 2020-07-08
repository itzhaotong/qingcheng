package com.qingcheng.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.qingcheng.common.PageResult;
import com.qingcheng.mapper.RoleMapper;
import com.qingcheng.pojo.Role;
import com.qingcheng.service.RoleService;

import tk.mybatis.mapper.entity.Example;

@Service
public class RoleServiceImpl implements RoleService {

	@Autowired
	private RoleMapper roleMapper;

	/**
	 * 返回全部记录
	 * 
	 * @return
	 */
	@Override
	public List<Role> findAll() {
		return roleMapper.selectAll();
	}

	/**
	 * 分页查询
	 * 
	 * @param page 页码
	 * @param size 每页记录数
	 * @return 分页结果
	 */
	@Override
	public PageResult<Role> findPage(int page, int size) {
		PageHelper.startPage(page, size);
		Page<Role> roles = (Page<Role>) roleMapper.selectAll();
		return new PageResult<Role>(roles.getTotal(), roles.getResult());
	}

	/**
	 * 条件查询
	 * 
	 * @param searchMap 查询条件
	 * @return
	 */
	@Override
	public List<Role> findList(Map<String, Object> searchMap) {
		Example example = createExample(searchMap);
		return roleMapper.selectByExample(example);
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
	public PageResult<Role> findPage(Map<String, Object> searchMap, int page, int size) {
		PageHelper.startPage(page, size);
		Example example = createExample(searchMap);
		Page<Role> roles = (Page<Role>) roleMapper.selectByExample(example);
		return new PageResult<Role>(roles.getTotal(), roles.getResult());
	}

	/**
	 * 根据Id查询
	 * 
	 * @param id
	 * @return
	 */
	@Override
	public Role findById(Integer id) {
		return roleMapper.selectByPrimaryKey(id);
	}

	/**
	 * 新增
	 * 
	 * @param role
	 */
	@Override
	public void add(Role role) {
		roleMapper.insert(role);
	}

	/**
	 * 修改
	 * 
	 * @param role
	 */
	@Override
	public void update(Role role) {
		roleMapper.updateByPrimaryKeySelective(role);
	}

	/**
	 * 删除
	 * 
	 * @param id
	 */
	@Override
	public void delete(Integer id) {
		roleMapper.deleteByPrimaryKey(id);
	}

	/**
	 * 构建查询条件
	 * 
	 * @param searchMap
	 * @return
	 */
	private Example createExample(Map<String, Object> searchMap) {
		Example example = new Example(Role.class);
		Example.Criteria criteria = example.createCriteria();
		if (searchMap != null) {
			// 角色名称
			if (searchMap.get("name") != null && !"".equals(searchMap.get("name"))) {
				criteria.andLike("name", "%" + searchMap.get("name") + "%");
			}

			// ID
			if (searchMap.get("id") != null) {
				criteria.andEqualTo("id", searchMap.get("id"));
			}

		}
		return example;
	}

}

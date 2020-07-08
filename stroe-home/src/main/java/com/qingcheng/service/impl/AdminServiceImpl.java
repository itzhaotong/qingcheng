package com.qingcheng.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.qingcheng.common.PageResult;
import com.qingcheng.mapper.AdminMapper;
import com.qingcheng.pojo.Admin;
import com.qingcheng.service.AdminService;

import tk.mybatis.mapper.entity.Example;

@Service
public class AdminServiceImpl implements AdminService {

	@Autowired
	private AdminMapper adminMapper;

	/**
	 * 返回全部记录
	 * 
	 * @return
	 */
	@Override
	public List<Admin> findAll() {
		return adminMapper.selectAll();
	}

	/**
	 * 分页查询
	 * 
	 * @param page 页码
	 * @param size 每页记录数
	 * @return 分页结果
	 */
	@Override
	public PageResult<Admin> findPage(int page, int size) {
		PageHelper.startPage(page, size);
		Page<Admin> admins = (Page<Admin>) adminMapper.selectAll();
		return new PageResult<Admin>(admins.getTotal(), admins.getResult());
	}

	/**
	 * 条件查询
	 * 
	 * @param searchMap 查询条件
	 * @return
	 */
	@Override
	public List<Admin> findList(Map<String, Object> searchMap) {
		Example example = createExample(searchMap);
		return adminMapper.selectByExample(example);
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
	public PageResult<Admin> findPage(Map<String, Object> searchMap, int page, int size) {
		PageHelper.startPage(page, size);
		Example example = createExample(searchMap);
		Page<Admin> admins = (Page<Admin>) adminMapper.selectByExample(example);
		return new PageResult<Admin>(admins.getTotal(), admins.getResult());
	}

	/**
	 * 根据Id查询
	 * 
	 * @param id
	 * @return
	 */
	@Override
	public Admin findById(Integer id) {
		return adminMapper.selectByPrimaryKey(id);
	}

	/**
	 * 新增
	 * 
	 * @param admin
	 */
	@Override
	public void add(Admin admin) {
		adminMapper.insert(admin);
	}

	/**
	 * 修改
	 * 
	 * @param admin
	 */
	@Override
	public void update(Admin admin) {
		adminMapper.updateByPrimaryKeySelective(admin);
	}

	/**
	 * 删除
	 * 
	 * @param id
	 */
	@Override
	public void delete(Integer id) {
		adminMapper.deleteByPrimaryKey(id);
	}

	/**
	 * 构建查询条件
	 * 
	 * @param searchMap
	 * @return
	 */
	private Example createExample(Map<String, Object> searchMap) {
		Example example = new Example(Admin.class);
		Example.Criteria criteria = example.createCriteria();
		if (searchMap != null) {
			// 用户名
			if (searchMap.get("loginName") != null && !"".equals(searchMap.get("loginName"))) {
				criteria.andLike("loginName", "%" + searchMap.get("loginName") + "%");
			}
			// 密码
			if (searchMap.get("password") != null && !"".equals(searchMap.get("password"))) {
				criteria.andLike("password", "%" + searchMap.get("password") + "%");
			}
			// 状态
			if (searchMap.get("status") != null && !"".equals(searchMap.get("status"))) {
				criteria.andLike("status", "%" + searchMap.get("status") + "%");
			}

			// id
			if (searchMap.get("id") != null) {
				criteria.andEqualTo("id", searchMap.get("id"));
			}

		}
		return example;
	}

}

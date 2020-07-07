package com.qingcheng.mapper;

import com.qingcheng.pojo.Album;

public interface AlbumMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Album record);

    int insertSelective(Album record);

    Album selecyPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Album record);

    int updateByPrimaryKeyWithBLOBs(Album record);

    int updateByPrimaryKey(Album record);
}
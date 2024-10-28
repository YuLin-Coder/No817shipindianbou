package com.dao;

import com.entity.ShipinxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShipinxinxiVO;
import com.entity.view.ShipinxinxiView;


/**
 * 视频信息
 * 
 * @author 
 * @email 
 * @date 2021-02-22 15:48:18
 */
public interface ShipinxinxiDao extends BaseMapper<ShipinxinxiEntity> {
	
	List<ShipinxinxiVO> selectListVO(@Param("ew") Wrapper<ShipinxinxiEntity> wrapper);
	
	ShipinxinxiVO selectVO(@Param("ew") Wrapper<ShipinxinxiEntity> wrapper);
	
	List<ShipinxinxiView> selectListView(@Param("ew") Wrapper<ShipinxinxiEntity> wrapper);

	List<ShipinxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<ShipinxinxiEntity> wrapper);
	
	ShipinxinxiView selectView(@Param("ew") Wrapper<ShipinxinxiEntity> wrapper);
	
}

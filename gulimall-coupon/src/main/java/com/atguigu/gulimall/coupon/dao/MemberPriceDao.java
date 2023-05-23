package com.atguigu.gulimall.coupon.dao;

import com.atguigu.gulimall.coupon.entity.MemberPriceEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品会员价格
 *
 * @author mbt
 * @email mbt@gmail.com
 * @date 2023-05-23 19:13:50
 */
@Mapper
public interface MemberPriceDao extends BaseMapper<MemberPriceEntity> {

}

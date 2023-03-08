package com.hmdp.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hmdp.entity.ShopType;
import com.hmdp.mapper.ShopTypeMapper;
import com.hmdp.service.IShopTypeService;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 虎哥
 * @since 2021-12-22
 */
@Service
public class ShopTypeServiceImpl extends ServiceImpl<ShopTypeMapper, ShopType> implements IShopTypeService {

    @Resource
    private StringRedisTemplate stringRedisTemplate;

    @Override
    public List<ShopType> queryList() {
        // 1. 判断redis缓存里是否存在
//        stringRedisTemplate.opsForList().range(CACHE_SHOP_TYPE_KEY)
        // 2. 存在，直接返回
        // 3. 不存在，查询数据库
        // 4. 数据加入redis


        List<ShopType> typeList = query().orderByAsc("sort").list();
        return typeList;
    }
}

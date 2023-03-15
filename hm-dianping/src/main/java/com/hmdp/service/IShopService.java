package com.hmdp.service;

import com.hmdp.dto.Result;
import com.hmdp.entity.Shop;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Yang Hengcan
 * @since 2023-2-22
 */
public interface IShopService extends IService<Shop> {

    Object queryById(Long id);

    Result update(Shop shop);
}

package com.hmdp.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hmdp.entity.ShopType;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Yang Hengcan
 * @since 2023-2-22
 */
public interface IShopTypeService extends IService<ShopType> {

    List<ShopType> queryList();
}

package com.we.shopservice.service.impl;

import com.we.shopservice.mapper.DetailsMapper;
import com.we.shopservice.service.IDetailsService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import entity.Details;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author wRan
 * @since 2022-05-22 12:39:17
 */
@Service
public class DetailsServiceImpl extends ServiceImpl<DetailsMapper, Details> implements IDetailsService {

}

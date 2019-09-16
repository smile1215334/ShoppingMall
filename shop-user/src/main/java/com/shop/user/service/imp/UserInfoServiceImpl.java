package com.shop.user.service.imp;

import com.shop.user.bean.UserInfo;
import com.shop.user.mapper.UserInfoMapper;
import com.shop.user.service.UserInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author smile
 * @since 2019-09-16
 */
@Service
public class UserInfoServiceImpl extends ServiceImpl<UserInfoMapper, UserInfo> implements UserInfoService {

}

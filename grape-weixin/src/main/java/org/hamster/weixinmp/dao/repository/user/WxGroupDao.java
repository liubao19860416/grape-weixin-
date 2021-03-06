package org.hamster.weixinmp.dao.repository.user;

import org.hamster.weixinmp.dao.entity.user.WxGroupEntity;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

/**
 * 
 * @author Liubao
 * @2015年7月9日
 * 
 */
@Repository
public interface WxGroupDao extends
        PagingAndSortingRepository<WxGroupEntity, Long> {
}

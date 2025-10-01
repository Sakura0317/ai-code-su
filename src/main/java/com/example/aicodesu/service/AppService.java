package com.example.aicodesu.service;

import com.example.aicodesu.model.dto.app.AppQueryRequest;
import com.example.aicodesu.model.vo.AppVO;
import com.mybatisflex.core.query.QueryWrapper;
import com.mybatisflex.core.service.IService;
import com.example.aicodesu.model.entity.App;

import java.util.List;

/**
 * 应用 服务层。
 *
 * @author <a su</a>
 */
public interface AppService extends IService<App> {
    /**
     * 获取应用封装类
     *
     * @param app
     * @return
     */
    AppVO getAppVO(App app);

    /**
     * 获取应用封装类列表
     *
     * @param appList
     * @return
     */
    List<AppVO> getAppVOList(List<App> appList);

    /**
     * 构造应用查询条件
     *
     * @param appQueryRequest
     * @return
     */
    QueryWrapper getQueryWrapper(AppQueryRequest appQueryRequest);

}

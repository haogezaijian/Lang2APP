package com.haoge.lang2app.service;

import com.haoge.lang2app.model.dto.app.AppAddRequest;
import com.haoge.lang2app.model.dto.app.AppQueryRequest;
import com.haoge.lang2app.model.entity.User;
import com.haoge.lang2app.model.vo.app.AppVO;
import com.mybatisflex.core.query.QueryWrapper;
import com.mybatisflex.core.service.IService;
import com.haoge.lang2app.model.entity.App;
import reactor.core.publisher.Flux;

import java.util.List;

/**
 * 应用 服务层。
 *
 * @author haoge
 */
public interface AppService extends IService<App> {

    Long createApp(AppAddRequest appAddRequest, User loginUser);

    AppVO getAppVO(App app);

    QueryWrapper getQueryWrapper(AppQueryRequest appQueryRequest);

    List<AppVO> getAppVOList(List<App> appList);

    Flux<String> chatToGenCode(Long appId, String message, User loginUser);

    String deployApp(Long appId, User loginUser);

    void generateAppScreenshotAsync(Long appId, String appUrl);
}

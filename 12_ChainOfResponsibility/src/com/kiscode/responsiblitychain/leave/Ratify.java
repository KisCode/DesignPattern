package com.kiscode.responsiblitychain.leave;

/**
 * Description: 抽象处理者角色（Hnadler）
 * Author: keno
 * Date : 2021/5/26 11:22
 **/
public interface Ratify {
    //处理请求
    Result deal(Chain chain);
}

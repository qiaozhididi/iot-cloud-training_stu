# 《物联网云平台设计与开发》实训---云平台端

<p style="text-align: center">最近一次更新：2023年4月18日</p>

## 介绍

iot-cloud云平台端---项目代码

项目文档：https://heis.gitee.io/docs/iot-cloud-training/iot-cloud-training-03/

<ol>
<li>实验3.1 - 构建物联网云平台项目(iot-cloud-training-init)</li>
<li>实验3.2 - 完成物联网云平台新增设备功能</li>
<li>实验3.3 - 设备端实现调用物联网云平台API获取用户令牌</li>
<li>实验4.1 - 物联网云平台项目新增开放API——注册设备</li>
<li>实验6.1 - 物联网云平台项目新增开放API——增加设备消息</li>
</ol>

## 搭建和运行

1. clone本项目，并使用 IDEA 打开项目。

2. 进入IDEA 菜单， `File`->`Settings`，修改为你的`Maven`的安装路径和`settings.xml`的路径。

3. 使用 HeidiSQL 运行脚本`src/main/resources/V000__CREATE_DB_AND_USER.sql`，创建数据库`iotcloudtr`、数据库用户和授权。

4. 利用 Flyway 进行数据迁移，按顺序执行 `src/main/resources/db/migration` 下的 SQL 脚本。创建的表如下描述：

- `device` 设备表
- `device_msg` 设备消息表
- `token` 用户令牌表
- `user` 用户表
- `dev_shadow_desire` 期望设备影子
- `dev_shadow_reported` 报告设备影子
- `flyway_schema_history` flyway执行历史记录表

5. 使用 HeidiSQL 访问数据库`iotcloudtr`，检查是否存在以上表。

6. 启动`IoTCloudApplication`
   ，访问http://localhost:8098
7. 使用账号密码`zhangsan/123456`登录。

注意：记得修改`application.yml`以及`pom.xml`中的数据库连接信息（端口号---本人端口是3308）。

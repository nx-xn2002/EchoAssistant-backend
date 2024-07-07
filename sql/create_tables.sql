# 建库
create database if not exists echo;

use echo;

create table if not exists user
(
    id            bigint auto_increment
        primary key,
    username      varchar(256)                       null comment '用户昵称',
    avatar_url    varchar(1024)                      null comment '用户头像',
    gender        tinyint                            null comment '性别',
    user_password varchar(512)                       not null comment '密码',
    phone         varchar(128)                       null comment '电话',
    email         varchar(512)                       null comment '邮箱',
    user_role     int      default 1                 null comment '用户角色 0 - 管理员, 1 - 学生, 2 - 老师',
    create_time   datetime default CURRENT_TIMESTAMP null comment '创建时间',
    update_time   datetime default CURRENT_TIMESTAMP not null comment '更新时间',
    deleted_flag  tinyint  default 0                 not null comment '删除状态 默认0'
)
    comment '用户';

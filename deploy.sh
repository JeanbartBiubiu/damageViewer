#!/bin/bash

# 定义第一个同步函数
sync_jar() {
    rclone sync ./dataApi/target/dataApi-1.0-SNAPSHOT.jar qingliang:/root/docker/
}

# 定义第二个同步函数
sync_lib() {
    rclone sync ./dataApi/target/lib qingliang:/root/docker/lib
}

restart() {
    ssh root@qingliang 'sh /root/docker/restart.sh'
}
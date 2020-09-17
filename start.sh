# 拉取代码
git pull

# 安装依赖和打包
mvn clean install

# 删除容器
docker rm -f demo2 &> /dev/null

#启动容器
docker run -d --restart=on-failure:5\
    -p 80:80 \
    -v $PWD/dist:/usr/share/nginx/html \
    --name demo2 nginx
